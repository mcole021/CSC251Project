import java.util.*;
import java.io.*;

public class Project_michael_cole
{
   public static void main(String[] args)
   {
      // declare variables
      String policyNumber = "";
      String providerName = "";
      String firstName = "";
      String lastName = "";
      String smokingStatus = "";
      int age = 0;
      double height = 0;
      double weight = 0;
      int smokers = 0;
      int nonSmokers = 0;
      
      // Scanner keyboard = new Scanner(System.in);
      
      /* prompt user to input information
      System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextLine();
            
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      age = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = keyboard.nextDouble();
      */
      
      try
      {
         // open a file
         File file  = new File("PolicyInformation.txt");
         
         Scanner inputFile = new Scanner(file);
         
         // array list to store objects
         ArrayList<Policy> policies = new ArrayList<Policy>();
         
         // process all of the contents of the file
         while(inputFile.hasNext())
         {
            policyNumber = inputFile.nextLine();
            providerName = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();
            age = inputFile.nextInt();
            smokingStatus = inputFile.nextLine();
            height = inputFile.nextDouble();
            weight = inputFile.nextDouble();
            
            // move lines down in file
            if(inputFile.hasNext())
            {
               inputFile.nextLine();
               inputFile.nextLine();
            }
               
            // create a policy object
            Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
            
            //
            policies.add(policy); 
         }
         
         // close a file
         inputFile.close();
         
         for(int i =0; i < policies.size(); i++)
            { 
               System.out.println();
               System.out.println("Policy Number: " + policies.get(i).getPolicyNumber());
               System.out.println("Provider Name: " + policies.get(i).getProviderName());
               System.out.println("Policyholder's First Name: " + policies.get(i).getFirstName());
               System.out.println("Policyholder's Last Name: " + policies.get(i).getLastName());
               System.out.println("Policyholder's Age: " + policies.get(i).getAge());
               System.out.println("Policyholder's Smoking Status: " + policies.get(i).getSmokingStatus());
               System.out.println("Policyholder's Height: " + policies.get(i).getHeight() + " inches");
               System.out.println("Policyholder's Weight: " + policies.get(i).getWeight() + " pounds");
               System.out.printf("Policyholder's BMI: %.2f\n", policies.get(i).getBMI());
               System.out.printf("Policy Price: $%.2f\n", policies.get(i).getPrice());
            }
      }
      
      // catch   
      catch(IOException ex)
      {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
      
      /* display all information
      System.out.println();
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
      */

   }
}