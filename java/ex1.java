import java.util.*;

class ex1
{
    int cn;
    String name;
    int pmr;
    int cmr;
    String type;
    double bill;
    int units;

    public void Input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter consumer number:");
        cn=sc.nextInt();
        sc.nextLine();

        System.out.print("Enter consumer name:");
        name=sc.nextLine();

        System.out.print("Previous month reading:");
        pmr=sc.nextInt();

        System.out.print("Current month reading:");
        cmr=sc.nextInt();
        sc.nextLine();

        System.out.print("Type of EB connection:");
        type=sc.nextLine().toLowerCase();

        sc.close();
    }

    public void Calc()
    {
        units= cmr-pmr;
        if(units<0)
        {
            System.out.println("Error: current month reading cannot be less than previous month reading");
            return;
        }  
        
        if (type.equals("domestic"))
        {
            if(units<=100)
            {
                bill=units*1;
            }
            else if(units<=200)
            {
                bill=(100*1)+((units-100)*2.50);
            }
            else if(units<=500)
            {
                bill=(100*1)+(100*2.50)+((units-200)*4);
            }
            else
            {
                bill=(100*1)+(100*2.50)+(300*4)+((units-500)*6);
            }
        }
        else if(type.equals("commercial"))
        {
            if(units<=100)
            {
                bill=units*2;
            }
            else if(units<=200)
            {
                bill=(100*2)+((units-100)*4.50);
            }
            else if(units<=500)
            {
                bill=(100*2)+(100*4.50)+((units-200)*6);
            }
            else
            {
                bill=(100*2)+(100*4.50)+(300*6)+((units-500)*7);
            }
        }
        else
        {
            System.out.println("Invalid type. Please enter 'domestic' or 'commercial'.");
        }
    }

    public void display()
    {
        System.out.println("Consumer number: "+cn);
        System.out.println("Consumer name: "+name);
        System.out.println("Previous month reading: "+pmr);
        System.out.println("Current month reading: "+cmr);
        System.out.println("Type of EB connection: "+type);
        System.out.println("Units consumed: "+(cmr-pmr));
        System.out.println("Total bill amount: Rs."+ bill);
    }
    public static void main(String[] arg)
    {
        ex1 obj= new ex1();
        obj.Input();
        obj.Calc();
        if (obj.units>=0 && ( obj.type.equals("domestic") || obj.type.equals("commercial")))
        {
            obj.display();
        }
    }
}