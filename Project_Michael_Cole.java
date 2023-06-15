import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Project_Michael_Cole
{   
   public static void main(String[] args) throws IOException
   {
      //declare variables
      String policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      int numSmokers = 0;
   
      // arraylist to store objects
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      
      // create the file and open it
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      // process all information in file
      while(inputFile.hasNext())
      {
      
         policyNumber = inputFile.nextLine();
         providerName = inputFile.nextLine();
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         age = inputFile.nextInt();
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
         
         // check for end of file
         if(inputFile.hasNext())
            inputFile.nextLine();
         if(inputFile.hasNext())
            inputFile.nextLine();
            
         // creating the policy object as well as adding to arraylist
         policyList.add(new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight));
      
      }
      
      // print out information about each Policy object from the file
      for(Policy policy : policyList)
      {
         // display information about the policy
         System.out.println("Policy Number: " + policy.getPolicyNumber());
         System.out.println("Provider Name: " + policy.getProviderName());
         System.out.println("Policyholder's First Name: " + policy.getFirstName());
         System.out.println("Policyholder's Last Name: " + policy.getLastName());
         System.out.println("Policyholder's Age: " + policy.getAge());
         System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
         System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
         System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
         System.out.printf("Policyholder's BMI: %.2f\n", policy.getBMI());
         System.out.printf("Policy Price: $%.2f\n", policy.getPrice());
         System.out.println();
         
         // keep track of number of smokers
         if(policy.getSmokingStatus().equalsIgnoreCase("smoker"))
            numSmokers++;
      }
      
      //print out the number of smokers and non-smokers
      System.out.println("The number of policies with a smoker is: " + numSmokers);
      System.out.println("The number of policies with a non-smoker is: " + (policyList.size() - numSmokers));
   }
}