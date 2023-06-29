public class PolicyHolder
{

   private String firstName;
   private String lastName;
   private String smokingStatus;
   private int age;
   private double height;
   private double weight;
   
   // constructor
   public Policy()
   {
      firstName = "";
      lastName = "";
      smokingStatus = "";
      age = 0;
      height = 0;
      weight = 0;
   }
   
   /** constructor accepting arguments
   @param fName The Policyhodler's first name
   @param lName The Policyholder's last name
   @param a The Policyholder's age
   @param sStatus The Policyholder's smoking status
   @param h The Policyholder's height
   @param w The Policytholder's weight
   */
   public Policy(String fName, String lName, int a, String sStatus, double h, double w)
   {
      firstName = fName;
      lastName = lName;
      age = a;
      smokingStatus = sStatus;
      height = h;
      weight = w;
   }
   
   // setters
   
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
}