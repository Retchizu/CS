//1BSCS-1
//10/11/22
//Coded by: Richmond A. Baltazar

import java.util.Scanner;
import java.text.DecimalFormat;

public class Cellphone 
{
	public static void main(String[] args) 
	{
		double priceOne = 0, priceTwo = 0, priceThree = 0, finalPrice = 0,totalAmount = 0, finalDisc;
		String finalProduct = "",paymentString = "";
		double installment3 = 0, installment6 = 0, installment12 = 0, discount = 0, finalInterest =0;
		char item;
		int paymentMode = 0;
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.00");
    
		//Products
       	System.out.println("Sales Input\n");
		System.out.println("Enter Product 1:");
		String productOne = scanner.nextLine();
		System.out.println("Enter Price:");
		priceOne = scanner.nextDouble();
        System.out.println();
		System.out.println("Enter Product 2:");
		scanner.nextLine();
		String productTwo = scanner.nextLine();
		System.out.println("Enter Price:");
       	System.out.println();
		priceTwo = scanner.nextDouble();
		System.out.println("Enter Product 3:");
		scanner.nextLine();
		String productThree= scanner.nextLine();
		System.out.println("Enter Price:");
		priceThree = scanner.nextDouble();

        	System.out.println("\nInput Mode of Payment Terms \n");
		
		//Payment Terms
		System.out.println("Cash Discount: ");
		discount = scanner.nextDouble();
		
		System.out.println("\tYou input " + discount + "% Discount for Cash ");
		
		System.out.println("3 Months Installment:");
		installment3 = scanner.nextDouble();
		
		
		System.out.println("\tYou input " + installment3 + "% Interest for 3 Months Installment");
		
		System.out.println("6 Months Installment:");
		installment6 = scanner.nextDouble();
		
		System.out.println("\tYou input " + installment6 + "% Interest for 6 Months Installment");
		
		System.out.println("12 Months Installment:");
		installment12 = scanner.nextDouble();
		
		System.out.println("\tYou input " + installment12 + "% Interest for 12 Months Installment");
		
		//Mode of Payment
		System.out.println("\nMain Menu\n");
		System.out.println("Press I/i:" + productOne + "\t\t\t\t" + "$" + df.format(priceOne));
		System.out.println("Press S/s:" + productTwo + "\t\t" + "$" + df.format(priceTwo));
		System.out.println("Press X/x:" + productThree + "\t" + "$" + df.format(priceThree));

        	System.out.println();
        
		System.out.println("Enter Item: ");
		item=scanner.next().toLowerCase().charAt(0);
		
		paymentMode = scanner.nextInt();
		
		switch(item) 
		{
			case 'i': 
					System.out.println("\tYour Item is " + productOne + "\n");
					finalProduct = productOne;
					finalPrice = priceOne;
					System.out.println("Select mode of Payment\n");
		    		System.out.println("Press 1:Cash\t\t\t\t\t" + discount + "% Discount");
		    		System.out.println("Press 2:3 Months Installment\t" + installment3 + "% Interest");
		    		System.out.println("Press 3:6 Months Installment\t" + installment6 + "% Interest");
		    		System.out.println("Press 4:12 Months Installment\t" + installment12 + "% Interest");
		    		
		    		System.out.println("\nEnter Mode of Payment:");
		    		switch(paymentMode) 
		    		{
		    		case 1 : 
		    				paymentString = "Cash";
		    				discount = discount / 100;
		    				finalDisc = finalPrice * discount;
		                    finalInterest = 0;
		                    totalAmount = finalPrice - finalDisc;
		    				break;
		    		case 2: 
			    			paymentString = "3 Months Installment";
			    			installment3 = installment3 / 100;
			    			finalDisc = finalPrice * installment3;
			    			totalAmount = finalPrice + finalDisc;
			    			finalInterest = totalAmount / 3;	
			    			break;
		    		case 3:
			    			paymentString = "6 Months Installment";
			    			installment6 = installment6 / 100;
			    			finalDisc = finalPrice * installment6;
			    			totalAmount = finalPrice + finalDisc;
			    			finalInterest = totalAmount / 6;	
			    			break;
		    		case 4: 
			    			paymentString = "12 Months Installment";
			    			installment12 = installment12 / 100;
			    			finalDisc = finalPrice * installment12;
			    			totalAmount = finalPrice + finalDisc;
			    			finalInterest = totalAmount / 12;	
			                
			    			break;
		            default:
			            	paymentString = "Cash";
			            	discount = discount / 100;
		    				finalDisc = finalPrice * discount;
		                    finalInterest = 0;
		                    totalAmount = finalPrice - finalDisc;
		                    break;
		    		}
		    		
				 	break;
			case 's': 
					System.out.println("\tYour Item is " + productTwo + "\n");
					finalProduct = productTwo;
					finalPrice = priceTwo;
					System.out.println("Select mode of Payment\n");
		    		System.out.println("Press 1:Cash\t\t\t\t\t" + discount + "% Discount");
		    		System.out.println("Press 2:3 Months Installment\t" + installment3 + "% Interest");
		    		System.out.println("Press 3:6 Months Installment\t" + installment6 + "% Interest");
		    		System.out.println("Press 4:12 Months Installment\t" + installment12 + "% Interest");
		    		System.out.println("\nEnter Mode of Payment:");
		    		switch(paymentMode) 
		    		{
		    		case 1 : 
			    			paymentString = "Cash";
			    			discount = discount / 100;
			    			finalDisc = finalPrice * discount;			    		
		                    finalInterest = 0;
		                    totalAmount = finalPrice - finalDisc;
		                    break;
		    		case 2: 
			    			paymentString = "3 Months Installment";
			    			installment3 = installment3 / 100;
			    			finalDisc = finalPrice * installment3;
			    			totalAmount = finalPrice + finalDisc;
			    			finalInterest = totalAmount / 3;	
			    			break;
		    		case 3:
			    			paymentString = "6 Months Installment";
			    			installment6 = installment6 / 100;
			    			finalDisc = finalPrice * installment6;
			    			totalAmount = finalPrice + finalDisc;
			    			finalInterest = totalAmount / 6;	
			    			break;
		    		case 4: 
		    			paymentString = "12 Months Installment";
			    			installment12 = installment12 / 100;
			    			finalDisc = finalPrice * installment12;
			    			totalAmount = finalPrice + finalDisc;
			    			finalInterest = totalAmount / 12;		                
			    			break;
		            default:
		            		paymentString = "Cash";
		            		discount = discount / 100;
			    			finalDisc = finalPrice * discount;
	                    	finalInterest = 0;
	                    	totalAmount = finalPrice - finalDisc;
	                    	break;
		    		}
		    		
				  	break;
			case 'x': 
					System.out.println("\tYour Item is " + productThree + "\n");
					finalProduct = productThree;
					finalPrice = priceThree;
					System.out.println("Select mode of Payment\n");
		    		System.out.println("Press 1:Cash\t\t\t\t\t" + discount + "% Discount");
		    		System.out.println("Press 2:3 Months Installment\t" + installment3 + "% Interest");
		    		System.out.println("Press 3:6 Months Installment\t" + installment6 + "% Interest");
		    		System.out.println("Press 4:12 Months Installment\t" + installment12 + "% Interest");
		    		System.out.println("\nEnter Mode of Payment:");
		    		switch(paymentMode) 
		    		{
		    		case 1 : 
		    				paymentString = "Cash";
		    				discount = discount / 100;
		    				finalDisc = finalPrice * discount;
		                    finalInterest = 0;
		                    totalAmount = finalPrice - finalDisc;
		    				break;
		    		case 2: 
			    			paymentString = "3 Months Installment";
			    			installment3 = installment3 / 100;
			    			finalDisc = finalPrice * installment3;
			    			totalAmount = finalPrice + finalDisc;
			    			finalInterest = totalAmount / 3;	
			    			break;
		    		case 3:
			    			paymentString = "6 Months Installment";
			    			installment6 = installment6 / 100;
			    			finalDisc = finalPrice * installment6;
			    			totalAmount = finalPrice + finalDisc;
			    			finalInterest = totalAmount / 6;	
			    			break;
		    		case 4: 
			    			paymentString = "12 Months Installment";
			    			installment12 = installment12 / 100;
			    			finalDisc = finalPrice * installment12;
			    			totalAmount = finalPrice + finalDisc;
			    			finalInterest = totalAmount / 12;	
			    			break;
		            default:
			            	paymentString = "Cash";
			            	discount = discount / 100;
		    				finalDisc = finalPrice * discount;
		                    finalInterest = 0;
		                    totalAmount = finalPrice - finalDisc;
		                    break;
		    		}
					break;
			default: 
			System.out.println("\tYour Item is NO ITEM\n");
            
			paymentString = "N/A";
			finalProduct = "N/A";
			finalPrice = 0;
            finalDisc = 0;
            finalInterest = 0;
            totalAmount = finalPrice + finalDisc;
            
		}
        scanner.close();
		System.out.println("Mode of Payment:\t\t\t\t" + paymentString);
		System.out.println("Item:\t\t\t\t\t\t\t" + finalProduct);
		System.out.println("Price:\t\t\t\t\t\t\t" + "$" + df.format(finalPrice));
		System.out.println("Discount/Interest:\t\t\t\t" + "$" + df.format(finalDisc));
		System.out.println("Total Amount:\t\t\t\t\t" +  "$" +df.format(totalAmount));
		System.out.println("Monthly Amortization:\t\t\t" + "$" + df.format(finalInterest));
	}
}
