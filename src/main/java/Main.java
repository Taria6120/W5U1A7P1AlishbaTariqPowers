
  // Filename: W5U1A7P1_Alishba_Tariq_Power
  // Author: Alishba Tariq 
  // Date:  Wednesday, March 21, 2024
  // Purpose:  To demonstrate the use of powers without using the math function
  // */

  import java.util.Scanner;  

  class Main {
    public static void main(String[] args) 
    {
      Scanner keyedInput = new Scanner(System.in);  
      // int inputAmountInt = 0;
      int baseInt, powerInt, answer;
      baseInt = 0;
      powerInt = 0;
  // setting up our variables
    while(true)
      // Creating a while loop to keep taking user input until the user enters a valid input
    {
        System.out.println("Enter the base: ");
      // Asking the user to enter the base
      int amountBase = keyedInput.nextInt();
        if ((amountBase > 0) && (amountBase <= 5)) {
      
        //asking for user to enter power
        System.out.println("Enter the power: ");
        int amountPower = keyedInput.nextInt();
        
        if((amountPower > 0) &&(amountPower <= 12)){
          // setting up our if statements to make sure the user enters a valid input
        
          System.out.println("The base is: " + amountBase);
          System.out.println("The power is: " + amountPower);
          // printing the base and power
          
        
          answer = 1;
          System.out.println(answer);
          for(int i = 1; i <= amountPower ; i++)
          // creating a for loop to calculate the power
          {
            
            answer*= amountBase;
            // Since above we set answer to baseInt, we can use the *= operator to multiply the answer by the baseInt
            // System.out.println(answer);
          
            System.out.println(amountBase + " to the power of " + i  + " is " + answer);
          }

        }
        else{
          System.out.println("Invalid input. Please enter a number between 1 and 12.");
          // Statements that the user recieves if they enter an invalid input
        }
      }

      else {
        System.out.println("Invalid input. Please enter a positive integer between 1 and 5.");
      }
// Statements that the user recieves if they enter an invalid input

      }
    }

    }

  