//Richmond A. Baltazar
//1BSCS-1
//October 25, 2022


import java.util.*;
public class Main {

	public static void main(String[] args) {
		        
		int number = 0,oddNumber = 1, oddNth = 1;
        int nth = 0, sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        number = scanner.nextInt();
        nth = 2 * number - 1;
        System.out.print("Odd numbers are ");

        do{
            if(oddNumber == 1){
                System.out.print(oddNumber+ " ");
                sum += oddNumber;
            }
            oddNumber += 2;
            oddNth += 2;
            sum += oddNumber;
            System.out.print(oddNumber + " ");
        }while(oddNth != nth);
        System.out.println("\nThe sum of odd numbers up to " + number + " term is " + sum);
		
	}
}
