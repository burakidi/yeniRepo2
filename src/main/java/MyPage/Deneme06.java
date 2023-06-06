package MyPage;

import java.util.Scanner;

public class Deneme06 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("işlem yapmak istediğiniz birinci sayıyı giriniz");
        double num1=input.nextInt();
         System.out.println("işlem yapmak istediğiniz ikini sayıyı giriniz");
        double num2=input.nextInt();

        System.out.println("yapmak istediğinizi işlem numarasını giriniz\n******");
        System.out.println("toplama işlemi :  1\n çıkarma işlmei:  2\n çarpma işlemi:  3\nbolme işlemi:  4");
int operationNumber=input.nextInt();

if(operationNumber==1){
    System.out.println("toplam= "+num1+num2);
}else if(operationNumber==2){
    System.out.println("cikarma= "+(num1-num2));
}else if(operationNumber==3){
    System.out.println("carpma= "+(num1*num2));
}










    }
}
