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
public class Carpurchase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double cash=20000;
        double credit=20000;
        if(cash+credit>=25000){
            System.out.println("can buy a car");
            
        }else{
            System.out.println("can not buy a car");
        }
    }
    
}
