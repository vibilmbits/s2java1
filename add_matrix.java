import  java.util.Scanner;
public class add_matrix
{
public static void main(String args[])
{
int row,cols,i,j;
Scanner in=new Scanner(System.in);
System.out.println("enter the number of rows");
row=in.nextInt();
System.out.println("enter the number of cols");
cols=in.nextInt();
int mat1[][]=new int[row][cols];
int mat2[][]=new int[row][cols];
int res[][]=new int[row][cols];
System.out.println("enter the elements of matrix1");
for(i=0;i<row;i++)
{
for(j=0;j<cols;j++)
mat1[i][j]=in.nextInt();
System.out.println();
}
System.out.println("enter the elements of matrix2");
for(i=0;i<row;i++)
{
for(j=0;j<cols;j++)
mat2[i][j]=in.nextInt();
System.out.println();
}
for(i=0;i<row;i++)
for(j=0;j<cols;j++)

res[i][j]=mat1[i][j]+mat2[i][j];
 System.out.println("Sum of the matrices:");
        for (i = 0; i < row; i++) {
            
            for (j = 0; j < cols; j++) {
                System.out.print(res[i][j] + "\t");             }
            System.out.println(); }    }
}