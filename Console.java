 

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */

public class Console {
    
    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }
/*
    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }
*/
     public static int add(int num1,int num2){
            return num1 + num2;
    }
    
    public static int minus(int num1,int num2){
            return  num1 - num2;
    }
    
    public static int mult(int num1,int num2){
            return  num1 * num2;
    }
    public static int pow(double num1,double num2){
          
        double r = Math.pow(num1,num2);
        return (int)Math.round(r);
            
    }
    public static double squ(int num1){
    
        return (double) Math.sqrt(num1);
    }
    public static int min(int num1, int num2){
        return Math.min(num1,num2);
    }
    public static int max(int num1, int num2){
        return Math.max(num1,num2);
    }    
    public static double exp (double num1){         
        return  Math.pow(2.718,num1);
    }
    public static double tenthpow(double num1){
        return Math.pow(10,num1);
    }
    public static int abs(int num1){
        return Math.abs(num1);
    }
    public static double round(double num1){
        return Math.round(num1);
    }
    
    public static long exp (int num1, int num2){ 
        int neg = -2147483647;
        int pos = 2147483647;
        long t = 0;
        
        
        if(num1 >= -1 || num1 <= neg){
            double re = Math.pow(num1,num2);
            return (long)re;
        }
        else if(num2 >= 1 || num2 <= pos ){
            
            double re2 = Math.pow(num2,num1);
            return (long)re2;        
        }
        return t;
    }
}
