import java.util.Scanner;
public class quiz {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //questions array
        //options array;
        //declare variables
        //welcome msg
        //question loop
        //options
        //guess
        //check our guess
        //display final score
        String[] questions={"WHAT IS HARRY'S MOTHER'S NAME",
                            "NAME OF HARRY'S SCHOOL",
                            "HERMOINE'S FULL NAME",
                            "WHO IS YOUR FAV CARECTER"};
        String[][] options={{"1.lily"," 2.hermoine", "3.dumbeldore"},
                            {"1.magic school"," 2.hogwarts", "3.snape"},
                            {"1.granger"," 2.potter", "3.malfoy"},
                            {"1.harry"," 2.hermoine", "3.draco"}};
                            
        int[] answers={1,2,1,1};
        int score=0;
        int guess;
        System.out.println("*************************************");
        System.out.println("WELCOME TO HARRY POTTERS QUIZ");
        System.out.println("***************************************");
        for (int i=0;i<questions.length;i++){
            System.out.println(questions[i]);

            for (String option:options[i]) {
                System.out.println(option);
            }

            System.out.print("enter your guess:");
            guess=scanner.nextInt();

            if(guess==answers[i]){
                System.out.println("correct!!");
                System.out.println("****************");
                score++;

            }
            else{
                System.out.println("Incorrect!!");
                System.out.println("****************");
            }
        }
        System.out.println("ur final score is" + score+"out of"+questions.length);


        scanner.close();
    }
    
}
