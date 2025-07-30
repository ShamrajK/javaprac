package factor;
import java.util.Scanner;
public class factor_count {
    

    static void fac_count(int n)
    {
        int count = 0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        System.out.print(count);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        find_factor find = new find_factor();
        int n = scan.nextInt();
        System.out.println("count ");
        fac_count(n);
        System.out.println();
        System.out.println("factors");
        find.fac(n);
    }
}
