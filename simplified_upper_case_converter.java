import java.util.Scanner;
public class simplified_upper_case_converter {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    System.out.print("Enter a string:");
    String word=in.nextLine();
    int len=word.length();
    for(int i=0;i<len;i++){
      char ch=word.charAt(i);
      int ascii=(int)ch;
      if(ascii>=97 && ascii<=122){
        char new_word=(char)(ascii-32);
        System.out.print(new_word);
      }
      else{
        System.out.print(ch);
      }
    }
    in.close();
  }
}
