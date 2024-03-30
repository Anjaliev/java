import java.util.*;
public class String_man
{
public static void main(String[] args) 
{
System.out.println("23MCA016 Anjali E V 30/3/24 ");
System.out.println(" ");
System.out.println("Enter The String");
Scanner sc = new Scanner(System.in);
String str1 = sc.nextLine();
System.out.println("Length of String = "+str1.length());
System.out.println("Character at First position = "+str1.charAt(0));
System.out.println("String Contains 'o' sequence :"+str1.contains("o"));
System.out.println("String ends with e : "+str1.endsWith("e"));
System.out.println("Replace'o' with 'u' : "+str1.replaceAll("o","u"));
System.out.println("LOWERCASE : "+str1.toLowerCase());
System.out.println("UPPERCASE : "+str1.toUpperCase());
}
}
