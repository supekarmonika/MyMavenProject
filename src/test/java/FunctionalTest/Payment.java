package FunctionalTest;

import org.testng.annotations.Test;

public class Payment {
  @Test
  public void varifyElectronicItemProductPayment()
  {
	  System.out.println("Check all electronic Payment");
  }
  @Test
  public void varifyUPIPayment()
  {
	  System.out.println("Check all Upi payment");
  }
  @Test
  public void varifyDebitCardPayment()
  {
	  System.out.println("Check all Debit card payment");
  }
  @Test
  public void varifyCreditCardPayment()
  {
	  System.out.println("Check all Creadit card payment");
  }
  public void varifyNetBanking()
  {
	  System.out.println("Check all Net banking payment");
  }
}
