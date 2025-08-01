import java.util.Scanner;
// BANK ACCOUNT ENCAPSULATION
class bankaccount{

    private int bal = 0;

    public void setvalue(int x)
    {
        if(x>0)
        {
            bal = x;
        }

        else
        {
            System.out.print("invalid amount");
            System.exit(0);
        }
    }

    public int getvalue()
    {
        return bal;
    }
}

// CUSTOMER DATA ENCAPSULATION


class customer{

    private int cId ;
    private String cName ;
    private long cNum;

    public void setdata(int x, String y, long z)
    {
        cId = x;
        cName = y;
        cNum = z;
    }

    public int getId(){
        return cId;
    }
    public String getName(){
        return cName;
    }
    public long getNum(){
        return cNum;
    }
}

public class encapsulation {


    
       
    

    public static void main(String[]args)
    {
        
        bankaccount bank = new bankaccount();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the amount");
        int x = scan.nextInt();
        bank.setvalue(x);
        System.out.println(bank.getvalue());
       
    

    
        
        customer cus = new customer();
        System.out.println("enter the id");
        int id = scan.nextInt();
        System.out.println("enter the name");
        String name = scan.next();
        System.out.println("enter the num");
        long num = scan.nextLong();
        cus.setdata(id,name,num);
        System.out.println(cus.getId());
        System.out.println(cus.getName());
        System.out.println(cus.getNum());

        
    }

    
    
}
