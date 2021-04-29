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
public class ReferansAnlayisi {
    public static void main(String[] args) {
        int[] dizi1 = {10,20,30};
        int [] dizi2={5,10,15};
dizi2 = dizi1;
dizi1[0] = 1000;

System.out.println(Arrays.toString(dizi1));
System.out.println(Arrays.toString(dizi2));
    }
}
