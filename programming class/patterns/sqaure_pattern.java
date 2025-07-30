package patterns;
import java.util.Scanner;
public class sqaure_pattern {


    static void sqpattern(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void hollow_squ(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i==1 || i==n || j==n || j==1 )
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void numeric_sq(int n)
    {
        int count=1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(count<10)
                {
                    System.out.print("0");
                }
    
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        System.out.println();
    }

    static void add_sqpattern(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                System.out.print((i+j)-1 +" ");
            }
            System.out.println();
        }
        System.out.println();
    }


    static void mul_sqpattern(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i*j<10)
                {
                    System.out.print("0");
                }
    
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void alp_sqpattern(int n)
    {
        char ch = 'A';
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void X_hollow_squ(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i==1 || i==n || j==n || j==1 || i==j || i==n-j+1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        sqpattern(n);
        hollow_squ(n);
        numeric_sq(n);
        add_sqpattern(n);
        mul_sqpattern(n);
        alp_sqpattern(n);
        X_hollow_squ(n);
    }
    
}
