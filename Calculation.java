package pak1;

public class Calculation 
{
   public void deposite(float amt, float bal)
   {
	   System.out.println("\nAmount Deposited Successfully......");
	   float newBal1 = amt+bal;
	   mainBank.balance=newBal1;
	  // System.out.println("Balance Amount: "+(newBal));
   }
   
   public void withdraw(float amt, float bal)
   {
	   
	   if(amt<=mainBank.balance)
	   {
		   System.out.println("\nAmount Withdrawn Successfully......");
		   float newBal2 = bal-amt;
		   mainBank.balance=newBal2;
		   //System.out.println("\nAccount balance : "+(newBal2));
	   }
	   else
	   {
		   System.out.println("Insufficient funds....");
	   }
   }
}
