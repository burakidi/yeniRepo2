package MyPage;

import java.util.Scanner;

public class DenemeC3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bana bir şeyler yazar mısın?");
        String words=scan.nextLine();
      boolean isSpace=  words.contains(" ");
        System.out.println("boşluk var mı : "+isSpace);

        boolean isEmpty=words.isEmpty();
        System.out.println("boş mu : "+isEmpty);




    }
}
