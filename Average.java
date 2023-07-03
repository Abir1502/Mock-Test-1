import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the list of numbers (separated by spaces): ");
        String n= sc.nextLine();
		String[] numbers = n.split(" ");
		int sum=0; 
		int i=0;
		int count=0;
		do {
		int num = Integer.parseInt (numbers[i]);
				sum += num;
				count++;
		        i++;
			//sum=n*(n+1)/2;	
		}
		while(i<numbers.length); 
	    double average = (double) sum/count;
		        System.out.println("The average is: " + average);

	}

}