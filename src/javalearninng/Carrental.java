/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearninng;

/**
 *
 * @author shahb
 */
public class Carrental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Age=20;
        double CC=10000.00;
        if(Age>=21 && CC>=10000.00){
            System.out.println(" Can rent a car");
        }else{
            System.out.println("Not eligible to rent car");
        }
    }
    
}
