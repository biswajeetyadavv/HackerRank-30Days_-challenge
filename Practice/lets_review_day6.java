package src;
import java.util.*;

public class lets_review1_day6 {
    public static void main(String args[]){
//        question will be solved using StringBuilder.
//        we will learn how to use and what is StringBuilder.

//        when we want to make some changes in strings. i.e adding , deleting and replacing init.
//        for that we need stringBuilder.

//        as here in this question,
//        here, it has givec test case means num. of words. in int
//        therefore, we need to go to each words in need to print even char and odd char.
//        same, we need to do that for all test casess means the words.


//        we will take input from the user as num of test case (num of Words in int)
        Scanner scan = new Scanner(System.in);
        int testcase = scan.nextInt();
//        here, it will take the num of words we have.
//        so, that we will move one after one each and separate it as even or odd.

//        here, we will take input for words.
        scan.nextLine();

        for(int t = 0;t<testcase;t++){
            String s = scan.nextLine();

            StringBuilder evenchar = new StringBuilder();
            StringBuilder oddchar = new StringBuilder();

//            here we have two stringBuilder variable where will store the even and odd values.
//            we will use for loop for trasversing in the words.
            for(int i = 0; i<s.length();i++ ){
                if(i % 2 ==0){
                    evenchar.append(s.charAt(i));
                }
                else{
                    oddchar.append(s.charAt(i));
                }
            }

            System.out.println(evenchar.toString() + " "+ oddchar.toString());

        }

    }
}
