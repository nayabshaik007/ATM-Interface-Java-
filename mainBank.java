package pak1;
import java.util.*;
import java.time.*;

public class mainBank 
{
	public static float balance = 0;
	public final static int pinCode = 1234;
	
	public static void main(String[] args) throws Exception 
	{
	   Scanner s = new Scanner(System.in);
	   try(s;)
	   {
		   
		  for(int i=0; i<=63; i++)
		  {
			  System.out.print("*"+" ");
			  Thread.sleep(30);
		  }
		  
		  System.out.println("\n");
		  
		  String bankName = "...... WELCOME TO PEOPLE's BANK ......";
		  int len = bankName.length();
		  
		  for(int i=0; i<=8; i++)
		  {
			  System.out.print("\t");
			  
			  if(i==5)
			  {
				  for(int j=0; j<len; j++)
				  {
					  System.out.print(bankName.charAt(j));
					  Thread.sleep(100);
					  
				  }// end of inner for-loop
				  
			  }// end of if
			  
		  }// end of outer for-loop
		  
		  System.out.println("\n");
		  
		  for(int i=0; i<=63; i++)
		  {
			  System.out.print("*"+" ");
			  Thread.sleep(30);
		  }
		  System.out.println("\n");
		  		  
		  for(int i=0; i<=12; i++)
		  {
			  System.out.print("\t");
			  if(i==12) 
			  {
				  System.out.println("Date : "+ LocalDate.now());
			  }
		  }// end of for-loop
		  
		  System.out.println("Insert your card......");
		  System.out.println();
		  Thread.sleep(3000);
		  System.out.print("Enter PIN number : ");
		  int pin = Integer.parseInt(s.nextLine());
		  
		  if(pinCode == pin)
		  {
			 while(true)
			 {
				 System.out.println("\n........  CHOICE ........");
				 System.out.println("\n1.Balance Enquiry"+"\t\t2.Deposite"+"\n3.Withdraw"+"\t\t\t4.Exit");
				 System.out.print("\nEnter your option: ");
   	             int ch = Integer.parseInt(s.nextLine());
				 
   	             switch(ch)
				 {
				 case 1 :  
					      System.out.println("\nYour account balance is : "+balance);
					 break;
					 
				 case 2 : System.out.print("\nEnter amount : ");
			              float amt1 = Float.parseFloat(s.nextLine());
			              
			              if(amt1>0 && amt1%100==0)
			              {
			            	  Calculation cl1 = new Calculation();
			            	  cl1.deposite(amt1, balance);
			              }
			              else
			              {
    	                	  System.out.println("Invalid amount");
			              }
					 break;
					 
				 case 3 : System.out.print("\nEnter amount to withdraw: ");
				          float amt2 = Float.parseFloat(s.nextLine());
				          
				          if(amt2>0 && amt2%100==0)
				          {
				        	 Calculation cl2 = new Calculation();
				        	 cl2.withdraw(amt2, balance);
				          }
				          else
				          {
				        	  System.out.println("\nInvalid amount");  
				          }
					 break;
					 
				 case 4 : String tnx = ".......Thank you come again ......";
					      int len2 = tnx.length();
					      System.out.println("\n");  
					      for(int i=0; i<=8; i++)
						  {
							  System.out.print("\t");
							  
							  if(i==5)
							  {
								  for(int j=0; j<len2; j++)
								  {
									  System.out.print(tnx.charAt(j));
									  Thread.sleep(100);
									  
								  }// end of inner for-loop
								  
							  }// end of if
							  
						  }// end of outer for-loop
					     
				          System.exit(0);
					 break;
					 
			     default : System.out.println("Enter valid option!!!");
			       
				 }// end of switch
			 }// end of while-loop
		  }// end of if
		  else
		  {
			  System.out.println("\n\n\t\t\t\t\t\t ........ You entered wrong Pin!!! ........\n");
			  System.out.println("\n\n\t\t\t\t\t\t ........ Try again ........");
			  
		  }// end of else

	   }// end of try with resources
	   
	}
	
}










