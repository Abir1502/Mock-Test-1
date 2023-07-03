import java.util.Scanner;
public class RealNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a;
		System.out.println("Enter a Number");
		a= sc.nextInt();
		if(a>0) {
			System.out.println("Posative Number");}
			else if(a<0) {
			System.out.println("Negative Number");	
		}
			else System.out.println("Number is zero");
	}

}
