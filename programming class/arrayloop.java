import java.util.Scanner;
public class arrayloop {
    public static void loop()
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[][]= new int[n][];
        int count = 1;
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = new int[i+1];
            for(int j=0; j<=i; j++)
            {
                System.out.print(arr[i][j]=count++);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        loop();
    }
}
