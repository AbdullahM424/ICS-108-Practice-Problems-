import java.util.*;
public class Score {
    public static void main(String[] args){
      double score;
      boolean flag= true;
      Scanner input= new Scanner(System.in);
      while(flag){
      System.out.print("Enter you score: ");
      score= input.nextDouble();
      if (score>=60){
        System.out.println("You pass th exam.");
      }
      else if ((score<60) &&(score>=0)){
        System.out.println("You don't pass the exam.");
        
      }
      else {
        if (score==-1){
            flag= false;
            System.out.print("Program Terminated");
            
        }
    }
    }
}
}
