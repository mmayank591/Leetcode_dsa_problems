import java.util.Scanner;
class More_optimized_check_prime {
    public static void main(String args[])
    {
        int a;
        int i;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number = ");
        a=sc.nextInt();
        if(a==1)
        {
            System.out.println("Number is neither prime nor composite ");
        }
        else if(a==2||a==3)
        {
            System.out.println("Number is prime");
        }
        else if(a%2==0||a%3==0)
        {
            System.out.println("Number is not prime");
        }
        for(i=5;i*i<a;i=i+6)
        {
            if(a%i==0)
            {
                count++;
                break;
            }
        }
        if(count==1)
        {
            System.out.println("Number is not prime");
        }
        else if(count==0&&a!=1&&a!=2&&a!=3&&a%2!=0&&a%3!=0) 
        {
            System.out.println("Number is prime");
        }
    }
}
