import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class binarysearch {
    
     static void bubblesort(int[] array)
     {
         int temp=0;
         for(int j=0;j<array.length;j++){
         for(int k=1;k<array.length-1;k++){
             if(array[k-1]>array[k]){
                 //swap arrays 
                 temp=array[k-1];
                 array[k-1]=array[k];
                 array[k]=temp;
             }
         }
     }
     }
     
     //function for bubble sort
      public static void binarySearch(int array[], int first, int last, int key){  
   int mid = (first + last)/2;  
   while( first <= last ){  
      if ( array[mid] < key ){  
        first = mid + 1;     
      }else if ( array[mid] == key ){  
        System.out.println("Element is found at index: " + mid);  
        break;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("Element is not found!");  
   }  
 }  
    

    
     public static void main(String[]args){
        int n,i;
        System.out.println("Enter the number of elements");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("enter the elements");
       
        for( i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("the elements in the array are");
        for( i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }
            System.out.println("sorting the elements in ascending order");
        
        bubblesort(array);
          for( int j=0; j < array.length; j++){  
                        System.out.print(array[j] + " ");  
          }
          System.out.println();
    System.out.println("enter the element you want to search");
     int key = sc.nextInt();
      int last=array.length-1;  
        binarySearch(array,0,last,key); 
}
   
}