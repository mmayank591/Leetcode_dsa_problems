import java.util.Scanner;
class Optimized_check_prime {
    public static void main(String args[])
    {
        int a;
        int count=0;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number = ");
        a=sc.nextInt();
        if(a==1)
        {
            System.out.println("Number is neither prime nor composite ");
        }
        for(i=2;i*i<a;i++)
        {
            if(a%i==0)
            {
                count++;
                break;
            }
        }
        if(count==1)
        {
            System.out.println("Number is not prime ");
        }
        else if(count==0&&a!=1)
        {
            System.out.println("Number is prime ");
        }
    }
}
