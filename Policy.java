public class Policy
{
   // declare fields
   private String policyNumber;
   private String providerName;
   private PolicyHolder ph;
   
   // static field to track num of policy objects
   public static int numOfPolicies = 0;
   
   // constructor
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      ph = new PolicyHolder();
      numOfPolicies++;
   }
   
   /**
   Constructor that accepts arguments for each field
   @param policyNumber The Policy number
   @param providerName The Policy Provider's Name
   @param ph The PolicyHolder for the policy
   */
   public Policy(String policyNumber, String providerName, PolicyHolder ph)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.ph = new PolicyHolder(ph);
      numOfPolicies++;
   }
   
   // setters
   
   // @param pNumber The Policy Number
   public void setPolicyNumber(String policyNumber)
   {
      this.policyNumber = policyNumber;
   }

   // @param pName The Policy Provider's name
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }
   
   // @param ph The PolicyHolder for the policy
   public void setPolicyHolder(PolicyHolder ph)
   {
      this.ph = new PolicyHolder(ph);
   }  
   
   // Getters
   
   // @return The Policy Number
   public String getPolicyNumber()
   {
      return policyNumber;
   }

   // @return The Policy Provider's Name
   public String getProviderName()
   {
      return providerName;
   }
  
   // @return The PolicyHolder for the policy
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(ph);
   }
   
   // calculate the price of the policy and return price
   public double getPrice()
   {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double price = BASE_PRICE;
      
      if(ph.getAge() > AGE_THRESHOLD)
         price += ADDITIONAL_FEE_AGE;
         
      if(ph.getSmokingStatus().equalsIgnoreCase("smoker"))
         price += ADDITIONAL_FEE_SMOKING;
      
      if(ph.getBMI() > BMI_THRESHOLD)
         price += ((ph.getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI);
         
      return price;
   }
   
   /**
   @return A String that describes the Policy
   */
   public String toString()
   {
      return String.format("Policy Number: " + policyNumber +
                           "\nProvider Name: " + providerName +
                           "\n" + ph +
                           "\nPolicy Price: $%.2f", getPrice());
   }
}