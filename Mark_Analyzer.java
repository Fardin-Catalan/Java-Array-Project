import java.util.Scanner;
public class Mark_Analyzer {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the total number of the students:");
    int StudentsNumber=sc.nextInt();
    String[] StudentNames=new String[StudentsNumber];
    int StudentMarks[]=new int[StudentsNumber];
    System.out.println("-----Enter Student Infos:-----");
    for(int i=0;i<StudentsNumber;i++){
      if(i==0){
        sc.nextLine();
      }
      System.out.print("Enter name for student no."+(i+1)+":");
      StudentNames[i]=sc.nextLine();
      System.out.print("Enter number for student no."+(i+1)+":");
      StudentMarks[i]=sc.nextInt();
      sc.nextLine();
    }
    int total_marks=0;
    int highest_mark=StudentMarks[0];
    String top_scorer=StudentNames[0];
    int lowest_mark=StudentMarks[0];
    String lowest_scorer=StudentNames[0];
    for(int i=0;i<StudentsNumber;i++){
      total_marks+=StudentMarks[i];
    }
    float average_mark=(float)total_marks/StudentsNumber;
    for(int i=1;i<StudentsNumber;i++){
      if(StudentMarks[i]>highest_mark){
        highest_mark=StudentMarks[i];
        top_scorer=StudentNames[i];
      }
      if(StudentMarks[i]<lowest_mark){
        lowest_mark=StudentMarks[i];
        lowest_scorer=StudentNames[i];
      }
    }
         System.out.println("--- Class Report ---");
        System.out.println("Average Marks: " + average_mark);
        System.out.println("Highest Mark: " + highest_mark + " (Scored by: " + top_scorer + ")");
        System.out.println("Lowest Mark: " +lowest_mark + " (Scored by: " + lowest_scorer + ")");
        System.out.println("--- End of Report ---");
        sc.close();
  }
  
}
