import java.util.Scanner;

public class Calculator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        float numOne = sc.nextFloat();
        System.out.println("Please enter a second number: ");
        float numTwo = sc.nextFloat();
        System.out.println("Would you like to add, subtract, divide or multiply?");
        String option = sc.next();

        //asking user what they want to do
        if(option.equals("add")){
            System.out.println("The sum of the two numbers is: " + (numOne + numTwo));
        } else if (option.equals("subtract")){
            System.out.println("The difference of the two numbers is: " + (numOne - numTwo));
        }else if(option.equals("divide")){
            System.out.println("The quotient of the two numbers is: " + (numOne / numTwo));
        }else if(option.equals("multiply")){
            System.out.println("The product of the two numbers is: " + (numOne * numTwo));
        }else{
            System.out.println("Invalid input");
        }


        
    }
}
