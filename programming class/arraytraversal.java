import java.util.Scanner;
public class arraytraversal {
   
   

    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }

       for(int i=0; i<arr.length;i++)
        {
            int max = arr[i];
            if(max > arr[n-1])
            {
                max = arr[i];
            }
            else 
            System.out.print(max);
        }

    }   
}
