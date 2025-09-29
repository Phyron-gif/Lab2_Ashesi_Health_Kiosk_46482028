
import java.util.Scanner;
public class AshesiHealthKiosk {
    public static void main (String[] args){
        System.out.println("Welcome to the Ashesi university health kiosk");
        Scanner systemService = new Scanner(System.in);
        System.out.println("Enter one of the service codes P/L/T/C");
        String Service = systemService.nextLine().toUpperCase();
        switch(Service){
            case "P":
                System.out.println(" Go to  the Pharmacy desk");
                break;
            case "L":
                System.out.println(" Go to the Lab desk");
                break;
            case "T":
                System.out.println(" Go to  Triage desk");
                break;
            case "C" :
                System.out.println(" Go to  to the Counseling desk");
            default:
                System.out.println(" Invalid service code");
        }
        

        


    }
}