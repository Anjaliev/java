import java.io.*;
import java.util.*;
class Complex
{
int r;
int img;
public Complex()
{
}
public Complex(int real,int image)
{
r=real;
img=image;
}
void display(int real,int image)
{
System.out.println(real+ "+i"+image);
}
}
class Maincomplex
{
public static void main(String[] args)
{
System.out.println("23MCA016 Anjali E V 14/02/24");
Scanner in=new Scanner(System.in);
System.out.println("Enter the real part of the 1st complex number:");
int r1=in.nextInt();
System.out.println("Enter the image part of the 1st complex number:");
int i1=in.nextInt();
System.out.println("Enter the real part of the 2nd complex number:");
int r2=in.nextInt();
System.out.println("Enter the image part of the 2nd complex number:");
int i2=in.nextInt();
Complex c1=new Complex(r1,i1);
System.out.println("1st complex number:");
c1.display(r1,i1);
Complex c2=new Complex(r2,i2);
System.out.println("2nd complex number:");
c2.display(r2,i2);
int creal=c1.r+c2.r;
int cimage=c1.img+c2.img;
System.out.println("Sum of the both complex number:");
Complex c=new Complex();
c.display(creal,cimage);
}
}


