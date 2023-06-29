public class Policy
{
   // declare fields
   private String policyNumber;
   private String providerName;
   
   // static field to track num of policy objects
   public static int numOfPolicies = 0;
   
   // constructor
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      numOfPolicies++;
   }
   
   /** constructor accepting arguments
   @param pNumber The Policy number
   @param pName The Policy Provider's Name
   */
   public Policy(String pNumber, String pName)
   {
      policyNumber = pNumber;
      providerName = pName;
      numOfPolicies++;
   }
   
   // setters
   
   //@return The Policy Number
   public void setPolicyNumber(String pNumber)
   {
      policyNumber = pNumber;
   }
   
   // Getters
   
   // @param pNumber The Policy Number
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   // @param pName The Policy Provider's name
   public String getProviderName()
   {
      return providerName;
   }
   
   // calculate the price of the policy and return price
   public double getPrice()
   {
      final double baseP = 600;
      final double ageFee = 75;
      final double smokeFee = 100;
      final double bmiFee = 20;
      final int ageLimit = 50;
      final int bmiLimit = 35;
      
      double price = baseP;
      
      if(age > ageLimit) 
         price += ageFee;
         
      if(smokingStatus.equalsIgnoreCase("smoker")) 
         price += smokeFee;
            
      //call the getBMI method
      if(getBMI() > bmiLimit) //BMI over 35
         price += ((getBMI() - bmiLimit) * bmiFee); //additional BMI fee - 20
         
      return price;
   }
   
   /**
   @return A String that describes the Policy
   */
   public String toString()
   {
      return String.format("Policy Number: " + policyNumber +
                           "\nProvider Name: " + providerName +
                           "\nPolicy Price: $%.2f", getPrice());
   }
}