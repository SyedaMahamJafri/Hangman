package src;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class project {
    public static void main(String[] args){

        BST<Integer> bst = new BST<>();

        System.out.println("Welcome to the Hangman game");
        System.out.println();

        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a number between 1 to 6 to choose your desired theme");
            System.out.println("1.Countries");
            System.out.println("2.Animals");
            System.out.println("3.Fruits");
            System.out.println("4.Vegetables");
            System.out.println("5.Movies");
            System.out.println("6.Famous Places");

            System.out.println();
            System.out.println("Enter a number of your choice");
            int choice = in.nextInt();
            String path = "";
            if (choice == 1) {
                path = "C:\\Users\\User\\OneDrive - Institute of Business Administration\\Desktop\\IBA\\3rd Semester\\DS\\project files\\Countries.txt";
            } else if (choice == 2) {
                path = "C:\\Users\\User\\OneDrive - Institute of Business Administration\\Desktop\\IBA\\DS\\project files\\animals.txt";
            } else if (choice == 3) {
                path = "C:\\Users\\User\\OneDrive - Institute of Business Administration\\Desktop\\IBA\\DS\\project files\\Fruits.txt";
            } else if (choice == 4) {
                path = "C:\\Users\\User\\OneDrive - Institute of Business Administration\\Desktop\\IBA\\DS\\project files\\Vegetables.txt";
            } else if (choice == 5) {
                path = "C:\\Users\\User\\OneDrive - Institute of Business Administration\\Desktop\\IBA\\DS\\project files\\movies.txt";
            } else if (choice == 6) {
                path = "C:\\Users\\User\\OneDrive - Institute of Business Administration\\Desktop\\IBA\\DS\\project files\\famousplaces.txt";
            }

            // getting the path of file
            Path p = Paths.get(path);
            // counting the number of lines in the file so that we can make an array according to that
            int lines = (int) Files.lines(p).count();

            File f = new File(path);
            Scanner input = new Scanner(f);
            String[] dictionary= new String[lines];

            for(int i = 0; input.hasNextLine(); i++){
                // reading each line one by one from the file through scanner
                String temp  = input.nextLine();
                dictionary[i] = temp;
            }

            for (int i =0 ; i < dictionary.length ; i++){
                // using the random class for shuffling
                int random = (int) (Math.random()* dictionary.length);

                // shuffling the elements using the temperory method
                String temp = dictionary[random];
                dictionary[random] = dictionary[i];
                dictionary[i] = temp;
            }

            int bstsize = 0;
            BST<String> mybst = new BST<>();
            for (int i =0 ; i < dictionary.length ; i++){
                BSTnode n = new BSTnode(dictionary[i]);
                // inserting the nodes in the bst class
                n = mybst.insert(n.word);
            }
            input.close();

            System.out.println();
            Hangman game = new Hangman();
            char[] word = game.ChosenWord(mybst.root , mybst);

            Scanner player = new Scanner(System.in);
            game.PlayGame(player);


        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        //catching the Input Output exception here
        catch(IOException e){
            System.out.println(e);
        }


    }
}
class BST<T extends Comparable<T>> {
    BSTnode<T> root;
    int size;
    int index;

    public BST() {
        this.size = 0;
        this.index = 0;
    }


    // void
    public BSTnode insert(String word) {
        BSTnode<T> n = new BSTnode<>(word);
        this.size++;
        // first case insertion; checking whether the root is empty or not ; if it is empty then have to insert at root
        if (root == null) {
            root = n;
            root.index = index;
            root.left = null;
            root.right = null;
        }
        // if not inserting at root then need to decide which side to move on whether left or right from root and onwards
        else {
            index++;
            //starting from root hence assigning both the temp variables the address of root
            BSTnode<T> prev = root;
            BSTnode<T> temp = root;

            //traversal to first find the location to whose left or right the dqta needs to be placed in the tree
            while (temp != null) {
                //storing the current node to previous node so that the node in which it has to be inserted doesnt gets lost
                prev = temp;
                if (word.compareTo(temp.word) < 0) {
                    temp = temp.left;
                } else {
                    temp = temp.right;
                }
            }
            //if the data is less then you have to move to the left node
            if (word.compareTo(prev.word) < 0) {
                prev.left = n;
                n.index = index;
            }
            //if the data is greater than or equal then you have to move to the right node
            else {
                prev.right = n;
                n.index = index;
            }
        }
        return n;
    }

