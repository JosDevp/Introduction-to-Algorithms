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

public class MergeSort {
    
    public static void main(String[] args) {
        MergeSort a=new MergeSort();
        int arreglo[]={89,52,90,64,0,45,78};
         a.sort(arreglo);
        System.out.println(Arrays.toString(arreglo));
    }
    public int[] sort(int[] array){
        mergeSort(array, 0, array.length - 1);
        return array;
    }
    private void mergeSort(int[] array, int p, int r){
        if(p < r){
            int q = (p + r) / 2;
            mergeSort(array, p, q);
            mergeSort(array, q + 1, r);
            merge(array, p, q, r);
        }
    }
    private void merge(int A[],int p, int q, int r){
        
        int n1=q-p+1;
        int n2=r-q;
        int[] left=new int[n1+1];
        int [] right=new int [n2+1];
        
        for (int i = 0; i < n1; i++) {
            left[i]=A[p+i];
            
        }
        for (int j = 0; j < n2; j++) {
            right[j]=A[q+j+1];
        }
        left[n1]=Integer.MAX_VALUE;
        right[n2]=Integer.MAX_VALUE;
        
        for(int i = 0,  j = 0,  k = p; k <= r; k++){
            if(left[i]<=right[j]){
                A[k]=left[i++];
            }else{
                A[k]=right[j++];
            }
        }
    }
    
}
