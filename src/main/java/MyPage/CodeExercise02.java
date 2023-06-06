package MyPage;

import java.util.Scanner;

public class CodeExercise02 {/* Soru: Bir kullanıcıdan pozitif iki tamsayı girmesini isteyen bir program yazmanız isteniyor.
Ardından, girilen sayıların faktöriyelini hesaplayan bir program yazın ve bu iki sayının faktöriyellerinin toplamı sonucunu ekrana yazdırın.
pozitif bir tam sayi harici bir deger girerse sonsuz döngü oluşturun(otamatik olarak döngü tekrar etsin)
ekrana "Hatalı giriş yaptınız Lütfen pozitif iki tam sayi giriniz" mesajını yazdırın
ve kullanıcının otamatik(yeniden run yapmadan) olarak iki sayı girecegi ekran gelmesini saglayın
Faktöriyel, bir sayının kendisi ile 1 arasındaki tüm sayıların çarpımıdır.
 Örneğin, 3 faktöriyel (5!) = 3 x 2 x 1 = 6'dir.
          4 faktöriyel (5!) = 4 x 3 x 2 x 1 = 24'dir.
          toplam 30

 Lütfen pozitif iki tam sayi giriniz
 4
 -3
 Hatalı giriş yaptınız lütfen pozitif iki tam sayi giriniz
 3
 4
 */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("iki ade pozitif tam sayı giriniz");
        int a=input.nextInt();
        int b=input.nextInt();

        while(a<1 || b<1){ System.out.println("iki ade pozitif tam sayı giriniz");
             a=input.nextInt();
            b=input.nextInt();
        }

        int i=1;
        int faktoriyel1=1;
        while(i<=a){faktoriyel1=faktoriyel1*i;
          i++;
        }
        System.out.println(a+" faktoriyel = "+faktoriyel1);

        int faktoriyel2=1;
        while(i<=b){faktoriyel2=faktoriyel2*i;
            i++;
        }
        System.out.println(b+" faktoriyel = "+faktoriyel2);

        System.out.println("toplam = "+(faktoriyel1+faktoriyel2));

    }
}
