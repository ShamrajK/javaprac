import java.util.Scanner;
public class whileloop_armstrong {

    public static void armrange(int n1 ,int n2)
    {
        for(int i=n1; i<=n2; i++)
        {
            if(armstrong(i))
            {
                System.out.println(i);
            }
        }
    }


    public static boolean armstrong(int n)
    {
        whileloop_count count = new whileloop_count();
        int digit = count.countdigit(n);
        int org = n;
        int last = 0; int arm = 0 ; 
        while(n>0)
        {
            last = n%10;
            arm = arm+(int)Math.pow(last,digit);
            n = n/10;
        }
        return arm==org;
    }
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        armrange(n1,n2);
    }
    
}
