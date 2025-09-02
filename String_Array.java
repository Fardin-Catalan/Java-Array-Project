import java.util.Scanner;
public class String_Array {
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the index which upto you want to input names:");
    int i=input.nextInt();
    input.nextLine();
    String[] arr=new String[i];
    for(int a=0;a<arr.length;a++)
    {
      System.out.print("\nEnter name for entry no."+(a+1)+" :");
      arr[a]=input.nextLine();
    }
    for(int a=0;a<arr.length;a++){
      System.out.println("The name of entry no."+(a+1)+" is "+arr[a]);
    }
    input.close();
  }
}
