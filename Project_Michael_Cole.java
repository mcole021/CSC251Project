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
         policyList.add(new Policy(policyNumber, providerName, new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight)));
      
      }
      
      // print out information about each Policy object from the file
      for(Policy policy : policyList)
      {
          System.out.println(policy);
          System.out.println();
          if(policy.getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker"))//keep track of the number of smokers
            numSmokers++;
      }
      
      //print out the number of Policy objects
      System.out.println("There were " + Policy.numOfPolicies + " Policy objects created.");
      
      //print out the number of smokers and non-smokers
      System.out.println("The number of policies with a smoker is: " + numSmokers);
      System.out.println("The number of policies with a non-smoker is: " + (policyList.size() - numSmokers));
   }
}