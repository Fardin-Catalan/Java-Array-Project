import java.util.Scanner;
public class Matrixaddition{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the value of the row for the matrix:");
    int row1=input.nextInt();
    System.out.print("Enter the value of the column for the matrix:");
    int col1=input.nextInt();
    input.nextLine();
    //First matrix
    int[][] arr1=new int[row1][col1];
    for(int i=0;i<row1;i++){
      for(int j=0;j<col1;j++){
        System.out.print("Enter the element at ["+(i+1)+"]["+(j+1)+"]position:");
        arr1[i][j]=input.nextInt();
      }
    }
    System.out.println("The first matrix is:");
    for(int i=0;i<row1;i++){
      for(int j=0;j<col1;j++){
        System.out.print(arr1[i][j]+" ");
      }
      System.out.println();
    }
    //Second Matrix
    int[][] arr2=new int[row1][col1];
    for(int i=0;i<row1;i++){
      for(int j=0;j<col1;j++){
        System.out.print("Enter the element at ["+(i+1)+"]["+(j+1)+"]position:");
        arr2[i][j]=input.nextInt();
      }
    }
    System.out.println("The second matrix is:");
    for(int i=0;i<row1;i++){
      for(int j=0;j<col1;j++){
        System.out.print(arr2[i][j]+" ");
      }
      System.out.println();
    }
    int[][] arr3=new int[row1][col1];
    for(int i=0;i<row1;i++){
      for(int j=0;j<col1;j++){
        arr3[i][j]=arr1[i][j]+arr2[i][j];
      }
    }
    System.out.println("The sum of the two matrix is shown below:");
    for(int i=0;i<row1;i++){
      for(int j=0;j<col1;j++){
        System.out.print(arr3[i][j]+" ");
      }
      System.out.println();
    }
    input.close();
  }
}