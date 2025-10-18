import java.util.Scanner;
public class msi_nrpc_finder {
  public static void main(String[] args ){
    Scanner in=new Scanner(System.in);
 System.out.print("Enter a string:");
 String word=in.nextLine();
 char result='$';//In the described question,default answer was given'$'
 int i;
 char candidate;
 boolean is_repeating;
 for(i=0;i<word.length();i++)
 {
   is_repeating=false;
  candidate=word.charAt(i);
  for(int j=0;j<word.length();j++){
  if(i!=j && word.charAt(j)==candidate){
  is_repeating=true;
  break;
   }
   }
   if(!is_repeating){
    result=candidate;
    break;
   }
   }
 System.out.println("The non-repeating character is:"+result);
 in.close();
   }
  }
