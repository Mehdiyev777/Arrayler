/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3exercises;

import java.util.Arrays;

/**
 *
 * @author Haydar abi
 */
public class DizininElemaNlariniTerstenYazdirmA {
    public static void main(String[] args) {
         int[] dize = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456};
         int [] tersdizi = new int [dize.length];
         for(int i=0,j=dize.length-1;i<dize.length;i++,j--){
           tersdizi[j]=dize[i];
         }
         System.out.println(Arrays.toString(tersdizi));
    }
    
   
}
