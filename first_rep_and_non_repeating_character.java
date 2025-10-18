import java.util.Scanner;
public class first_rep_and_non_repeating_character{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string:");
String str1=sc.nextLine();
String str=str1.toLowerCase();
int str_length=str.length();
if(str_length==0){
  return;
}
char[] arr=new char[str_length];
boolean nrpc_found=false;
for(int i=0;i<str_length;i++){
  arr[i]=str.charAt(i);
}
int a=0;
char nrpc=0;
char rpc=0;
boolean rpc_found=false;
    do{
      int count=0;
      int j=0;
      char candidate=arr[a];
      do{
  if(candidate==arr[j]){
    count+=1;
  }
  j++;
  }while(j<str_length);
  if(count==1 && !nrpc_found){
    nrpc=candidate;
    nrpc_found=true;
  }
  if(count>1 && !rpc_found){
    rpc=candidate;
    rpc_found=true;

  }
  a++;
}while(a<str_length);
if(nrpc_found){
System.out.println("First Non repeating character is:"+nrpc);
}
else{
  System.out.println("No nrpc was found!");
}
if(rpc_found){
  System.out.println("First repeating character is:"+rpc);
}
else{
System.out.println("No rpc was found");
}
sc.close();
}
}