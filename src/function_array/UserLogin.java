/*Suppose a software system excepts valid credentials from user to logged in to the system.
if the user inputs wrong password for 3 times,
system will say that "Your user has been temporary locked". Let the username: admin, password: adm1n*/

package function_array;

import java.util.Objects;
import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String username="admin";
        String password="adm1n*/";
        logInSystem(username,password);
    }
    public static void logInSystem(String username,String password)
    {
        Scanner input = new Scanner(System.in);
        int count=0;
        while(true)
        {

            System.out.println("Enter Username:");
            String comparedName=input.nextLine();
            System.out.println("Enter Password:");
            String comparedPassword=input.nextLine();
            if(Objects.equals(comparedName,username) && Objects.equals(comparedPassword,password))
            {
                System.out.println("Successfully logged into the system");
                break;
            }
            else
            {
                count++;
                if(count==3)
                {
                    System.out.println("Your user has been temporary locked");
                    break;
                }
            }


        }

    }
}
