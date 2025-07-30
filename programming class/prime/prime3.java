import java.util.Scanner;

public class prime3 {
    public static String prime(int n)
    {
        if(n==1)
        {
            return "not prime";
        }
    
        for(int i=2; i*i<=n; i++)
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
