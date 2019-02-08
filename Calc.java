
/**
 * Write a description of class Math_methods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.IOException;
import java.util.Scanner;
import java.util.*;
/**
 * Write a description of class Calc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public  class Calc {
    public static void main(String[]args){
        // instance variables - replace the example below with your own
        Scanner scan = new Scanner(System.in);
        double calcValue1;
        double calcValue2;
        double addTwoNumbers;
        double getCalcValue;
        int options = 0;

        double answer;
        double sum;
        boolean off = false;
        boolean on = true;
        int num1 =0;
        int num2 =0;

        /* System.out.println("Enter Number1");
        calcValue1 = scan.nextDouble();
        System.out.println("Enter Number2");
        calcValue2 = scan.nextDouble();
        System.out.println("Enter Number1");*/
        /*
        System.out.println("Enter Number1 ");
        num1= scan.nextInt();
        System.out.println("Enter Number2 ");
        num2 = scan.nextInt();
         *//*

        System.out.println("Please enter the number of what you want to do");
        System.out.println("1. Add ");
        System.out.println("2. Substract");
        System.out.println("3. Multiply ");
        System.out.println("4. Division");
        System.out.println("5. Modulus ");
        System.out.println("6. Square Root");
        System.out.println("7. Average");
         */

        // String abc = keyboard.System.in();
        //try{

        //...

        System.out.print("Let's crunch some numbers");
        while (on){

            System.out.println("Please enter the number of what you want to do");
            System.out.println("1.  Add ");
            System.out.println("2.  Substract");
            System.out.println("3.  Multiply ");
            System.out.println("4.  Division");
            System.out.println("5.  Modulus ");
            System.out.println("6.  Square Root");
            System.out.println("7.  Avg");
            System.out.println("8.  Exp");
            System.out.println("9.  Mode");
            System.out.println("10. Max");
            System.out.println("11. Min");
            System.out.println("12. Abs");
            System.out.println("13. Round");
            System.out.println("14. Sin");
            System.out.println("15. Cos");
            System.out.println("16. tan");
            System.out.println("17. Quit");
            scan.hasNextInt();
            options = scan.nextInt();

            try{
                //System.out.println("Enter Number1 ");

                //System.out.println("Enter Number2 "_);                                                                        
                //options = scan.nextInt();
                switch (options){

                    case 1:  //Sum
                    //System.out.print('\u000C');

                    System.out.println("Enter Number1 ");
                    num1= scan.nextInt();

                    System.out.println("Enter Number2 ");
                    num2 = scan.nextInt();

                    answer = Math_methods.add(num1,num2);
                    System.out.println(answer);
                    break;

                    case 2:   //difference:
                    //System.out.print('\u000C');
                    System.out.println("Enter Number1 ");
                    num1= scan.nextInt();

                    System.out.println("Enter Number2 ");
                    num2 = scan.nextInt();
                    answer = Math_methods.minus(num1,num2);
                    System.out.println(answer);
                    break;

                    case 3:  // multiply:
                    //System.out.print('\u000C');
                    System.out.println("Enter Number1 ");
                    num1= scan.nextInt();

                    System.out.println("Enter Number2 ");
                    num2 = scan.nextInt();
                    answer =  Math_methods.mult(num1,num2);
                    System.out.println(answer);
                    break;

                    case  4:   //divide:
                    //System.out.print('\u000C');
                    System.out.println("Enter Number1 ");
                    num1= scan.nextInt();

                    System.out.println("Enter Number2 ");
                    num2 = scan.nextInt();
                    answer =  Math_methods.div(num1,num2);
                    System.out.println(answer);
                    break;

                    case 5:  //modulus: 
                    //System.out.print('\u000C');
                    System.out.println("Enter Number1 ");
                    num1= scan.nextInt();

                    System.out.println("Enter Number2 ");
                    num2 = scan.nextInt();
                    answer = Math_methods.mod(num1,num2);
                    System.out.println(answer);
                    break;

                    case 6: //squareRoot:
                    //System.out.print('\u000C');
                    System.out.println("Enter Number1 ");
                    num1= scan.nextInt();

<<<<<<< HEAD
                    
                    answer = Math_methods.squ(num1);
=======
                    System.out.println("Enter Number2 ");
                    num2 = scan.nextInt();
                    answer = Math_methods.sqrt(num1);
>>>>>>> a1fd4c3acf4fcab569f625e2c3c96cf0fc0d7b8a
                    System.out.println(answer); 
                    break;

                    case 7: //Average:
                    //System.out.print('\u000C');
                    System.out.println("Enter Number1 ");
                    num1= scan.nextInt();

                    System.out.println("Enter Number2 ");
                    num2 = scan.nextInt();
                    answer = Math_methods.ave(num1,num2);
                    System.out.println(answer); 
                    break;

                    case 8: //Exponent:
                    //System.out.print('\u000C');
                    System.out.println("Enter Number1 ");
                    num1= scan.nextInt();

                    System.out.println("Enter Number2 ");
                    num2 = scan.nextInt();
                    answer = Math_methods.exp(num1,num2);
                    System.out.println(answer);
                    break;

                    case 9: //Mod:
                    //System.out.print('\u000C');
                    System.out.println("Enter Number1 ");
                    num1= scan.nextInt();

                    System.out.println("Enter Number2 ");
                    num2 = scan.nextInt();
                    answer = Math_methods.mod(num1,num2);
                    System.out.println(answer);
                    break;

                    case 10: //Maximum:
                    //System.out.print('\u000C');
                    System.out.println("Enter Number1 ");
                    num1= scan.nextInt();

                    System.out.println("Enter Number2 ");
                    num2 = scan.nextInt();
                    answer = Math_methods.max(num1,num2);
                    System.out.println(answer);
                    break;

                    case 11: //Minimum:
                    //System.out.print('\u000C');
                    System.out.println("Enter Number1 ");
                    num1= scan.nextInt();

                    System.out.println("Enter Number2 ");
                    num2 = scan.nextInt();
                    answer = Math_methods.min(num1,num2);
                    System.out.println(answer);
                    break;

                    case 12: //Absolute value:
                    //System.out.print('\u000C');
                    System.out.println("Enter Number1 ");
                    num1= scan.nextInt();
                    
                    answer = Math_methods.abs(num1);
                    System.out.println(answer);
                    break;

                    case 13: 
                    System.out.println("Enter Number1 ");
                    num1= scan.nextInt();

                    answer = Math_methods.round(num1);
                    System.out.println(answer);
                    break;

                    case 14:
                    System.out.println("Enter Number1 ");
                    num1= scan.nextInt();

                    answer = Math_methods.sin(num1);
                    System.out.println(answer);
                    break;
                    
                    case 15:
                    System.out.println("Enter Number1 ");
                    num1= scan.nextInt();

                    answer = Math_methods.cos(num1);
                    System.out.println(answer);
                    break;
                    
                    case 16:
                    System.out.println("Enter Number1 ");
                    num1= scan.nextInt();

                    answer = Math_methods.tan(num1);
                    System.out.println(answer);
                    break;

                    case 17:
                    System.exit(0);
                    break;

                    default:
                    System.out.println("Hello");
                    System.out.print('\u000C');

                }

            }
            catch(NumberFormatException e){
                //catch(Exception e){
                System.out.printf("Wrong number or not enough numbers");

            }
            /* while(options == 0){
            break;
            }*/
        }
    }
}

/*catch(IOException e){
System.out.println(error);
abc.displayErrorMessage("Please Enter 2 digit");
}
/*
public void addNum2(int Number1, int Number2){

calcValue1 = Number1 + Number2;

}

public int getCalcValue(){

return calculationValue;
 */

