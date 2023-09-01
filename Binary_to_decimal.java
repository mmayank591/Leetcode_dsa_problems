import java.util.Scanner;
public class Binary_to_decimal {
    public static void main(String args[])
    {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number = ");
    n=sc.nextInt();
    Binary_to_decimal r = new Binary_to_decimal();
    r.fun(n);
    }
    void fun(int n)
    {
        if(n==0)
        {
            return ;
        }
        fun(n/2);
        //int ans=(n%2)+10*(fun(n/2));
        System.out.println(n%2);
    }

    
}
