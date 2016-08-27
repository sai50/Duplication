package com.mycompany.app;

public class App 
{
public static void main(String[] a){
        try{
            int i = 10/0;
        } catch(Exception ex){
            System.out.println("Inside 1st catch Block");
        } finally {
            System.out.println("Inside 1st finally block");
        }
        
    }
}
