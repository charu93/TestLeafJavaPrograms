package week1.day2;



public class PrimeProgram {
public static void main(String[] args) {
	//divisible by 1 and itself
	
	int n=0;
	int count=0;
	if (n>=1) {
		for (int i = 1; i <=n; i++) {
		if (n%i==0) 
			count++;
		
	}if (count==2) {
		System.out.println("Prime Number");
	}
	else {
		System.out.println("Entered number is not a prime");
	}
	}
	else {
		System.out.println("Enter a number greater than 0");
	}
	
}
}
