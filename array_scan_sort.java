import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class array_scan_sort {
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the index which upto you may enter they numbers to form an array:");
    int i=input.nextInt();
    input.nextLine();
    Integer[] arr=new Integer[i];
    for(int a=0;a<i;a++){
      System.out.print("Enter the integer at index no."+(a+1)+" :");
      arr[a]=input.nextInt();
    }
    Arrays.sort(arr);
    System.out.println("Descending arrays:"+Arrays.toString(arr));
    Arrays.sort(arr,Collections.reverseOrder());
    System.out.println("Descending reversed arrays:"+Arrays.toString(arr));
  input.close();
  }
}