    public int sizeBST(BSTnode n) {
        // addition of 1 is for root node of the BST since it doesnt belong to the left and the right subtree
        if (n != null)
            // traversal of right and left subtree to get the total number of nodes for both
            return 1 + sizeBST(n.left) + sizeBST(n.right);
        return 0;
    }
    String s = "";

    public String RandomWord(BSTnode r, int rand) {
        boolean found = false;
        if (r != null && r.index == rand && found == false) {
            found = true;
            s = r.word;
            //System.out.println(s = r.word);
            return s;
        }
        if (r == null) {
            return "";
        } else {
            RandomWord(r.left, rand);

            RandomWord(r.right, rand);
        }
        //  System.out.println(s);
        return s;
    }

    public int getRandom(int bstsize) {
        int rand = (int) (Math.random() * (bstsize - 1)) + 1;

        return rand;
    }

}
class Hangman{
    char[] arr;
    String word;
    int wrongguess;
    int letterdone;
    char[] playerguess ;
    LLGenericStack Stack ;

    public Hangman(){
        this.word = null;
        this.wrongguess = 0;
        this.letterdone = 0;
        Stack = new LLGenericStack();
        Stack.push("    \\O/ \n     | \n    / \\ ");
        Stack.push("    \\O/ \n     | \n    / ");
        Stack.push("    \\O/ \n     |");
        Stack.push("    \\O  \n     |");
        Stack.push("     O  \n     | ");
        Stack.push("     O ");


    }

    public char[] ChosenWord(BSTnode r, BST wordlist){
        // a random index number is being generated here
        int rand = wordlist.getRandom(wordlist.size);
        // by using the random index generated we are choosing a node and using its word as secret word
        String s = wordlist.RandomWord(r,rand);
        String a = "";
        arr = new char[s.length()];
        for (int i = 0 ; i < s.length() ; i++){
            arr[i] = s.charAt(i);
            if(arr[i] != ' '){
                a+= arr[i];
            }
        }
        // we have used a seperate variable a since for cases which have two words along with space between them the length for letterdone and arr wont be the same hence
        // even after guessing correctly all the letters the game wont end unless you make one more guess
        this.word = a;
        // the player guess is the array which stores all the correct guesses made by the player
        playerguess = new char[arr.length];
        //System.out.println(word.length());
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
                System.out.println("Congratulations.You Win!!. You guessed the right word. " + grinningFace);
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
                    if (playerguess[rand] == '_') {
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
            System.out.println("Wrong press !! Press either 1 for Yes or 2 for No for your desired action");
            System.out.println();
        }
    }
    public void printHangman(){
        System.out.println("__________");
        System.out.println("     |    ");


        System.out.println(Stack.pop());

    }
}

class BSTnode<T>{
    String word;
    int index;
    BSTnode<T> right;
    BSTnode<T> left;

    BSTnode(String w ){
        this.word = w;
    }

    public void Tostring(){
        System.out.println(this.word + "  " + this.index);
    }
}
class StackNode<T>{
    T data;
    StackNode<T> next;
    StackNode(T data){
        this.data = data;
    }

}
class LLGenericStack<T> {
    StackNode<T> head;
    int size = 0;


    public boolean isempty() {
        return (head == null);
    }

    public void push(T data) {
        StackNode<T> n = new StackNode(data);
        if (isempty() == true) {
            head = n;
            size++;
        } else {
            // initially n.next is null
            n.next = head;
            //giving top the addressof new node
            head = n;
            size++;
        }

    }

    public T pop() {
        StackNode<T> temp = head;
        if (isempty() == true) {
            System.out.println("Stack underflow. Pop function is not possible");
        } else {
            head = head.next;
            size--;
        }
        return temp.data;
    }

    public String toString() {
        StackNode<T> temp = head;
        String str = "";
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        return str;
    }
}
