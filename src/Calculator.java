import java.util.Scanner;

public class Calculator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int numOne = sc.nextInt();
        System.out.println("Please enter a second integer: ");
        int numTwo = sc.nextInt();
        System.out.println("Would you like to add or subtract?");
        String option = sc.next();

        //asking user what they want to do
        if(option.equals("add")){
            System.out.println("The sum of the two numbers is: " + (numOne + numTwo));
        } else if (option.equals("subtract")){
            System.out.println("The difference of the two numbers is: " + (numOne - numTwo));
        }else{
            System.out.println("Invalid input");
        }


        
    }
}
