package MyPage;

import java.util.Scanner;

public class Denemesi {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("please enter a name");
        String word=input.next();
        System.out.println("enter number");
        int numberOfReturn=input.nextInt();
      String firstAndLastCh=""+word.charAt(0)+word.charAt(word.length()-1);
      int counter=1;
      while (counter<=numberOfReturn){
            System.out.println(firstAndLastCh);
       counter++; }





    }
}


