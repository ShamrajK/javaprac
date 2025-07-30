package factor;
import java.util.Scanner;
public class find_factor {

    static void fac(int n)
    {
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        fac(n);

    }
}
