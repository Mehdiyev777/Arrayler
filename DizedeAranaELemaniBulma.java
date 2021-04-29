/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3exercises;

/**
 *
 * @author Haydar abi
 */
public class DizedeAranaELemaniBulma {
    public static boolean arama(int[]dize,int axtarilan){
        for(int eleman:dize){
            if(axtarilan==eleman){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] my_array1 = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2265, 1457, 2456};
      System.out.println(arama(my_array1, 2013));
      System.out.println(arama(my_array1, 2015));
   }
    }
}
