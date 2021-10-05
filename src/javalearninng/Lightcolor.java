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
public class Lightcolor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char color='R';
        switch(color){
            case 'G':System.out.print("GO");break;
            case 'R':System.out.print("Stop!");break;
            case 'A':System.out.print("Watch before you go!");break;
            default:System.out.print("Error with signal!");
            
        }
    }
    
}
