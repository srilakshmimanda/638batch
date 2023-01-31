package Assignment_1;

public class primeandodd{

	public static void main(String[] args) {
//		Assignment-1
//		===========
//		Print 1 to 100 number
//		then check each number is EVEN or ODD...
//		print with EVEN or ODD text into console
//
//		Output:
//		------
//		1 is ODD
//		2 is EVEN
//		3 is ODD
		
		//a number is even if the number if the remainder after dividing by 2 is 0
		//else the number is odd
		
		for(int i = 1; i < 101; i++) {
			if(i % 2 == 0) {
				System.out.println(i + " is EVEN");
			}
			else {
				System.out.println(i + " is ODD");
			}
		}
	

	}

}
