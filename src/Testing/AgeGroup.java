package Testing;

public class AgeGroup {

	public static void main(String[] args) {
//		Assignment-3 (using if condition)
//		==============
//		Find the Age group based on the given number By using if-else block
//		int age = 79;
//		// 0<=2 infant
//		// 2<=12 Child
//		// 12<=25 youth
//		// 25<=59 adult
//		// 59<=100  senior citizen
//
//		output:
//		----------
//		senior citizen
		
		int age = 79;
		
		if(age > 0 && age <= 2) {
			System.out.println("infant");
		}
		else if(age > 2 && age <= 12) {
			System.out.println("child");
		}
		else if(age > 12 && age <= 25) {
			System.out.println("youth");
		}
		else if(age >= 25 && age <= 59) {
			System.out.println("adult");
		}
		else {
			System.out.println("senior citizen");
		}


	}

}
