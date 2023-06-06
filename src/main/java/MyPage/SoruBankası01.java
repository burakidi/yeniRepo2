package MyPage;

import java.util.Scanner;

public class SoruBankası01 {
    public static void main(String[] args) {
        /*
   A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
   Bilet tarifesi:
   km birim fiyati : 0.10$
   yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
   12 ve 24 yas arasindaysa 10% indirim,
   65 yasindan buyukse 30% indirim,
   bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Hangi şehre gitmek istediğinizi giriniz \n  B - C - D");
        String city = input.next().toUpperCase();

        System.out.println("Lütfen yaşınızı giriniz?");
        double ages = input.nextDouble();

        System.out.println("Tek yön ise lütfen 1'e / gidiş dönüş  ise 2 ye basınız?");
        int ciftYon = input.nextInt();

        double odencekTutar = 0;

        if (city.equalsIgnoreCase("B")) {
            odencekTutar = (500 * 0.10);
            ageDiscount(ages, odencekTutar);
            if (ciftYon == 2) {
                System.out.println(gidisDounusDiscount( ageDiscount(ages, odencekTutar)));
            }else{
            System.out.println(ageDiscount(ages, odencekTutar));}
        }

        else if (city.equalsIgnoreCase("C")) {
            odencekTutar = (700 * 0.10);
            ageDiscount(ages, odencekTutar);
            if (ciftYon == 2) {
                System.out.println(gidisDounusDiscount( ageDiscount(ages, odencekTutar)));
            }else {System.out.println(ageDiscount(ages, odencekTutar));}
        }

        else if(city.equalsIgnoreCase("D")){
            odencekTutar=(900*0.10);
            ageDiscount(ages,odencekTutar);
            if(ciftYon==2){
                System.out.println(gidisDounusDiscount( ageDiscount(ages, odencekTutar)));
            }else {System.out.println(ageDiscount(ages, odencekTutar));}
        }


    }
    // 1. Method
    public static double gidisDounusDiscount(double a){
       double newa=2*a-(2*a*20)/100;
    return newa;}

    //2. Method
    public static int ageDiscount(double yas,double fiyat){
        double yasIndırımlıFiyat=fiyat;
        if(yas<12){
           yasIndırımlıFiyat= fiyat-(fiyat*50)/100;
        }else if(yas>=12&&yas<24){
             yasIndırımlıFiyat= fiyat-(fiyat*10)/100;
        }else if(yas>65){
             yasIndırımlıFiyat= fiyat-(fiyat*30)/100;
        }
   return (int) yasIndırımlıFiyat;}

}
