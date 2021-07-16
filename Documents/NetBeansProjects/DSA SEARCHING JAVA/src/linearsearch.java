
import java.util.Scanner;

public class linearsearch {

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
        System.out.println("enter the elements you want to search ");
        int s=sc.nextInt();
        for(i=0;i<=(array.length)-1;i++){
        if(array[i]==s)
        {
            System.out.println("the element is AT INDEX" + i );
        }
        else{
         System.out.println("the element is not found");
        }
        
        
        }
    
}
}
