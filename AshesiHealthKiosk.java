
import java.util.Scanner;
import java.util.Random;

public class AshesiHealthKiosk {
    public static void main(String[] args) {
        System.out.println("Welcome to the Ashesi University Health Kiosk");
        Scanner systemService = new Scanner(System.in);

        System.out.println("Enter one of the service codes: P-for Pharmacy/L- for Lab/T- for Triage/C- for Counselling");
        String service = systemService.nextLine().toUpperCase();

        switch (service) {
            case "P":
                System.out.println("Go to the Pharmacy desk");
                break;
            case "L":
                System.out.println("Go to the Lab desk");
                break;
            case "T":
                System.out.println("Go to Triage desk");
                System.out.println("Welcome to the Triage");
                System.out.println("Kindly enter a number: 1-for health metric / 2-for dosage in mg / 3-for angle in degrees");
                int healthMetric = systemService.nextInt();

                switch (healthMetric) {
                    case 1:
                        System.out.println("Kindly enter weight in kilograms:");
                        double weight = systemService.nextDouble();
                        System.out.println("Kindly enter height in meters:");
                        double height = systemService.nextDouble();
                        double bmi = weight / Math.pow(height, 2);
                        bmi = Math.round(bmi * 10) / 10.0;
                        System.out.println("BMI = " + bmi);
                        if (bmi < 18.5) {
                            System.out.println("You are underweight");
                        } else if (bmi >= 25.0 && bmi <= 29.9) {
                            System.out.println("You are overweight");
                        } else {
                            System.out.println("You have a normal weight");
                        }
                        break;
                    case 2:
                        System.out.println("Enter your required dosage in multiples of 250 mg:");
                        double dosage = systemService.nextDouble();
                        int pharmacyDispense = 250;
                        double numberOfTablet = dosage / pharmacyDispense;
                        System.out.println("Your number of tablets to be taken is " + (int) numberOfTablet);
                        break;
                    case 3:
                        System.out.println("Enter an angle in degrees:");
                        double angle = systemService.nextDouble();
                        double radians = Math.toRadians(angle);
                        double sinValue = Math.sin(radians);
                        double cosValue = Math.cos(radians);
                        sinValue = Math.round(sinValue * 1000) / 1000.0;
                        cosValue = Math.round(cosValue * 1000) / 1000.0;
                        System.out.println("Angle in radians: " + radians);
                        System.out.println("sin(angle) = " + sinValue);
                        System.out.println("cos(angle) = " + cosValue);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                break;
            case "C":
                System.out.println("Go to the Counseling desk");
                break;
            default:
                System.out.println("Invalid service code");
        }

        Random rand = new Random();
        char randomChar = (char) ('A' + rand.nextInt(26));
        int n1 = rand.nextInt(7) + 3;
        int n2 = rand.nextInt(7) + 3;
        int n3 = rand.nextInt(7) + 3;
        int n4 = rand.nextInt(7) + 3;
        String shortID = "" + randomChar + n1 + n2 + n3 + n4;

        if (shortID.length() != 5) {
            System.out.println("Invalid length");
        } else if (!Character.isLetter(shortID.charAt(0))) {
            System.out.println("Invalid: first char must be a letter");
        } else if (!(Character.isDigit(shortID.charAt(1)) &&
                     Character.isDigit(shortID.charAt(2)) &&
                     Character.isDigit(shortID.charAt(3)) &&
                     Character.isDigit(shortID.charAt(4)))) {
            System.out.println("Invalid: last 4 must be digits");
        } else {
            System.out.println("ID OK");
        }
        System.out.println("Generated Short ID: " + shortID);

        systemService.nextLine();

        System.out.println("Enter your first name:");
        String firstName = systemService.nextLine();

        char baseCode = Character.toUpperCase(firstName.charAt(0));
        char shiftedLetter = (char) ('A' + (baseCode - 'A' + 2) % 26);

        char lastCharacter1 = shortID.charAt(shortID.length() - 2);
        char lastCharacter2 = shortID.charAt(shortID.length() - 1);

        char shifted1 = Character.isLetter(lastCharacter1) ?
                        (char) ('A' + (Character.toUpperCase(lastCharacter1) - 'A' + 2) % 26) :
                        lastCharacter1;

        char shifted2 = Character.isLetter(lastCharacter2) ?
                        (char) ('A' + (Character.toUpperCase(lastCharacter2) - 'A' + 2) % 26) :
                        lastCharacter2;

        String shiftedLastTwo = "" + shifted1 + shifted2;
        String metric = String.valueOf(shiftedLetter);
        String finalCode = shiftedLastTwo + "-" + metric;

        System.out.println("Display Code: " + finalCode);
        String summary = "";
        System.out.println("Kindly enter weight in kilograms:");
        double weight = systemService.nextDouble();
        System.out.println("Kindly enter height in meters:");
        double height = systemService.nextDouble();
        double bmi = weight / Math.pow(height, 2);
        bmi = Math.round(bmi * 10) / 10.0;
        switch (service) {
            case "P":
               summary = "PHARMACY | ID=" + shortID + " | Code=" + finalCode;
               break;
            case "L":
               summary = "LAB | ID=" + shortID + " | Code=" + finalCode;
               break;
            case "T":
               summary = "TRIAGE | ID=" + shortID + " | BMI=" + bmi + " | Code=" + finalCode;
               break;
            case "C":
               summary = "COUNSELING | ID=" + shortID + " | Code=" + finalCode;
               break;
            default:
               summary = "Invalid service selected";
        }
        System.out.println("Summary: " + summary);
        
        




    }

}
    
 


