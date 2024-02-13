import java.util.*;
class Product
{
String pcode,pname;
int price;
Product(String pcode,String pname,int price)
{
this.pcode=pcode;
this.pname=pname;
this.price=price;
}
void putData()
{
System.out.println("Product code:"+pcode);
System.out.println("Product name:"+pname);
System.out.println("Product price:"+price);

}
public static void main(String[] args)
{
System.out.println("23mca016 Anjali 13/02/24");
Product p1=new Product("1","Laptop",50000);
Product p2=new Product("2","Keybord",1000);
Product p3=new Product("3","Monitor",25000);

p1.putData();
p2.putData();
p3.putData();
if(p1.price > p2.price && p1.price > p3.price)
{
System.out.println("Product 1 is largest "+p1.price);
}
 else if(p2.price > p3.price && p2.price > p1.price)
{
System.out.println("Product 2 is largest "+p2.price);
}
else
{
System.out.println("Product 3 is largest "+p3.price);
}

}

}





