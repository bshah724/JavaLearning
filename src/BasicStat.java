/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shahb
 */
public class BasicStat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] data={24.0,33.0,2.0,44.99,101.9,72.66,81.1};
        //min,max,total,ave,count
        double min=data[0];
        double max=data[0];
        double sum=0;
        for(double num:data){
            sum=sum+num;
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
        }
        
    }
        System.out.println("Min Number is:"+min);
        System.out.println("Max Number is:"+max);
        System.out.println("total is:"+sum);
         System.out.println("Count is:"+data.length);
         System.out.println("Ave is:"+sum/data.length);
}
   
}