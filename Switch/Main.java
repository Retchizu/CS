import java.util.Scanner;
import java.text.DecimalFormat;


public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,##0.00");
		double discount1 = 0, discount2 = 0, discount3 = 0;
		double fare = 0, additionalFareO = 0, additionalFareS = 0, additionalFareC = 0;
		double finalDisc;
		double finalFare;
		
		System.out.println("Enter Discount for Ordinary Passenger: ");
		discount1 = scanner.nextInt();
		System.out.println("Business class additional Fare for Ordinary Passenger: ");
		additionalFareO = scanner.nextDouble();
		System.out.println();
		System.out.println("Enter Discount for Student Passenger: ");
		discount2 = scanner.nextInt();
		System.out.println("Business class additional Fare for Student Passenger: ");
		additionalFareS = scanner.nextDouble();
		System.out.println();
		System.out.println("Enter Discount for Senior Citizen Passenger: ");
		discount3 = scanner.nextInt();
		System.out.println("Business class additional Fare for Senior Citizen Passenger:");
		additionalFareC = scanner.nextDouble();
		System.out.println();
		System.out.println("Enter fare:");
		fare = scanner.nextDouble();
		System.out.println("Passenger type [O,S,C]: ");
		char passenger = scanner.next().charAt(0);
		passenger = Character.toUpperCase(passenger);
		System.out.println("Travelling in business class [Y/N]: ");
		char bussClass = scanner.next().charAt(0);	
		bussClass = Character.toUpperCase(bussClass);
		scanner.close();
		
		switch(passenger) 
		{
		case 'O':
				double ordinaryCharge = (bussClass == 'Y')? additionalFareO : 0;
				finalDisc = fare * (discount1 / 100);
				finalFare = (fare - finalDisc) + ordinaryCharge;
				System.out.println();
				System.out.println("Discount: " + df.format(finalDisc) + " pesos");
				System.out.println("Business class charge: " + df.format(ordinaryCharge) + " pesos");
				System.out.println();
				System.out.println("New fare: " + df.format(finalFare) + " pesos");
				break;
		case 'S':
				double studentCharge = (bussClass == 'Y')? additionalFareS : 0;
				finalDisc = fare * (discount2 / 100);
				finalFare = (fare - finalDisc) + studentCharge;
				System.out.println();
				System.out.println("Discount: " + df.format(finalDisc) + " pesos");
				System.out.println("Business class charge: " + df.format(studentCharge) + " pesos");
				System.out.println();
				System.out.println("New fare: " + df.format(finalFare) + " pesos");
				break;
		case 'C' :
				double seniorCharge = (bussClass == 'Y')? additionalFareC : 0;
				finalDisc = fare * (discount3 / 100);
				finalFare = (fare - finalDisc) + seniorCharge;
				System.out.println();
				System.out.println("Discount: " + df.format(finalDisc) + " pesos");
				System.out.println("Business class charge: " + df.format(seniorCharge) + " pesos");
				System.out.println();
				System.out.println("New fare: " + df.format(finalFare) + " pesos");
				break;
		default : 
		System.out.println();
		System.out.println("Discount: " + df.format(0) + " pesos");
		System.out.println("Business class charge: " + df.format(0) + " pesos");
		System.out.println("\nNew fare: " + df.format(0) + " pesos");
        }
	}
}
