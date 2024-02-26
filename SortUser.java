import java.io.*;
import java.util.*;
public class SortUser
{
public static void main(String[] args)
{
System.out.println("Anjali E V 23MCA016 26/02/24 \n");
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of string you want:");
n=s.nextInt();
String string[]=new String[n];
Scanner s1=new Scanner(System.in);
System.out.println("Enter the strings");
for(int i=0;i<n;i++)
{
string[i]=s1.nextLine();
}
System.out.println("Array is:"+Arrays.toString(string));
Arrays.sort(string);
System.out.println("Sorted array is:"+Arrays.toString(string));
}
}
