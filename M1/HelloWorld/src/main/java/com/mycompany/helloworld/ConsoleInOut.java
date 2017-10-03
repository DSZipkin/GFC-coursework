/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.helloworld;

/**
 *
 * @author n0203635
 */
public class ConsoleInOut {
    public static void main(String[] args) {
      
        int sum = 0;
        int operand1 = 0;
        int operand2 = 0;
        
        //initialize scanner object
        Scanner myScanner = new Scanner(System.in);

        /*declare and initialize STring (text) variables to hold the values that the 
        user type in - the ocnosle only knows about text, not about numbers
        */
        String stringOperand1 = "";
        String stringOperand2 = "";
        
        //Ask user to input first operand
        System.out.println("Please enter the first number to be added:");
        
        //put value in stringOperand1
        stringOperand1 = myScanner.nextLine();
        
        //Ask user for second operand
        System.out.println("Please enter the second number to be added:");
        //put value in stringOperand2
        stringOperand2 =myScanner.nextLine();
        
        //convert string values into int values using parseInt method
        operand1 = Integer.parseInt(stringOperand1);
        operand2 = Integer.parseInt(stringOperand2);
        
        //create var sum to be operand 1 plus 2
        sum = operand1 + operand2;
        
        // below will print out the sum.  The plus in this case is used to concatenate
        System.out.println("Sum is: " + sum);
    }
}
