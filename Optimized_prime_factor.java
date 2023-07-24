import java.util.Scanner;
class Optimized_prime_fact {
    public static void main(String args[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number = ");
        n=sc.nextInt();
        System.out.println("Prime factors are = ");
        if(n==1)
        {
        System.out.println("Number is neither prime nor composite ");
        }
        for(i=2;i*i<=n;i++)
        {
            while(n%i==0)
            {
            System.out.println(i);
            n=n/i;
            }
        }
        if(n>1)
        {
            System.out.println(n);
        }
    }
    
}
