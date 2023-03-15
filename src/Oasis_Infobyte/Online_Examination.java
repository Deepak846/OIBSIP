package Oasis_Infobyte;
import javax.management.timer.Timer;
import java.util.Scanner;

public class Online_Examination {
    public static void main(String[] args) {
        Timer time;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Your Login Details");
        System.out.println("Username");
        String username=sc.nextLine();
        System.out.println("Password");
        String Password=sc.nextLine();
        System.out.println("If you want to update your profile and password , Press - 1 , otherwise press other key");
            int choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Update Your Name");
                String New_Name=sc.nextLine();
                System.out.println("Enter your old password");
                String Old_Password=sc.nextLine();
                System.out.println("Enter your new password");
                String New_Password=sc.nextLine();
                System.out.println("Your profile has been updated");
                break;
            default:
                break;
         }
                 System.out.println("\t\tPlease select answers for mcqs");
                 System.out.println("Capital of INDIA- \n 1. Mumbai\n 2. Delhi\n 3. Gujarat\n 4.Bangalore");
                choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Mumbai");
                break;
            case 2:
                System.out.println("Delhi");
                break;
            case 3:
                System.out.println("Gujarat");
                break;
            case 4:
                System.out.println("Bangalore");
                break;
                }
                System.out.println("Who is the Prime Minister of INDIA- \n 1. Amit Shah\n 2. Shivraj Singh\n 3. Narendra Modi\n 4. Mayavati");
                choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Amit Shah");
                break;
            case 2:
                System.out.println("Shivraj Singh");
                break;
            case 3:
                System.out.println("Narendra Singh");
                break;
            case 4:
                System.out.println("Mayavati");
                break;
        }
                 System.out.println("When we celebrate Republic Day- \n 1. 15 August\n 2. 4 June\n 3. 26 January\n 4.25 December");
                choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("15 August");
                break;
            case 2:
                System.out.println("4 June");
                break;
            case 3:
                System.out.println("26 January");
                break;
            case 4:
                System.out.println("25 December");
                break;
        }
                System.out.println("Your Result will be update soon");
        System.out.println("For closing the session and logout Press - 1");
                choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Your account has been logout");
                System.out.println("\t\tHave a good day");
                break;
        }
    }
}