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
public class sum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=1;
        n++;
        if(n<=10){
            System.out.println("Result:"+n);
            int sum=0;
            int counter=1;
            while(counter<10000){
                sum=sum+counter;
                counter++;
            }
            System.out.println("sum:"+sum);
        }
    }
    
}
