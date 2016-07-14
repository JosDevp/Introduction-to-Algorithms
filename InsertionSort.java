/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo1;

import java.util.Arrays;

/**
 *
 * @author Duqu
 */

/* Introduction to Algorithms 3rd_edition T.Cormen.*/
public class InsertionSort {
    
    static int i,j;
    static int aux;
    static int key;
    public  void insertionsort(int A []){
         for (j= 1; j < A.length;j++) {
            key=A[j];
            
            i=j-1;
             
            while(i>=0 && A[i]>key)
                A[i+1]=A[i--];
          
                 A[i+1]=key;
            
           
        }
    }  
    
    public static void main(String[] args) {
        InsertionSort ve=new InsertionSort();
         int A[]={5,2,4,6,1,3};
         ve.insertionsort(A);
        System.out.println(Arrays.toString(A));
        
        
    
       
      
        
        
    }
    
}
