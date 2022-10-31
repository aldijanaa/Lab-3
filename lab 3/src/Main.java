import javax.naming.InsufficientResourcesException;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // object of scanner
        /*System.out.println("Hello world!");
        double answer = average(4,3,6,1);
        System.out.println("Average is " + answer); */

        //task 2
        /*System.out.println("Enter your name please: ");
        String name = reader.nextLine();
        System.out.println("Number of characters: " + name.length());*/

        //task 3
        /*System.out.println("Enter your name please: ");
        String name1 = reader.nextLine();
        int count = 1; //it's gonna count each character
        while(count <= name1.length()){  //going until the end of string
            System.out.println(count + " character " + name1.charAt(count-1)); //string is kinda array of chars, reaching final char
            count ++;
        }*/
//can use string methods in loops

//task 4
        /*System.out.println(" enter your name please: ");
        String nameUser = reader.nextLine();
        System.out.println("Reversed word: ");



        for(int i = nameUser.length()-1; i >=0; i--){
            System.out.println(nameUser.charAt(i));
        }*/

        //task 5
        /*System.out.println("enter  first word: ");
        String word1 = reader.nextLine();

        System.out.println("enter second word ");
        String word2 = reader.nextLine();

        int result = word1.indexOf(word2);
        if( result != -1){ //word 2 is not included in word 1, moglo je isto >= logic
            System.out.println("the word" + word2 + "is found in" + word1);
        }else{
            System.out.println("the word" + word2 + "is found in" + word1);
        } */

        //task 6
        /*ArrayList<String> words = new ArrayList<String>();
        String user_word;
        while(true){
            System.out.println("enter word: ");
            user_word = reader.nextLine();

            if(words.contains(user_word)){
                break;
            }else {
                words.add(user_word);
            }
        }
        System.out.println("words: ");
        Collections.sort(words);
        for (String word : words){
            System.out.println(word);
        }*/


        //task 7
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benveuneto");
        list.add("badger, badger, badger ");
        ArrayList<Integer> lengths = lengths(list);
        System.out.println("length of strings is: " + lengths);


        //task 8
        System.out.println("type in text: ");
        String text = reader.nextLine();

        if(palindrome(text)){
            System.out.println("the text is palindrome ");
        }else{
            System.out.println(" the text is not polidrome ");
        }






    }
    //task 7
    public static ArrayList<Integer> lengths(ArrayList<String> list){
        ArrayList<Integer> lenghts
    }


    //task 8
    public static boolean palindrome(String text){
        int length = text.length();
        String reverse = "";
        for (int i = length - 1; i>=0; i--){
            reverse = reverse + text.charAt(i);
        }
        return text.equals(reverse);

    }
//task 1
    /*public static double average(int num1, int num2, int num3, int num4){
        int sum = sum(num1, num2, num3, num4);
        double average = (double)sum /4;

        return average;


    }*/

    /*public static int sum(int num1, int num2, int num3, int num4){
        int sum = 0;
        sum = sum + num1;
        sum = sum + num2;
        sum = sum + num3;
        sum = sum + num4;

        return sum;
    }*/










}
