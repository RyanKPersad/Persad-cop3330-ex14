/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Persad
 */


package Tax_Calc;
import java.util.Scanner;


public class App
{
    public static void main( String[] args )
    {
        Scanner myObj = new Scanner(System.in);
        String amount;
        String state;
        String trigger_state = "MN";
        double tax = 5.5/100;

        System.out.println( "What is the order amount?" );
        amount = myObj.nextLine();

        System.out.println( "What is the State?" );
        state = myObj.nextLine();
        double new_amount = Double.parseDouble(amount);

        if (state.equalsIgnoreCase(trigger_state)){
            double taxed_subtotal = new_amount * tax;
            double final_subtotal = new_amount + taxed_subtotal;
            String print1 = String.format("Subtotal: $%.2f\nTax: $%.2f\ntotal: $%.2f", new_amount,taxed_subtotal,final_subtotal);
            System.out.println( print1 );
        }

        String print2 = String.format("The total is $%.2f",new_amount);
        System.out.println( print2 );




    }
}
