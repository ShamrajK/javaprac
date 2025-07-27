package patterns;
import java.util.Scanner;
public class triangle {
    public static void triange(int n)
    {
       
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void hollow_tri(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if(i==1 || i==n || j==1 || i==j)
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

    public static void alp_tripattern(int n)
    {
        char ch = 'A';
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pyramid(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int k=1; k<=n-i; k++)
            {
                System.out.print(" ");
            }   
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void right_align_triange(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int k=1; k<=n-i; k++)
            {
                System.out.print("  ");
            }   
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void inverted_half_triange(int n)
    {
        for(int i=n; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void inverted_pyramid(int n)
    {
        for(int i=n; i>=1; i--)
        {
            for(int k=1; k<=n-i; k++)
            {
                System.out.print(" ");
            }   
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void alp_diff_tripattern(int n)
    {
        char ch1 = 'A';
        
        for(int i=1; i<=n; i++)
        {
            char ch2 = (char)((ch1+i)-1);
            
            for(int j=1; j<=i; j++)
            {
                if(i%2!=0)
                {
                    System.out.print(ch1++ + " ");
                }
                else
                {
                    System.out.print(ch2-- +" ");
                    ch1=(char)(ch2+i+1);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = scan.nextInt();
        triange(n);
        hollow_tri(n);
        alp_tripattern(n);
        right_align_triange(n);
        inverted_half_triange(n);
        pyramid(n);
        inverted_pyramid(n);
        alp_diff_tripattern(n);
    }
    
}
