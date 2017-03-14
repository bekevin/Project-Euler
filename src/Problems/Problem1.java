package Problems;

public class Problem1 {
	public static void main(String[] args){
		//holds the total
		int total = 0;
		//loops through all number 3 to 999
		for(int i = 3; i<1000; i++){
			if(i%3 == 0 || i%5 == 0){
				total += i;
			}
		}
		//answer: 233168
		System.out.println(total);
	}
}
