import java.util.Scanner;

class MarkGenerator{
    static void generateMark(){
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME : ");
        int[] marks =  new int[6];
        int count=0,totalMarks=0,percentage=0;
        String[] subjectName = {"MATHS","SCIENCE","SOCIAL SCIENCE","ENGLISH","GUJRATI","HINDI"};
        while (count<6) {
            System.out.println("ENTER YOUR " +subjectName[count] +" MARKS");
            marks[count]=sc.nextInt();
            totalMarks = totalMarks+marks[count];
            count++;
        }
        percentage = totalMarks/6;
        System.out.println("YOUT TOTAL MARKS IS " +totalMarks);
        System.out.println("YOUT PERCENTAGE IS " +percentage);
        if (percentage>80) {
            System.out.println("YOUR GRADE IS A");
        }
        else if (percentage>70 && percentage<80) {
            System.out.println("YOUR GRADE IS B");
        }
        else if (percentage>60 && percentage<70) {
            System.out.println("YOUR GRADE IS C");
        }
        else{
            System.out.println("YOUR GRADE IS D");
        }
    }
}
public class GradeCalculator {
    public static void main(String[] args) {
        MarkGenerator.generateMark();
    }
}
