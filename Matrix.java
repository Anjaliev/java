import java.io.*;
import java.util.*;
class Matrix
{
public static void main(String[] args)
{
System.out.println("23MCA016 Anjali E V  13/02/24");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of row:");
int r=sc.nextInt();
System.out.println("Enter the number of column:");
int c=sc.nextInt();
int a[][]=new int[r][c];
int b[][]=new int[r][c];
System.out.println("Enter the 1st matrix");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
a[i][j]= sc.nextInt();
}
}
System.out.println("Enter the 2nd matrix");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
b[i][j]= sc.nextInt();
}
}
System.out.println("Sum of the matrix is:");
int sum[][]=new int[r][c];
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
sum[i][j]=a[i][j]+b[i][j];
System.out.print(sum[i][j]+" ");
}
System.out.println();
}
}
}
