//4.3
import java.io.*;
import java.util.*;
class authException extends Exception
{
public authException(String s) {
super(s);
}
}
public class Password
{
public static void main(String[] args) {
System.out.println("Anjali E V(23MCA016)\n15/04/2024");
System.out.println();
String username = "student";
String passcode = "student123";
String user_name,password;
Scanner sc = new Scanner(System.in);
try
{
System.out.println("Enter the username:");
user_name = sc.nextLine();
System.out.println("Enter the password:");
password = sc.nextLine();
if(username.equals(user_name) && passcode.equals(password))
{
System.out.println("Authentication successful...");
}
else
throw new authException("Invalid user credentials");

}
catch(authException e)
{
System.out.println("Exception caught "+e);
}
}
}
