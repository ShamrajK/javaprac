import java.util.Scanner;
class array
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //System.out.print("number of class:");
        //int r = scan.nextInt();
        System.out.print("number of student:");
        int c = scan.nextInt();
        int [][] a= new int[2][c]; 

        for(int i = 0; i<2; i++)
        {
            for(int j = 0; j<c; j++)
            {
                System.out.print("class"+ i +" student" + j +":");
                a[i][j] = scan.nextInt();
            }
            System.out.println();
    
        }
        System.out.println("the student age are");

        for(int i=0; i<2; i++)
        {
            for(int j=0; j<5; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}