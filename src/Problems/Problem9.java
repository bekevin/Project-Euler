package Problems;

import java.math.*;

public class Problem9 {
	public static void main(String[] args){
		//data
		double temp = 0;
		int total = 1000;
		//for loop to go through all possibilities
		for(int i = 1; i < 1000;i++){
			for(int j = 1; j < 1000; j++){
				temp = 0;
				temp = i*i +j*j;
				temp = Math.sqrt(temp);
				//if found print and exit
				if(total == temp + i + j){
					//answer is:31875000.0
					System.out.printf(i+" "+j+" "+temp + " = " + "%.1f",i*j*temp);
					System.exit(0);
				}
			}
		}
	}
}
