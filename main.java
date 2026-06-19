import java .util.Scanner;
public class main {
    public static void main(String[] args){
        System.out.println("Student Management System");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User Name :");
        String userName = sc.nextLine();
        System.out.println("Enter Password :");
        String password = sc.nextLine();
        String user1 = "Ram";
        String p1 = "1234";
        String user2 = "Deepanshu321";
        String p2 = "dl@321";
        String user3 =  "Moksha123";
        String p3= "md@123";

        if(userName.equals(user1)&& password.equals(p1)){
            System.out.println("Welcome " + userName +" Login Successful");}
            else if (userName.equals(user2) && password.equals(p2)){
                System.out.println("Welcome " + user2 +" Login Successful");}
                else if (userName.equals(user3) && password.equals(p3)){
                    System.out.println("Welcome " + user3 + " Login Successful");
                }
                else {
                    System.out.println("Invalid Details Password or Username Incorrect ");
        } 

    }
}