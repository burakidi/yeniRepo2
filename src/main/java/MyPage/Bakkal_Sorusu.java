package MyPage;

import java.util.Arrays;
import java.util.Scanner;

public class Bakkal_Sorusu {
    public static void main(String[] args) {

        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan aşağıysa o günleri return yap.
         * */

        Scanner input=new Scanner(System.in);
        String gunler[]= {"pazartesi","sali","carsamba","persembe","cuma","cumartesi","pazar"};
        double gunlukKazanclar[]=new double[7];
        int i=0;

        while (i<7)
        { System.out.println(gunler[i]+" günü kazancınızı giriniz");
gunlukKazanclar[i]=input.nextInt();
i++;}
        System.out.println("günlük kazanclar:");
        System.out.println(Arrays.toString(gunlukKazanclar));

        System.out.println("\nortalama günlük kazanc");
        System.out.println(getOrtalamaKazanc(gunlukKazanclar));

        System.out.println("\nortalamanın üstündeki günler");
        System.out.println(Arrays.toString(getOrtalamaninUstundeKazancGunleri(getOrtalamaKazanc(gunlukKazanclar), gunlukKazanclar, gunler)));

        System.out.println("\nortalamanın altındaki günler");
        System.out.println(Arrays.toString(getOrtalamaninAltindaKazancGünleri(getOrtalamaKazanc(gunlukKazanclar), gunlukKazanclar, gunler)));
    }
    //***********************   METHODLAR  *********************
    public static double getOrtalamaKazanc(double[] gunlukKazanclar){
        double toplam=0;
        for (double w:gunlukKazanclar) {
            toplam+=w;
        } double ortalama=toplam/ gunlukKazanclar.length;
     return ortalama; }

    //***************************************************
    public static String[] getOrtalamaninUstundeKazancGunleri(double ortalamaKazanc, double[] gunlukKazanclar, String[] gunler) {
        int sayac = 0;
        // Ortalamayı aşan günlerin sayısını bulma
        for (int i = 0; i < 7; i++) {
            if (ortalamaKazanc < gunlukKazanclar[i]) {
                sayac++;
            }
        }

        // Ortalamayı aşan günleri tutacak bir dizi oluşturma
        String[] ortalamaUstuGunler = new String[sayac];

        // Ortalamayı aşan günlerin isimlerini diziye atama
        int index = 0;
        for (int i = 0; i < 7; i++) {
            if (ortalamaKazanc < gunlukKazanclar[i]) {
                ortalamaUstuGunler[index] = gunler[i];
                index++;
            }
        }

        return ortalamaUstuGunler;
    }
    //*****************************************************

    public static String[] getOrtalamaninAltindaKazancGünleri(double ortalamaKazanc, double[] gunlukKazanclar, String[] gunler) {
        int sayac = 0;

        for (int i = 0; i < 7; i++) {
            if (ortalamaKazanc > gunlukKazanclar[i]) {
                sayac++;
            }
        }

        String[] ortalamaAltiGunler = new String[sayac];
        int index = 0;
        for (int i = 0; i < 7; i++) {
            if (ortalamaKazanc > gunlukKazanclar[i]) {
                ortalamaAltiGunler[index] = gunler[i];
                index++;
            }
        }

        return ortalamaAltiGunler;
    }




}
