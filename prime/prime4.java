import java.util.Scanner;
public class prime4 {

     public static void printprime(int n1, int n2)
    {
        for(int i=n1;i<=n2;i++)
        {
            if(checkprime(i))
            {
                System.out.println(i);
            }
        }
    }

    public static boolean checkprime(int n)
    {
        for(int i=2; i*i<=n; i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        printprime(n1,n2);
    

    }
    
}
