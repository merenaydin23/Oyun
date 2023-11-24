import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner klavye = new Scanner(System.in);
        int a = 0;
        int b = 0;


        System.out.println("Taş kağıt makas oyununa Hoş geldiniz");
        System.out.println("Karakter numaraları:" + "taş=0,makas=1,kağıt=2");
        System.out.println("Aynı karakterlerin düellosu beraberlikle sonlanır");
        System.out.println("Taş ile kağıdın düellosunu kağıd kazanır");
        System.out.println("Taş ile makasın düellosunu taş kazanır");
        System.out.println("Makas ile kağıdın düellosunu kağıt kazanır");
while (23==23){
        System.out.println("lütfen oynayacağınız karakterin numarasını giriniz");
        int numara = klavye.nextInt();
        if (3 < numara && numara < 0) {
            System.out.println("Gecerli sayı gir");
            numara = klavye.nextInt();
        } else {
            if (numara == 0) {
                System.out.println("Oynadığınız karakter taş");
            } else if (numara == 1) {
                System.out.println("Oynayacağınız karakter makas");
            } else if (numara == 2) {
                System.out.println("Oynayacağınız karakter kağıt");
            }
        }


        int sistem = rand.nextInt(3);
        if (sistem == 0) {
            System.out.println("Sistemin oynadığı karakter taş");
        } else if (sistem == 1) {
            System.out.println("Sistemin oynadığı karakter makas");
        } else if (sistem == 2) {
            System.out.println("Sistemin oynadığı karakter kağıt");
        }
    if (numara == 0 && sistem == 1) {
        System.out.println("Taş makası kırar");
        System.out.println("Siz kazandınız");
    } else if (numara == 1 && sistem == 0) {
        System.out.println("Taş makası kırar");
        System.out.println("Sistem kazandı");
    } else if (numara==0&&sistem==0) {
        System.out.println("Berabere");
    } else if (numara == 2 && sistem == 2) {
        System.out.println("Berabere");
    } else if (numara == 1 && sistem == 1) {
        System.out.println("Berabere");
    } else if (numara == 0 && sistem == 2) {
        System.out.println("Kağıt taşı sarar");
        System.out.println("Sistem kazandı");
    } else if (numara == 2 && sistem == 0) {
        System.out.println("Kağıt taşı sarar");
        System.out.println("Siz kazandınız");
    } else if (numara == 1 && sistem == 2) {
        System.out.println("Makas kağıdı keser");
        System.out.println("Siz kazandınız");
    } else if (numara == 2 && sistem == 1) {
        System.out.println("Makas kağıdı keser");
        System.out.println("Sistem kazandı");

    }
}
    }
    }