import java.util.Scanner;
public class HighScore {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
       
       int highScore=0;
         String highName="";
        int numberOfStudents;
        System.out.println("Enter the number of students:");
        numberOfStudents= input.nextInt();

        for(int i=0;i<numberOfStudents;i++){
            System.out.print("Student "+(i+1)+" name: "+"   ");
            String name= input.next();
            System.out.print("his/her score: ");  
            int score= input.nextInt();
            if(score>highScore){
                highScore=score;
                highName=name;
            }
        }
       System.out.print("The name of highest score is "+highName+" and the score is "+highScore);
        
    }
}
