package HashMapHeap;

import java.util.*;
import java.util.stream.Collectors;

public class rat_in_jungle {

	public static int numRats(int[] answers) {
        // no answers therefore no rabbits
        if (answers.length == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;

        for (int i = 0; i < answers.length; i++) {
            int ans = answers[i];

            if (ans == 0) {
                sum += 1;  // only 1 rabbit has this color
                continue;
            }

            if (map.containsKey(ans) == false) { // this answer not accounted before
                map.put(ans, 0);
                sum += (ans + 1);  // if ans = 10, then 11 rabbits have this color

            } else {

                map.put(ans, map.get(ans) + 1);

                if (map.get(ans) == ans) {
                    map.remove(ans);
                }
            }
        }

        return sum;
    }
 
     //Dont make changes here
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int[] answers = new int[sc.nextInt()];
         for (int i = 0; i < answers.length; i++) {
             answers[i] = sc.nextInt();
         }
         System.out.println(numRats(answers));
     }
}
