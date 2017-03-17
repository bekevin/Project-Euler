package Problems;

import java.util.ArrayList;

//note this is very slow!!!!!!!!
public class Problema10 {
	public static void main(String[] args){
		//data
		ArrayList<Integer> List = new ArrayList<Integer>();
		long total = 0L;
		boolean prime = true;
		//loop through all numbers less then 2mil
		for(int i = 2; i<2000000; i++){
			prime = true;
			//checks if number is prime
			for(int j = 0; j<List.size();j++){
				if(i%List.get(j) == 0){
					prime = false;
					break;
				}
			}
			//if prime adds to list and adds to total
			if(prime){
				//System.out.println(i);
				total += (long)i;
				List.add(i);
			}
		}
		//answer is: 142913828922
		System.out.println(total);
	}
	
}
