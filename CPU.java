import java.io.*;
public class CPU
{
int price;
class Processor
{
int cores;
String producer;
Processor(int noC,String manuf)
{
cores=noC;
producer=manuf;
}
void display()
{
System.out.println("Processor Information:");
System.out.println("Number of cores:"+cores);
System.out.println("Manufacture:"+producer);
}
}
static class ram
{
int mem;
String manufact;
ram(int memory,String producer)
{
mem=memory;
manufact=producer;
}
void display()
{
System.out.println("Ram information:");
System.out.println("Memory:"+mem+"GB");
System.out.println("Manufacture:"+manufact);
}
}
public static void main(String[] args)
{
System.out.println("23MCA016  Anjali E V 14/02/24");
System.out.println(" ");
CPU.ram obj1=new CPU.ram(8,"Intel");
CPU obj2=new CPU();
CPU.Processor obj3=obj2.new Processor(8,"Samsung");
obj1.display();
obj3.display();
}
}



