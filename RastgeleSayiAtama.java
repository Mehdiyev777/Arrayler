/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3exercises;

import java.util.Random;

/**
 *
 * @author Haydar abi
 */
public class RastgeleSayiAtama {
    public static void main(String[] args) {
       int[] dizi = new int[10];
for(int i=0; i<10; i++) {
	Random rastgele = new Random();
	int sayi = rastgele.nextInt(100)+1;
	dizi[i] = sayi;
}

	
	
	
    



for(int m=0; m<10; m++) {
	if(m != 9) {
		System.out.print(dizi[m]+" - ");}
        else {
            System.out.println(dizi[m]);
        }
	
	
	}
}
}


    

