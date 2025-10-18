import java.util.Scanner;
public class ascii_case_conversion {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a single character:");
    char ch=sc.next().charAt(0);
    if(ch>='A'&& ch<='Z'){
      char letter=(char)(ch+32);
      System.out.println("Lowercase:"+letter);
    }
      if(ch>='a'&& ch<='z'){
        char letter1=(char)(ch-32);
        System.out.println("Uppercase:"+letter1);
      }
      sc.close();
    }
}
