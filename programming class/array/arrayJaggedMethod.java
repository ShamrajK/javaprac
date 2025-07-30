import java.util.Scanner;
public class arrayJaggedMethod {

    public static int [][][] arrayinput()
    {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of school");
        int x = scan.nextInt();
        int[][][] arr = new int[x][][];

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the number of class "+ i +"th School");
            int y = scan.nextInt();   
            arr[i] = new int[y][];
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("Enter the number of student "+j+"th class "+i+"th school");
                int z = scan.nextInt();
                arr[i][j] = new int[z];
                for(int k=0;k<arr[i][j].length;k++)
                {
                    System.out.println("school"+i+" class"+j+" student"+k);
                    arr[i][j][k]  = scan.nextInt();
                }
            }
            System.out.println();
        }
        return arr;

    }
     public static void printarr(int arr[][][])
    {
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                for(int k=0;k<arr[i][j].length;k++)
                {
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
   
    public static void main(String []args)
    {
        int input[][][]=arrayinput();
        printarr(arrayinput());
        
        
    }
    
}
