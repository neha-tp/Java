import java.util.*;

class hello
{
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        System.out.println();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();

        if (num<0)
        {
            System.out.println("Negative number");
        }
        else if (num==0)
        {
            System.out.println("Number is zero");
        }
        else
        {
            System.out.println("Positive Number");
        }
        System.out.println();

        for(int i=1; i<11; i++)
        {
            System.out.println(i);
        }
        System.out.println();

        System.out.print("Enter a number:");
        int n=sc.nextInt();

        if (n<0)
        {
             System.out.println("Negative");
        }
        else if (n==0)
        {
            System.out.println("Number is zero");
        }
        else
        {
             int flag=0;
             for(int i=2; i<n; i++)
             {
                 if(n%i==0)
                 {
                      System.out.println("Positive and not prime");
                      flag=1;
                      break;
                 }
             }
             if (flag==0)
             {
                 System.out.println("Positive and prime");
             }
        } 
        System.out.println();
       
        System.out.print("Enter a number:");
        int numb=sc.nextInt();
        int flag=1;

        for(int i=1; i<=numb; i++)
        {
            flag=flag*i;
        }
        System.out.println("Factorial is: "+ flag);
        System.out.println();

        System.out.print("Enter value of n:");
        int no=sc.nextInt();

        System.out.print("Enter value of r:");
        int r=sc.nextInt();

        if(r>no || no<0 || r<0)
        {
             System.out.println("Invalid input");
        }

        else
        {
             int nPr= factorial(no)/factorial(no-r);
             int nCr= factorial(no)/(factorial(no-r) * factorial(r));
             System.out.println("Permutation is: "+ nPr);
             System.out.println("Permutation is: "+ nCr); 
             System.out.println();
        }
        sc.close();
    }

    public static int factorial(int n)
    {
        int fact=1;

        for(int i=1; i<=n; i++)
        {
            fact=fact*i;
        }
        return fact;
    }
}
