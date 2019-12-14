package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;
public class TestingMain {
    public static void main (String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test - pierwszy test jednostkowy:");
        System.out.println();

        Calculator calculator = new Calculator();

        if (calculator.add(2,2)== 4 ) {
            System.out.println("Calculator is working");
        } else {
            System.out.println("Calculator is not working properly");
        }

        if (calculator.subtract(4,2) == 2 ) {
            System.out.println("Calculator is working");
        } else {
            System.out.println("Calculator is not working properly"); 
        }


    }
}
