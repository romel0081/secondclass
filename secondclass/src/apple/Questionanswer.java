package apple;

public class Questionanswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ques::29-- Write a java code to disply below,need to use two for loop?
		//1
		//2 3
		//4 5 6
		//7 8 9 10
		
		
		//Ques 35::--Write a java program to check a given String "peoplentech" is start with "people"
		String a1 = "peoplentech";
		if(a1.contains("people")) {
			System.out.println("It is containing ");
		}else {
			System.out.println("It is not containing ");
		}
		
		//Ques:: 28---Write a java code to find out sum of 10-99?
		
		int a = 0;
		for(int i = 10;i<100;i++) {
			a=a+i;
		}
System.out.println("sum of 10 t0 99 is "+a);
//Ques::Write code to find out given int is positive or negative number?
int b = 10;
int c = -12;
if (b > 0) {
	System.out.println("b is  positive number");
} else if (b < 0) {
	System.out.println("b is negative number ");
}
if (c > 0) {
	System.out.println("c is positive number");
} else if (c < 0) {
	System.out.println("c is negative number");
}
if (b % 2 == 0) {
	System.out.println("b is even number");
} else {
	System.out.println("b is odd number");
}

	}

}
