import java.util.Scanner;
public class array_int_max_min_checker {
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the index which upto you want to input numbers:");
    int i=input.nextInt();
    input.nextLine();
    int[] arr=new int[i];
    for(int a=0;a<arr.length;a++)
    {
      System.out.print("\nEnter integer for entry no."+(a+1)+" :");
      arr[a]=input.nextInt();
    }
    input.nextLine();
    int max=arr[0],min=arr[0];
    for(int x=1;x<i;x++){
      if(arr[x]>max){
        max=arr[x];
      }
      if(arr[x]<min){
        min=arr[x];
      }
    }
    System.out.println("Maximum is:"+max);
    System.out.println("Minimum is"+min);
  }
}