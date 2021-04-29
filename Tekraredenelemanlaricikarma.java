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
public class Tekraredenelemanlaricikarma {
     public static void main(String[] args) {
    int[] dizi = {0, 3, -2, 4, 3, 2,2,4,0,3};// dizi olusturuldu
    int tekrarlanmayansayisi = dizi.length;// basta butun elemalari tekrak olunmur qebul edildi.
         System.out.println(tekrarlanmayansayisi);
        //ELEMALAR KARSILASTIRILIYOR;
         
        for (int i = 0; i < tekrarlanmayansayisi; i++) 
        {
            for (int j = i+1; j < tekrarlanmayansayisi; j++)
            {
                //If any two elements are found equal
                System.out.println(j + "x");
              
                if(dizi[i] == dizi[j])
                {
                    //Replace duplicate element with last unique element
                     
                    dizi[j] = dizi[tekrarlanmayansayisi-1];
                     
               tekrarlanmayansayisi--;
j--;
                    System.out.println(j+"y");           
                }
            }
        }
        System.out.println(tekrarlanmayansayisi);
       int[] tekrarlanmayandizi=Arrays.copyOf(dizi, tekrarlanmayansayisi);
       for (int i = 0; i < tekrarlanmayandizi.length; i++)
        {
            System.out.print(tekrarlanmayandizi[i]+"\t");
        }
        }
         
        
}
