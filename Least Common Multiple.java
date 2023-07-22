import java.util.Scanner;
class Least_common_multiple {
    public static void main(String args[])
    {
        int a,b;
        int max=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers = ");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
        {
            max=a;
        }
        else
        {
            max=b;
        }
        while(max>0)
        {
            if(max%a==0&&max%b==0)
            {
                break;
            }
            max++;
        }
        System.out.println("Least Common Multiple = " +max);
        
    }
    
}
