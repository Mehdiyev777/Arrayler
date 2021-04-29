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
public class ArananElemaninIndeksiniBulma {
    public static void main(String[] args) {
      int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
      System.out.println("Index position of 25 is: " + arama(my_array, 25));
      System.out.println("Index position of 77 is: " + arama(my_array, 77));
    }

    public static int arama(int [] a, int aranan) {
        int index =0;
        while (index<a.length){
            if(a[index]==aranan) return index;
            else index+=1;
        }
        return -1;
    }
}
