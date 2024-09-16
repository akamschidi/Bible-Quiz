import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.nio.charset.CharacterCodingException;



public class QuizClass02 {

    public void quizMethod(){
      int correctAnswer = 0;
      int wrongAnswer = 0;
      Scanner input = new Scanner(System.in);

        QuizClass01 q1 = new QuizClass01("1. What is the first book of the bible?", "A. Jeremiah", "B. Revelations", "C. Genesis", "D. Psalms");
        QuizClass01 q2 = new QuizClass01("2. How many days did it take God to create the world?", "A. Two ", "B. Seven", "C. Five", "D. Four");
        QuizClass01 q3 = new QuizClass01("3. Who killed Goliath?", "A. David", "B. Saul", "C. Adam", "D. Eve");
        QuizClass01 q4 = new QuizClass01("4. How many commandments did Moses receive?", "A. Twelve", "B. Eleven", "C. Five", "D. Ten");
        QuizClass01 q5 = new QuizClass01("5. How many disciples did Jesus have?", "A. Twelve", "B. Eleven", "C. Ten", "D. Nine");

        Map <QuizClass01, Character> newQuiz = new HashMap<>();
        newQuiz.put(q1, 'C');
        newQuiz.put(q2, 'B');
        newQuiz.put(q3, 'A');
        newQuiz.put(q4, 'D');
        newQuiz.put(q5, 'C');

        for(Map.Entry<QuizClass01, Character> quizzy: newQuiz.entrySet()){
          System.out.println(quizzy.getKey().getQuestion());
          System.out.println(quizzy.getKey().getAnswer01());
          System.out.println(quizzy.getKey().getAnswer02());
          System.out.println(quizzy.getKey().getAnswer03());
          System.out.println(quizzy.getKey().getAnswer04());
        
        System.out.println("Enter The Correct Answer: ");
        Character answer = input.next().charAt(0);

      int answerSelect = Character.compare(answer, quizzy.getValue());
       
       if(answerSelect == 0){
        System.out.println("Correct Answer.....");
        correctAnswer++;
       }
       else {
        System.out.println("Wrong Answer...");
        wrongAnswer++;
        break;
       }
      }
      System.out.println("**********Result************");
    System.out.println("Correct Answer: " +  correctAnswer);
    System.out.println("Wrong Answer: " + wrongAnswer);
    int percent = (100*correctAnswer)/newQuiz.size();
    System.out.println("Percentage: " + percent);
   
      
      if(percent < 50){
        System.out.println("Failed. Repeat Quiz");
      }
      else if(percent >= 50 && percent <= 60){
        System.out.println("Grade B... Good");
      }
      else if (percent >60 && percent <= 75){
        System.out.println("Grade B+... Very Good");
      }
      else if (percent > 75){
        System.out.println("Grade A... Excellent");
      }

    

    }
  }
