import java.util.Scanner;
class Check_prime {
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
        for(i=2;i<a;i++)
            {
                if(a%i==0)
                {
                    count++;
                    break;
                
                }}
                if(count==1)
                {
                System.out.println("The number is not prime");
                }
                else if(count==0&&a!=1)
                {
                    System.out.println("Number is prime ");
                }
                
            }

}
