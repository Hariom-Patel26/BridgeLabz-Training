/* 17.Online Quiz Application 
Ask 5 questions (MCQs) from a user.
1. Use arrays and for-loop.
2. Record score.
3. Switch for answer checking. Apply clear indentation and structured layout. */

import java.util.Scanner;
public class OnlineQuizApplication {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int correctCount = 0;

        //Storing the questions in an array
        String[] questions = { "1. What is the largest ocean on earth?",
                               "2. Who is known as the iron man of india ",
                               "3. How many reserve keywords available in java? ",
                               "4. Which is the largest mammal on Earth?",
                               "5. Which is the richest country in the world?"
                              };

       //Storing the options for the question
       String[][] options = { {"a). Atlantic Ocean" , "b). Indian Ocean", "C). Pacific Ocean" , "d). Arctic Ocean"},
                              {"a). Sardar Vallabhbhai Patel" , "b). JawaharLal Nehru", "c). Subhash Chandra Bose" ,"d). Mahatama Gandhi"},
                              {"a). 56" , "b). 62", "c). 53" , "d). 65"},
                              {"a). Elephant ", "b). Giraffe", "c). Hippopotamus" , "d). Blue Whale"},
                              {"a). UAE", "b). China" ,"c). India", "d). Quatar"}
                             };

       //Storing the correct option
       char[] correctOptions = {'c','a','c','d','d'};

       System.out.println("\n----------------Welcome to the quiz game------------");
       for (int i = 0; i < questions.length; i++) {
           boolean isCorrect = false;

           System.out.println("\n" + questions[i]);

           for (String option: options[i]) {
               System.out.println("\n" + option);
           }

           char choice;
           do {
               System.out.println("Enter your choice : ");
               choice = kb.next().toLowerCase().charAt(0);
           } while (choice != 'a' && choice != 'b' && choice != 'c' && choice != 'd');

           switch (choice) {
               case 'a' -> {
                   if (correctOptions[i] == 'a') {
                       System.out.println("-------------------------\nYour answer is correct !!");
                       correctCount++;
                   } else {
                       System.out.println("--------------------------\n!WRONG ANSWER");
                   }
               }

               case 'b' -> {
                  if (correctOptions[i] == 'b') {
                       System.out.println("--------------------------\nYour answer is correct !!");
                       correctCount++;
                  } else {
                       System.out.println("---------------------------\n!WRONG ANSWER");
                  }
              }

               case 'c' -> {
                  if (correctOptions[i] == 'c') {
                       System.out.println("---------------------------\nYour answer is correct !!");
                       correctCount++;
                  } else {
                       System.out.println("----------------------------\n!WRONG ANSWER");
                  }
              }

              case 'd' -> {
                  if (correctOptions[i] == 'd') {
                       System.out.println("-----------------------------\nYour answer is correct !!");
                       correctCount++;
                  } else {
                       System.out.println("------------------------------\n!WRONG ANSWER");
                  }
              }
           }
       } 

        //Printing the final result
        System.out.println("==============SCORE===============");
        System.out.println("\nNo of correct answers is : " + correctCount);
        System.out.println("\n==================================");
        kb.close();
    }
}