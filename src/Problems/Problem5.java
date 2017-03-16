package Problems;

public class Problem5 {
	public static void main(String[] args){
		//data
		int count = 2520;
		boolean test = true;
		//while it hasn't be found
		while(test){
			//loop through 2-20
			for(int i = 2;i<21;i++){
				//if its not divisable break
				if(count%i!=0){
					count+=20;
					break;
				}
				//if solution found end
				if(i == 20){
					test = false;
					break;
				}
			}
		}
		//answer is: 232792560
		System.out.println(count);
	}
}
