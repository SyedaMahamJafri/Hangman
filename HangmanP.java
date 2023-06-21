
package PROJECT_DS;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
public class HangmanP{
    char[] arr;
    String word;
    int wrongguess;
    int letterdone;
    char[] playerguess ;
    LLGenericStack Stack;

    public HangmanP(){
        this.word = null;
        this.wrongguess = 0;
        this.letterdone = 0;
         Stack = new LLGenericStack();
        Stack.push(" \\o/ \n  |  \n / \\ ");
        Stack.push(" \\o/ \n  | \n / ");
        Stack.push(" \\o/ \n  |");
        Stack.push(" \\o  \n  | ");
        Stack.push("  o  \n  |");
        Stack.push("  o ");
    }

    public char[] ChosenWord(BSTnode r,BST wordlist){
        int rand = wordlist.getRandom(wordlist.size);
        String s = wordlist.RandomWord(r,rand);
        String a = "";
        arr = new char[s.length()];
        for (int i = 0 ; i < s.length() ; i++){
            arr[i] = s.charAt(i);
            if(arr[i] != ' '){
                a+= arr[i];
            }
        }
        this.word = a;
        playerguess = new char[arr.length];
        for(int i = 0 ; i < playerguess.length  ;i++){
            if(arr[i] != ' '){
                playerguess[i] = '_';
            }
            else
                playerguess[i] = ' ';
        }
        return arr;
    }
    public void compareWords(String guess, char[] arr) {

        int a  = 0;
        System.out.println();

        for (int i = 0; i < arr.length; i++) {

            if (playerguess[i]== '_' && arr[i] == guess.charAt(0)) {
                if(i==0){
                    playerguess[i]= Character.toUpperCase(arr[i]);
                }
                else
                {playerguess[i] = arr[i];}
                letterdone++;
            }
            else
                a++;
        }
        if (a == arr.length) {
            wrongguess++;
            printHangman();
            System.out.println();
            System.out.println();

            // call here the hangman drawmethod
            int guessesleft = 6 - wrongguess;

            System.out.println("Wrong Guesses :" + wrongguess + ". You have " + guessesleft + " guesses left");
            System.out.println();

            if (guessesleft > 0 && guessesleft <= 2) {
                giveHint();
            }
        }
        System.out.print("Your Guessed Word : ");
        for (int i = 0; i < playerguess.length; i++) {
            System.out.print(playerguess[i]);
        }
        System.out.println();

    }
    public void SecretWord(){
        System.out.println("Word : ");
        for(int i = 0 ; i < word.length() ; i++){
            if(arr[i] != ' '){
                System.out.print("-");}
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    public void PlayGame(Scanner PlayerGuess){
        SecretWord();
        String guess = "";
        //j < word.length + 1
        //for(int j =0 ; (this.wrongguess != 7 || letterdone!= arr.length) ; j++)
        // while(wrongguess< 6 && this.letterdone <= arr.length) {
        while(this.letterdone <= arr.length) {
            if(this.wrongguess == 6){
                System.out.println();
                System.out.println("Sorry couldn't guess the word. Game Over");
                System.out.print("Secret Word was : ");
                for(int i = 0 ; i < word.length() ; i++){
                    if(i == 0){
                        System.out.print(Character.toUpperCase(arr[i]));
                    }
                    else{
                    System.out.print(arr[i]);}
                }
                break;
            }
            if(this.letterdone == word.length()){
                String grinningFace = "\uD83D\uDE00";
                System.out.println("Congratulations.You Win!!. You guessed the right word. ");
                break;
            }
            else {
                System.out.println("Please enter your guess");
                guess = PlayerGuess.next();
                compareWords(guess, arr);
            }

        }
    }

    public void giveHint(){
        try {
            System.out.println("Do you want to take a hint? Enter 1 for yes and 2 for no");
            Scanner hint = new Scanner(System.in);
            int Hint = hint.nextInt();
            boolean hintfind = false;
            char hintfound = ' ';
            if (Hint == 1) {
                while (hintfind == false) {
                    int rand = (int) (Math.random() * (arr.length - 1)) + 1;
                    //System.out.println(rand);
                    if (playerguess[rand] == '_') {
                        // playerguess[rand] = arr[rand];
                        // letterdone++;
                        hintfind = true;
                        hintfound = arr[rand];
                    }
                }
                for(int i = 0 ; i < arr.length ; i++){
                    if(arr[i] == hintfound)
                    {
                        playerguess[i] = arr[i];
                        letterdone++;
                    }
                }
            }
        }
        catch(InputMismatchException e){
            System.out.println("Press either 1 for Yes or 2 for No for your desired action");
        }
    }
    public void printHangman(){
        System.out.println("_____");
        System.out.println("  |  ");
        System.out.println( Stack.pop());

    }
}