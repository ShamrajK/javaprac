import java.util.Scanner;

public class prime2 {
     public static String prime(int n)
    {
        int count=0;
        for(int i=2; i<=n/2; i++)
        {
            if(n%i==0)
            {
                return "not prime";
            }
        }
        return "prime";

       
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String res = prime(n);
        System.out.print(res);
    
    }
}   
