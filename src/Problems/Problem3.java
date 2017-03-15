package Problems;

import java.math.*;
import java.util.ArrayList;

public class Problem3 {
	public static void main(String[] args){
		//data
		ArrayList<Integer> AList = new ArrayList<Integer>();
		int largestPrime = -1;
		int Counter = 0;
		boolean Prime = true;
		long number = 600851475143L;
		//checks for all numbers between 2 and sqrt of big number
		for(int i = 2; i < Math.sqrt(number); i++){
			Prime = true;
			//check for prime
			for(int j = 0;j<Counter; j++){
				//this is probably where its becoming slow
				if(i % AList.get(j) == 0){
					Prime = false;
					break;
				}
			}
			//if prime adds to list
			if(Prime){
				AList.add(i);
				Counter++;
			}
			//if prime and devides big number then new largest prime
			if(number%i == 0 && Prime){
				largestPrime = i;
			}
		}
		//prints out answer: 6857
		System.out.println(largestPrime);
	}
}
