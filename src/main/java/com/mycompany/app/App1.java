package com.myjava.exceptions;
public class App1 {
 public static void main(String[] a){
       try{
            int i = 10/10;
        } catch(Exception ex){
            System.out.println("Inside 2nd catch Block");
        } finally {
            System.out.println("Inside 2nd finally block");
        }
    }
}
