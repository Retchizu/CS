//Richmond A. Baltazar
//1BSCS-1
//October 25, 2022


import java.util.*;
public class Main {

	public static void main(String[] args) {
	     int number = 0;
	     int increase = 0;
	     Scanner scanner = new Scanner(System.in);
	     System.out.println("Enter Number: ");
	     number = scanner.nextInt();
	     
	     while(number != 0){
	        increase++;
	        System.out.print(number + " " + increase + " ");
	        number--;
	     }
	}
}
