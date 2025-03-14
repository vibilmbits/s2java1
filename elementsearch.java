import java.util.*;
public class elementsearch
{
public static void main(String args[])
{
int count,num,i;
int inputarray[]=new int[500];
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of elements to be inserted:");
count=sc.nextInt();
System.out.println("start to enter those" +count+ "elements");
for(i=0;i<count;i++)
{
inputarray[i]=sc.nextInt();
}
System.out.println("enter the elemnt to be searched");
num=sc.nextInt();
for(i=0;i<count;i++)
{
if(num==inputarray[i])
{
System.out.println(num+" is present at index" +i+"!");
break;
}
}
if(i==count)
System.out.println(num+"is not present in the array!") ;
}
}