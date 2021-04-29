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
public class Arttirma {
    public static int[] arttir(int baslangic) {
	int elemanSayisi = ((100-baslangic)/2)+1;
	int[] dizi = new int[elemanSayisi];
	
	for(int i=baslangic, j=0;  j<dizi.length; i+=2, j++) {
		dizi[j] = i;
	}
	return dizi;
}



public static void main(String[] args) {
	int[] sayilarim = arttir(52);
	for(int i=0; i<sayilarim.length; i++) {
		System.out.print(sayilarim[i]+"-");
                System.out.println(sayilarim.toString());
                int x = ((100-52)/2)+1;
                System.out.println(x);
	}
}
}
