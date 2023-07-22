import java.util.Scanner;
class Optimized_GCF_Euclid {
    public static void main(String args[])
    {
        int a,b,g;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number = ");
        a=sc.nextInt();
        System.out.println("Enter second number = ");
        b=sc.nextInt();
        Optimized_GCF_Euclid obj = new Optimized_GCF_Euclid(); 
        g=obj.gcd(a,b);
        System.out.println("Greatest Common Fcator = " +g);
    }
        int gcd(int a,int b)
        {
            int res=0;
            if(b==0)
            {
            return a;
            }
            else 
            {
                res=gcd(b,a%b);
                return res;
            }
        }
      
}
