import java.util.Scanner;
import CurrencyConverter.CurrencyConverter;
import DistanceConverter.DistanceConverter;
import TimeConverter.TimeConverter;

public class MainConverter
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        CurrencyConverter currency=new CurrencyConverter();
        DistanceConverter distance=new DistanceConverter();
        TimeConverter time=new TimeConverter();

        while(true)
        {
            System.out.println("\n*** Converter Menu ***");
            System.out.println("1. Currency Converter");
            System.out.println("2. Distance Converter");
            System.out.println("3. Time Converter");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice=scanner.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Currency Converter:");
                    System.out.println("1. Dollar to INR");
                    System.out.println("2. INR to Dollar");
                    System.out.println("3. Euro to INR");
                    System.out.println("4. INR to Euro");
                    System.out.println("5. Yen to INR");
                    System.out.println("6. INR to Yen");
                    System.out.print("Enter option: ");
                    int c=scanner.nextInt();
                    System.out.print("Enter value:");
                    double val=scanner.nextDouble();

                    switch(c)
                    {
                        case 1: System.out.println("INR: "+currency.dollarToInr(val)); break;
                        case 2: System.out.println("Dollar: "+currency.inrToDollar(val)); break;
                        case 3: System.out.println("INR: "+currency.euroToInr(val)); break;
                        case 4: System.out.println("Euro: "+currency.inrToEuro(val)); break;
                        case 5: System.out.println("INR: "+currency.yenToInr(val)); break;
                        case 6: System.out.println("Yen: "+currency.inrToYen(val)); break;
                        default: System.out.println("Invalid option");
                    }
                    break;

                    case 2:
                    System.out.println("Distance Converter:");
                    System.out.println("1. Meter to KM");
                    System.out.println("2. KM to Meter");
                    System.out.println("3. Miles to KM");
                    System.out.println("4. KM to Miles");
                    System.out.print("Enter option: ");
                    int d=scanner.nextInt();
                    System.out.print("Enter value:");
                    double dval=scanner.nextDouble();

                    switch(d)
                    {
                        case 1: System.out.println("KM: "+distance.meterToKM(dval)); break;
                        case 2: System.out.println("Meter: "+distance.kmToMeter(dval)); break;
                        case 3: System.out.println("KM: "+distance.milesToKM(dval)); break;
                        case 4: System.out.println("Miles: "+distance.kmToMiles(dval)); break;
                        default: System.out.println("Invalid option");
                    }
                    break;

                    case 3:
                    System.out.println("Time Converter:");
                    System.out.println("1. Hours to Minutes");
                    System.out.println("2. Minutes to Hours");
                    System.out.println("3. Hours to Seconds");
                    System.out.println("4. Seconds to Hours");
                    System.out.print("Enter option: ");
                    int t=scanner.nextInt();
                    System.out.print("Enter value:");
                    double tval=scanner.nextDouble();

                    switch(t)
                    {
                        case 1: System.out.println("Minutes: "+time.hoursToMinutes(tval)); break;
                        case 2: System.out.println("Hours: "+time.minutesToHours(tval)); break;
                        case 3: System.out.println("Seconds: "+time.hoursToSeconds(tval)); break;
                        case 4: System.out.println("Hours: "+time.secondsToHours(tval)); break;
                        default: System.out.println("Invalid option");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}