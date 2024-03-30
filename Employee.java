import java.util.*;
public class Employee 
{
int eNo;
String eName;
double eSalary;
public void getdetails()
{
System.out.println("\nEnter the Employee details");
Scanner sc = new Scanner(System.in);
System.out.println("Employee number : ");
eNo=sc.nextInt();
System.out.println("Name : ");
sc.nextLine();
eName=sc.nextLine();
System.out.println("Salary : ");
eSalary=sc.nextDouble();
}
void display(){
System.out.println("Empolyee No :"+eNo);
System.out.println("Name :"+eName);
System.out.println("Salary Amount:"+eSalary);
}
public static void main(String[] args) 
{
System.out.println("23MCA016 Anjali E V 30/03/24");
System.out.println(" ");
System.out.println("Enter the No. of Employee's:");
Scanner sc1 = new Scanner(System.in);
int num = sc1.nextInt();
Employee arr[]=new Employee[num];
for(int i =0;i<num;i++){
arr[i]=new Employee();
arr[i].getdetails();
}
System.out.println("Informations of all the employee's:");
for(int i=0;i<num;i++){
arr[i].display();
}
boolean state = false;
System.out.println("Enter the Employee Number to get details of a employee:");
int num2= sc1.nextInt();
for(int i=0;i<num;i++)
{
if(arr[i].eNo==num2)
{
System.out.println("Employee details:");
arr[i].display();
}
}
}
}
