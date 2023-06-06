package MyPage;

import java.util.Scanner;

public class DenemeC4 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("ismini gir ");
        String ad=input.nextLine().toUpperCase();
        char birinciAd=ad.split(" ")[0].charAt(0);
        char ikinciAd=ad.split(" ")[1].charAt(0);
        char ucuncuAd=ad.split(" ")[2].charAt(0);
        System.out.println(birinciAd+"."+ikinciAd+"."+ucuncuAd);

        System.out.println(""+ad.charAt(0)+ad.charAt(ad.indexOf(" ")+1)+ad.charAt(ad.lastIndexOf(" ")+1));
    }
}
