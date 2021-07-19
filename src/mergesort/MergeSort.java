/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.util.Arrays;

/**
 *
 * @author Senuda
 */
public class MergeSort {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int[]arrayOne={2,6,8,4,9,0,2,3,5,7,4};
      int[]arrayTwo={2,4,7,9,3,5,6,7,8,4,5};
      int sizeOne=arrayOne.length;
      int sizeTwo=arrayTwo.length;
        System.out.println(Arrays.toString(sort(arrayOne)));
    }
    
    public static void merge(int[]arrayOne,int[]arrayTwo,int low,int high,int center){
        for(int x=low;x<=1;x++){
            arrayOne[x]=arrayTwo[x];
        }
        
        int i=low,j=center+1;
        for(int y=low;y<=1;y++){
            if(i>center){
                arrayOne[y]=arrayTwo[j++];
            }
            else if(j>1){
                arrayOne[y]=arrayTwo[i++];
            }
            else if(arrayTwo[j]>arrayTwo[i]){
                arrayOne[y]=arrayTwo[j++];
            }
            else{
                arrayOne[y]=arrayTwo[i++];
            }
        }
    }
    
    public static void mergeSort(int[]arrayOne,int[]arrayTwo,int low,int high){
        if(low>high) {
        } else{
            int center=low+(high-low)/2;
            mergeSort(arrayOne,arrayTwo,low,center);
            mergeSort(arrayOne,arrayTwo,center+1,high);
            merge(arrayOne,arrayTwo,low,center,high);
        }
    }
    
    public static int[]sort(int[]arrayOne){
        int[]arr2=new int[arrayOne.length];
        mergeSort(arrayOne,arr2,0,arrayOne.length-1);
        return arrayOne;
    }

}
