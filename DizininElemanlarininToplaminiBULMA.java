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
public class DizininElemanlarininToplaminiBULMA {
    public static void main(String[] args) {
        int [] dizi ={5,41,52,7,9,11};
        int sum =0;
     //   for (int i = 0; i < dizi.length; i++) {//
            for(int i : dizi){
            sum+=i;
            
        }
        System.out.println(sum);
    }
    
}
