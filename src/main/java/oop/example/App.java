package oop.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        Scanner stateInput = new Scanner(System.in);
        double orderAmount;
        double stateTax;
        double subTotal;
        double total = 0;

        System.out.printf("What is the order amount? ");
        orderAmount = Double.parseDouble(input.nextLine());

        System.out.printf("What is the state? ");
        String state = stateInput.next();

        subTotal = orderAmount;
        total = subTotal;


        if(state.equals("WI"))
        {
            total  = subTotal * 1.055;
            total = Math.round(total * 100.0) / 100.0;
            stateTax = total - subTotal;


            System.out.printf("The subtotal is $%.2f\nThe tax is $%.2f\n",subTotal, stateTax);
        }

        System.out.printf("The total is $%.2f", total);


    }
}
