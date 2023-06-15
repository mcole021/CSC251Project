public class Policy
{
   // declare fields
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private String smokingStatus;
   private int age;
   private double height;
   private double weight;
   
   // constructor
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      firstName = "";
      lastName = "";
      smokingStatus = "";
      age = 0;
      height = 0;
      weight = 0;
   }
   
   /** constructor accepting arguments
   @param pNumber The Policy number
   @param pName The Policy Provider's Name
   @param fName The Policyhodler's first name
   @param lName The Policyholder's last name
   @param a The Policyholder's age
   @param sStatus The Policyholder's smoking status
   @param h The Policyholder's height
   @param w The Policytholder's weight
   */
   public Policy(String pNumber, String pName, String fName, String lName, int a, String sStatus, double h, double w)
   {
      policyNumber = pNumber;
      providerName = pName;
      firstName = fName;
      lastName = lName;
      age = a;
      smokingStatus = sStatus;
      height = h;
      weight = w;
   }
   
   // setters
   
   //@return The Policy Number
   public void setPolicyNumber(String pNumber)
   {
      policyNumber = pNumber;
   }
   
   // @return The Policy Provider's Name
   public void setProviderName(String pName)
   {
      providerName = pName;
   }
   
   // @return The Policyholder's first name
   public void setFirstName(String fName)
   {
      firstName = fName;
   }
   
   // @return The Policyholder's last name
   public void setLastName(String lName)
   {
      lastName = lName;
   }
   
   // @return The Policyholder's age
   public void setAge(int a)
   {
      age = a;
   }
   
   // @return The Policyholder's smoking status
   public void setSmokingStatus(String sStatus)
   {
      smokingStatus = sStatus;
   }
   
   // @return The Policyholder's height
   public void setHeight(double h)
   {
      height = h;
   }
   
   // @return The Policyholder's weight
   public void setWeight(double w)
   {
      weight = w;
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
   
   // @param fName The Policy Provider's first name
   public String getFirstName()
   {
      return firstName;
   }
   
   // @param lName The Policy Provider's last name
   public String getLastName()
   {
      return lastName;
   }
   
   // @param a The Policy Provider's age
   public int getAge()
   {
      return age;
   }
   
   // @param sStatus The Policy Provider's smoking status
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   // @param h The Policy Provider's height
   public double getHeight()
   {
      return height;
   }
   
   // @param w The Policy Provider's weight
   public double getWeight()
   {
      return weight;
   }
   
   /* calculate and return BMI
      @return The BMI of the Policyholder
   */
   public double getBMI()
   {
      final double BMIF = 703;
      
      return (weight * BMIF) / (height * height);
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
}