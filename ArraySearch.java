import java.util.*;
public class ArraySearch 
{
public static void main(String[] args) 
{
System.out.println("23MCA016 Anjali E V  30/03/24");
System.out.println(" ");
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number of elements in the array: ");
int size = scanner.nextInt();
int[] array = new int[size];
System.out.println("Enter the elements of the array:");
for (int i = 0; i < size; i++) 
{
System.out.print("Element #" + (i + 1) + ": ");
array[i] = scanner.nextInt();
}
System.out.println("Enter the element to search: ");
int searchElement = scanner.nextInt();
boolean found = false;
for (int i = 0; i < size; i++) {
if (array[i] == searchElement) {
found = true;
break;
}
}
if (found) 
{
System.out.println(searchElement + " is present in the array.");
} 
else 
{
System.out.println(searchElement + " is not present in the array.");
}
scanner.close();
}
}