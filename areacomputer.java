import java.util.*;
public class areacomputer
{
int a;
int area;
float x;
double y;
void area(int l,int b)
{
int length=l;
int breadth=b;
a=length*breadth;
System.out.println("-> area:"+a);
}
void area(int s)
{
int side=s;
area=side*side;
System.out.println("-> area:"+area);
}
void area(float b ,float h)
{
float base=b;
float height=h;
x=(base*height)/2;

System.out.println("-> area:"+x);
}
void area(double r)
{
double radius=r;
y=3.14*radius*radius;
System.out.println("-> area:"+y);
}
public static void main(String args[])
{
areacomputer obj=new areacomputer();
Scanner sc=new Scanner(System.in);
System.out.println("area of different shapes");
System.out.println("\n rectangle");
System.out.println("enter length and breadth");
int l=sc.nextInt();
int b=sc.nextInt();
obj.area(l,b);
System.out.println("\n square");
System.out.println("enter the side");
int s=sc.nextInt();
obj.area(s);
System.out.println("\n triangle");
System.out.println("enter the base and height of triangle");
float base=sc.nextFloat();
float h=sc.nextFloat();
obj.area(base,h);


System.out.println("\n circle");
System.out.println("\n enter the radius of circle");
double r=sc.nextDouble();
obj.area(r);
sc.close();
}
}


