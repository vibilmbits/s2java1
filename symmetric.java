import java.util.Scanner;
public class symmetric
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of rows of the matrix");
int row=sc.nextInt();

System.out.println("enter the no of cols of the matrix");
 int col = sc.nextInt();
        
int matrix[][]=new int[row][col];
int i,j;
boolean state=true;
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{ 
System.out.println("enter the elemnt at M("+i+" ,"+j+")");
matrix[i][j]=sc.nextInt();
}
}
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
if(matrix[i][j]!=matrix[j][i])
{
state=false;
break;
}
}
}
if(state)
{
System.out.println("matrix is symmetric");
}
else
{
System.out.println("matrix is symmetric");
}
}
}
