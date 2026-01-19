package youTube_Java_Program_2026;

import java.util.Arrays;

public class Key_value_Pair_Sorting {
/*Ques-->
 * 
 * String[] players = {
    "Virat:18",
    "Yuvaraj:12",
    "Dhoni:7",
    "Rohit:45",
    "Sachin:10"
};sort base on jersy Number
 * 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String[] players = {
		            "Virat:18",
		            "Yuvaraj:12",
		            "Dhoni:7",
		            "Rohit:45",
		            "Sachin:10"
		        };

		        Arrays.sort(players, (p1, p2) -> {
		            int n1 = Integer.parseInt(p1.split(":")[1]);
		            int n2 = Integer.parseInt(p2.split(":")[1]);
		            return Integer.compare(n1, n2);
		        });

		        for (String player : players) {
		            System.out.println(player);
		        }

	}

}
