import java.util.Scanner;
class More_optimized_lcm {
    public static void main(String args[])
    {
        int a,b;
        int resg,resl;
        int m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number = ");
        a=sc.nextInt();
        System.out.println("Enter the second number = ");
        b=sc.nextInt();
        More_optimized_lcm l = new More_optimized_lcm();
        resg=l.gcd(a,b);
        System.out.println("Greatest Common Fcator = " +resg);
        m=a*b;
        resl=m/resg;
        System.out.println("Least Common Multiple = " +resl);
    }
        int gcd(int a,int b)
        {
            int r;
            if(b==0)
            {
            return a;
            }
            else
            {
                r=gcd(b,a%b);
                return r;
            }

        }
    
}
