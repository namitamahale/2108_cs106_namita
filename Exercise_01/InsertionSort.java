package javacode;

public class InsertionSort {

	 public static void insertionSort(int array[]) {  
	        int n = array.length;  
	        for (int j = 1; j < n; j++) {  
	            int key = array[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array [i] > key ) ) {  
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = key;  
	        }  
	    }  
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr1 = {9,40,3,2,1,58,22};    
        System.out.println("Before Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1);//sorting array using insertion sort    
           
        System.out.println("After Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
    }    
}    
