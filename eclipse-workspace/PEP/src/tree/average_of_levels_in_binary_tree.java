package tree;

import java.util.*;

public class average_of_levels_in_binary_tree {


	 public static class TreeNode {

	 	 int val;
	 	 TreeNode left;
	 	 TreeNode right;

	 	 TreeNode(int x) {
	 	 	 val = x;
	 	 }
	 }

	 public static List<Double> averageOfLevels(TreeNode root) {
	 	 // Write your code here
		 ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>();
		 queue.add(root);
		 List<Double> ls  =  new ArrayList<Double>();
		 while(queue.size()>0)
		 {
			 double num =  0 ;
			 double sum = 0;
			 int count = queue.size();
			 while(count-->0)
			 {
				 root = queue.removeFirst();
				 sum+=root.val;
				 num++;
				 if(root.left!=null)
					 queue.add(root.left);
				 if(root.right!=null)
					 queue.add(root.right);	
			 }
			 ls.add((sum/num));
		 }
		 return ls;
	 }

	 public static void main(String[] args) {
	 	 Scanner sc = new Scanner(System.in);
	 	 String input = sc.nextLine().trim();

	 	 Integer[] treeArr = inputSplitSpace(input);
	 	 TreeNode root = createTree(treeArr);
	 	 List<Double> res = averageOfLevels(root);
	 	 for (Double v : res) {
	 	 	 System.out.print(v + " ");
	 	 }
	 	 System.out.println();

	 }

	 // utility function, don't change its code
	 public static Integer[] inputSplitSpace(String str) {
	 	 String[] sArr = str.split(" ");
	 	 Integer[] arr = new Integer[sArr.length];
	 	 for (int i = 0; i < arr.length; i++) {
	 	 	 arr[i] = sArr[i].equals("null") ? null : Integer.parseInt(sArr[i]);
	 	 }
	 	 return arr;
	 }

	 // utility function to create a tree, don't change its code.
	 public static TreeNode createTree(Integer[] arr) {
	 	 ArrayDeque<TreeNode> que = new ArrayDeque<>();
	 	 TreeNode root = new TreeNode(arr[0]);
	 	 que.addLast(root);
	 	 int i = 1;
	 	 while (!que.isEmpty() && i < arr.length) {
	 	 	 TreeNode nn = que.removeFirst();

	 	 	 if (i < arr.length && arr[i] != null) {
	 	 	 	 TreeNode n = new TreeNode(arr[i]);
	 	 	 	 nn.left = n;
	 	 	 	 que.addLast(n);
	 	 	 }
	 	 	 i++;

	 	 	 if (i < arr.length && arr[i] != null) {
	 	 	 	 TreeNode n = new TreeNode(arr[i]);
	 	 	 	 nn.right = n;
	 	 	 	 que.addLast(n);
	 	 	 }
	 	 	 i++;
	 	 }

	 	 return root;
	 }

}
