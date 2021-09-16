package javacode;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int data[] = {1,4,6,2,5,2};
        System.out.println("Before Sort");
        for (int i= 0; i < data.length; i++) {
        	System.out.println(" " + data[i]);
        }
        for (int i= 0; i < data.length; i++) {
        	for (int j= 0; j < data.length; j++) {
        		if(data[i] < data[j]) {
        			int temp = data[i];
        			data[i] = data[j];
        			data[j] = temp;
        	
        		}
        	}
        }
        
        System.out.println("\nAfter Sort");
        for (int i= 0; i < data.length; i++) {
        	System.out.println(" " + data[i]);
	}

        }

}