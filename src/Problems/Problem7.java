package Problems;

import java.util.ArrayList;

public class Problem7 {
	public static void main(String[] args) {
		//data
		int count = 0;
		int number = 1;
		ArrayList<Integer> List = new ArrayList<Integer>();
		boolean prime = true;
		
		//tell you hit the 10001prime
		while (count < 10001) {
			number++;
			prime = true;
			//checks to see if it is a prime
			for(int i = 0; i<List.size();i++){
				if(number%List.get(i)==0){
					prime = false;
				}
			}
			//adds to list if it is a prime
			if(prime){
				List.add(number);
				count++;
			}
		}
		//answer is: 104743
		System.out.println(number);
	}
}
