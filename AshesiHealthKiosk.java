
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
                System.out.println("Welcome to the  Triage");
                System.out.println("Kindly enter the a number ,1/2/3 for a health metric");
                int healthMetric = systemService.nextInt();
                switch(healthMetric){
                    case 1:
                        System.out.println("Kindly enter weight in kilograms");
                        double weight = systemService.nextDouble();
                        System.out.println("Kindly enter height in meters");
                        double height= systemService.nextDouble();
                        double bmi = weight/Math.pow(height,2);
                        bmi = Math.round((bmi*10)/10.0);
                        if (bmi < 18.5){
                        System.out.println("you are underweight");
                        }
                        else if (bmi<=29.9 || bmi >= 25.0){
                        System.out.println("you are overweight");
                        }
                        break;
                        
                    }
                    
                        


        
        
       
        
                break;
            case "C" :
                System.out.println(" Go to  to the Counseling desk");
            default:
                System.out.println(" Invalid service code");
            }
        
  
        }

    }

      


    
