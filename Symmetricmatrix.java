import java.io.*;
import java.util.*;
class Symmetricmatrix
{
public static void main(String[] args)
{
System.out.println("23MCA016 Anjali E V 14/02/24");
Scanner in=new Scanner(System.in);
System.out.println("Enter the number of row and column:");
int r=in.nextInt();
int c=in.nextInt();
int matrix1[][]=new int[r][c];
System.out.println("Enter the matrix:");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
matrix1[i][j]=in.nextInt();
}
}
if(r!=c)
{
System.out.println("Cannot find Symmetric");
}
else
{
boolean sym=true;
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
if(matrix1[i][j]!=matrix1[j][i])
sym=false;
}
}
if(sym)
{
System.out.println("This is Symmetric matrix");
}
else
{
System.out.println("This is not Symmetric matrix");
}
}
}
}
