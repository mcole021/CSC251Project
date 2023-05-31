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
   
   // constructor accepting arguments
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
   public void setPolicyNumber(String pNumber)
   {
      policyNumber = pNumber;
   }
   
   public void setProviderName(String pName)
   {
      providerName = pName;
   }
   
   public void setFirstName(String fName)
   {
      firstName = fName;
   }
   
   public void setLastName(String lName)
   {
      lastName = lName;
   }
   
   public void setAge(int a)
   {
      age = a;
   }
   
   public void setSmokingStatus(String sStatus)
   {
      smokingStatus = sStatus;
   }
   
   public void setHeight(double h)
   {
      height = h;
   }
   
   public void setWeight(double w)
   {
      weight = w;
   }
   
   // getters
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   public String getProviderName()
   {
      return providerName;
   }
   
   public String getFirstName()
   {
      return firstName;
   }
   
   public String getLastName()
   {
      return lastName;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   public double getHeight()
   {
      return height;
   }
   
   public double getWeight()
   {
      return weight;
   }
   
   /* calculate and return BMI
      @param weight 
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