package MyPage;

public class CodeExercise {
    public static void main(String[] args) {
        /*
"1'den 1000'e kadar olan sayılardan, her bir sayının basamaklarının küpleri toplamı kendisine eşit olan Armstrong
sayılarını bulan bir program yazın."
Bir Armstrong sayısı, her bir basamağının küplerinin toplamının kendisine eşit olduğu bir sayıdır.
Örneğin, 153 bir Armstrong sayısıdır, çünkü 1^3 + 5^3 + 3^3 = 153'e eşittir.
Sizden istenen program, 1'den 1000'e kadar olan tüm Armstrong sayılarını bulmalıdır. İyi şanslar!
 */

        for (int i = 1; i <1000 ; i++) {
            if(i<10){if(i==Math.pow(i,3)){
                System.out.println(i);}}
            else if (i<100){if (i==(Math.pow((i%10),3)+Math.pow((i/10),3))){
                System.out.println(i);}}
            else if (i<1000){if(i==(Math.pow((i%10),3)+Math.pow(((i%100)/10),3)+Math.pow((int)(i/100),3))){
                System.out.println(i);}}
        }









    }
}
