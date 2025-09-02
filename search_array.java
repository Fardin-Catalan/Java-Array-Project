import java.util.Scanner;
public class search_array {
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the index which upto integers may be submitted:");
    int i=input.nextInt();
    int[] arr=new int[i];
    for(int a=0;a<arr.length;a++){
      System.out.print("Enter the integer of entry no."+(a+1)+":");
      arr[a]=input.nextInt();
    }
    System.out.print("Enter the integer you want to search in the array list:");
    int x=input.nextInt();
    boolean found= false;
    for(int l=0;l<arr.length;l++){
      if(x==arr[l]){
        found=true;
        break;
      }
    }
    if(found)
    {
      System.out.println("Target integer is found in the array");
    }
    else{
      System.out.println("Target is not found in the array");
    }
input.close();
  }
}
