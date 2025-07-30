import java.util.Scanner;
public class whileloop_reveseprint {


    public static int reverseprint(int n)
    {
        int last = 0; int rev = 0;
        while(n>0)
        {
            last = n%10;
            rev = (rev*10)+last;
            n = n/10;
        }
        return rev;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in);
        int n = scan.nextInt();
        int res = reverseprint(n);
        System.out.print(res);
    }
    
}
