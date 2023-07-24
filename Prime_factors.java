import java.util.Scanner;
class Prime_fact 
{
    public static void main(String args[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number = ");
        n=sc.nextInt();
        System.out.println("Prime factors of this no. are = ");
        if(n==1)
        {
            System.out.println("The no. is neither prime nor composite");
        }
        int x=1;
        Prime_fact obj=new Prime_fact();

        for(i=2;i<=n;i++)
        {
            if(obj.prime_check(i))
            x=i;
            while(n%x==0)
            {
            System.out.println(i);
            x=x*i;
            }
        }
    }
        boolean prime_check(int i)
        {
            int y;
            for(y=2;y<i;y++)
            {
            if(i%y==0)
            {
                return false;
            }
            }
        return true;
        }
}
