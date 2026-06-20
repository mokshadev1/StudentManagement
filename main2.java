import java.util.Scanner;
public class main2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String username = "Moksha";
        String password = "54321";

        int otp = 6969 ;
        System.out.println("===================================");
        System.out.println("       AUTHENTICATION SYSTEM       ");
        System.out.println("===================================");

        System.out.println("1. Login");
        System.out.println("2. Forgot Password");
        System.out.println("3. Exit");
        
        System.out.println("Choose Options:");
        int choice = sc.nextInt();
        sc.nextLine();

        switch(choice)
        {
            case 1 :
                System.out.println("Enter User Name : ");
                String user = sc.nextLine();

                System.out.println("Enter password :");
                String pass = sc.nextLine();

                if(user.equals(username) && pass.equals(password)){
                    System.out.println("Login Successfully");
                    System.out.println("Welcome " + username);
                }
                else {
                    System.out.println("Invalid UserName or Password");
                }
                break ;

                case 2 :
                    System.out.println("Enter UserName");
                    String forgotUser = sc.nextLine();
                if(forgotUser.equals(username)){
                    System.out.println("OTP sent Successfully");
                    System.out.println("Demo OTP = 6969");

                    System.out.println("Enter OTP");
                    int userOtp = sc.nextInt();
                    sc.nextLine();

                    if(userOtp == otp){
                        System.out.println("OTP Verified");

                        System.out.println("Enter New Password");
                        String newPass = sc.nextLine();

                        password = newPass ;
                        System.out.println("Password Updated successfully");
                        System.out.println("New Password : " + password);
                    }
                    else {
                        System.out.println("Invalid OTP");
                    }
                }
                    break;


                    case 3:
                        System.out.println("Thank You");
                        break;

                        default:
                            System.out.println("Invalid Choise");
                }
        }

    }