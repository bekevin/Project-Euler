package Problems;

public class Problem4 {
	public static void main(String[] args){
		//data
		int one = 0;
		int two = 0;
		//starts double for loop to check for biggest palindrome multiplier
		for(int i = 999; i>100; i--){
			for(int j = 999; j>100; j--){
				//is it a palindrome?
				if(isPalindrome((i*j))){
					//check to see if its the biggest
					if(i*j>one*two){
						one = i;
						two = j;
					}
				}
			}
		}
		//prints answer: 993 913
		System.out.println(one+"  "+two);
	}
	public static boolean isPalindrome(int input){
		String output;
		//turns string to integer
		output = Integer.toString(input);
		//loops to see if it is a palindrome
		for(int i = 0; i<output.length()/2; i++){
			if(!output.substring(i,i+1).equals(output.substring((output.length()-1)-i, output.length()-i))){
				return false;
			}
		}
		
		return true;
	}
}
