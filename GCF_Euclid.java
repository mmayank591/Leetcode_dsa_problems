import java.util.Scanner;
class GCF_using_Euclid_Algorithm {
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first numbers = ");
        a=sc.nextInt();
        System.out.println("Enter the second number = ");
        b=sc.nextInt();
        while(a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else
            {
                b=b-a;
            }
        }
        System.out.println("The greatest common factor between these two no.s are = " +a);
    }
}
