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
public class DizininEnbUyukElemaniniBulma {
    public static void main(String[] args) {
        int[] x = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println(enbuyukeleaman(x));
        System.out.println(enkucuk(x));
    }
    

public static int enbuyukeleaman(int[] dize){
  int max = dize[0];
  for(int i=0;i<dize.length;i++){
      if(dize[i]>max){ max= dize[i];
  }
  }
  return max;}
public static int enkucuk(int[] dize){
        int min =dize[0];
        for (int i = 0; i < dize.length; i++) {
        if(dize[i]<min){
            min= dize[i];
        }
        
    }
        return min;
              
                                        
          
       
          
      

  
}
}


