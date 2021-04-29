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
public class DizedeTekrarEdenElemanLariBulma {
    public static void main(String[] args) 
    {
        int[] dize = {1, 2, 5, 5, 6, 6, 7, 2};
 
        for (int i = 0; i < dize.length-1; i++){
        
            for (int j = i+1; j < dize.length; j++)
            {
                if ((dize[i] == dize[j]))
                {
                    System.out.println("Duplicate Element : "+dize[j]);
                }
            }
        }
    }    
}
