package MyPage;

import java.util.Scanner;

public class Yuvarlma_Sorusu_Bitmedi {
    public static void main(String[] args) {
        /*

"yuvarlamak istediginiz sayinin miktarini giriniz"  mesaji verin
kullanicidan miktar alin.
girilen tum sayilar icin;
    Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.

    a) Son basamak 5 'e eşit ve 5 den büyükse, yuvarlama işlemi: "Son basamağı bir üst ondalı-
    ğa yuvarla"
    b) Son basamak 5 den küçükse, yuvarlama işlemi: "Son basamağı bir alt ondalığa yuvarla"
    cikti soyle olmalidir

    yuvarlamak istediginiz sayilarin miktarini giriniz
    5
    lutfen sayilari giriniz
    sayi 1 :
    13
    sayi 2 :
    16
    sayi 3 :
    18
    sayi 4 :
    11
    sayi 5 :
    12
    [13, 16, 18, 11, 12]
    Son basamağı bir alt ondalığa yuvarla ==> 10
    Son basamağı bir üst ondalığa yuvarla ==> 20
    Son basamağı bir üst ondalığa yuvarla ==> 20
    Son basamağı bir alt ondalığa yuvarla ==> 10
    Son basamağı bir alt ondalığa yuvarla ==> 10

 */
        Scanner input=new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz?");
        int adet=input.nextInt();
        int yuvarlanacakSayilar[]=new int[adet];
        for (int i = 0; i <adet ; i++) {
            System.out.println((i+1)+". sayıyı giriniz");
         yuvarlanacakSayilar[i]=input.nextInt();
        }
        for (int w:yuvarlanacakSayilar) {
         if()
        }



    }
    }



