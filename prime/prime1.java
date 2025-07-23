import java.util.Scanner;
class prime1
{

    public static void primefactor(int n)
    {
        int count=0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }

        if (count == 2)
        {
            System.out.print("prime");
        }
        else{
            System.out.print("not prime");
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        primefactor(n);

    }
}