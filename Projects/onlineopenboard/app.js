var express = require('express');
var http = require('http');
var socketIo = require('socket.io');

var app = express();
var httpServer = http.Server(app);
var ioServer = socketIo(httpServer);
var allSockets = {};

app.use(express.static(__dirname + '/public'));

function httpServerConnected(){
	console.log('Http Server started');
}

function ioServerConnected(socket){
	console.log('A new socket connection');

	socket.on('user-joined', userJoined);
	socket.on('disconnect', userLeft);	
	socket.on('message', messageReceived);	
}

function userJoined(user){
	console.log(user + ' joined.');

	allSockets[user] = this;
	var allUsers = Object.keys(allSockets);
	ioServer.emit('user-joined', allUsers);	
}

function userLeft(){
	var user = null;
	var allKeys = Object.keys(allSockets);

	for(i = 0; i < allKeys.length; i++){
		if(allSockets[allKeys[i]] === this){
			user = allKeys[i];
		}
	}

	console.log(user + ' left.');
	delete allSockets[user];

    this.broadcast.emit('user-left', user);	
}

function messageReceived(data){
	console.log(data);

	if(data.to === 'public'){
		this.broadcast.emit('message', data);
	}
	else{
		allSockets[data.to].emit('message', data);
	}	
}

httpServer.listen(5002, httpServerConnected);
ioServer.on('connection', ioServerConnected);