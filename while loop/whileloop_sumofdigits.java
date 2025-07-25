import java.util.Scanner;
public class whileloop_sumofdigits {

    public static int sumdigit(int n)
    {
        int sum = 0; int rem = 0;
        while(n>0)
        {
            sum = n%10;
            rem = rem + sum;
            n = n/10;
        }
        return rem;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int res = sumdigit(n);
        System.out.print(res);
    }
    
}
