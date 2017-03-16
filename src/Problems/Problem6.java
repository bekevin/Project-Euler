package Problems;

public class Problem6 {
	public static void main(String[] args){
		int sumOfSquares = 0;
		int squareOfSums = 0;
		for(int i = 1; i<101;i++){
			sumOfSquares += (i*i);
			squareOfSums += i;
		}
		System.out.println((squareOfSums*squareOfSums) - sumOfSquares);
	}
}
