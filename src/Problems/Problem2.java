package Problems;

public class Problem2 {
	public static void main(String[] args){
		//data
		int FN1 = 1;
		int FN2 = 2;
		int total = 0;
		//while loop
		while(FN1 < 4000000 && FN2 <4000000){
			//even only
			if(FN1%2 ==0){
				total += FN1;
			}
			//even only
			if(FN2%2 ==0){
				total += FN2;
			}
			FN1 = FN1+FN2;
			FN2 = FN1+FN2;
		}
		//catch exception that can occure
		if(FN1 < 4000000){
			if(FN1%2 ==0){
				total += FN1;
			}
		}
		//prints answer: 4613732
		System.out.println(total);
	}
	
}
