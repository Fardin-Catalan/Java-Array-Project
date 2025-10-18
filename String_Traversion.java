public class String_Traversion{
  public static void main(String[] args){
    String s="Fardin";
    for(int i=0;i<s.length();i++){
      System.out.println("Character at index no."+i+" is "+ s.charAt(i));
    }
    for(char c:s.toCharArray()){
      System.out.println(c);
    }
    System.out.println("Another string operation below:");
    String a="Java";
    char[] arr=a.toCharArray();
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}