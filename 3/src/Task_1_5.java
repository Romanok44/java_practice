import java.util.Random;
import java.util.Scanner;

public class Task_1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Type size of array");
        int n=sc.nextInt();
        // Check if user type correct num
        if (n>0){
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]= rand.nextInt(n+1);
            }
            int chetCounter =0; //Check how many even numbers
            System.out.println("Original array");
            for(int i=0;i<n;i++)
            {
                if(arr[i]%2==0) chetCounter++;
                System.out.print(arr[i]);
            }
            int[] arr2 = new int[chetCounter];
            int f =0; //Index of new array
            for(int i=0;i<n;i++)
            {
                if(arr[i]%2 ==0 && arr[i]!=0)
                {
                    arr2[f] = arr[i];
                    f++;
                }
            }
            System.out.println("\nSorted array");
            for(int i=0;i<chetCounter;i++){
                System.out.print(arr2[i]);
            }
        }
        else{
            main(args); // Ask again if user type wrong number
        }
    }
}