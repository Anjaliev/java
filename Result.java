//3.5
import java.io.*;
import java.util.Scanner;
class sports
{
String sport;
int Rating;
sports(String spo, int ra)
{
sport = spo;
Rating = ra;
}
}
class student extends sports
{
String Grade;
double Overall_per;
student(String spo, int ra,String gd, double per )
{
super(spo, ra);
Grade = gd;
Overall_per = per;
}
}
public class Result extends student 
{
Result(String spo, int ra,String gd, double per )
{
super(spo, ra, gd, per);
}
void display()
{
System.out.println("\nSports Details of Student");
System.out.println("Sport :"+sport);
System.out.println("Rating :"+Rating);
System.out.println("\nAcademic Details of Student");
System.out.println("Academic Grade :"+Grade);
System.out.println("Overall percentage :"+Overall_per);
}
public static void main(String[] args) 
{
Scanner sc =new Scanner(System.in);
System.out.println("Anjali E V (23MCA016)\n08/04/2024");
System.out.println();
System.out.println("Enter the Sports Details of Student");
System.out.println("Sport: ");
String a =sc.next();
System.out.println("Sport Rating out of 10: "); int
b =sc.nextInt();
System.out.println("Enter the Academic Details of Student");
System.out.println("Academic Grade: ");
String c =sc.next();
System.out.println("Overall percentage: ");
double d =sc.nextDouble();
sc.close();
Result obj= new Result(a,b,c,d);
obj.display();
}
}
