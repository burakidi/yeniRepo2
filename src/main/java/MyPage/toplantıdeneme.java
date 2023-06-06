package MyPage;

import java.util.Arrays;
import java.util.Scanner;

public class toplantıdeneme {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int numbers[]=new int[8];

        for (int i = 0; i <numbers.length ; i++) {
            System.out.println("sayı giriniz");
            numbers[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

    }
}
