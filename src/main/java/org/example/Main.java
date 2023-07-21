package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fiz, tur, kim, muz,ort;

        Scanner ders = new Scanner(System.in);
        System.out.print("Matematik Notunuzu Giriniz :");
        mat = ders.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fiz = ders.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz : ");
        tur = ders.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kim = ders.nextInt();

        System.out.print("Muz Notunuzu Giriniz : ");
        muz = ders.nextInt();

        ort = (mat + fiz + tur + kim + muz) / 5;

        if (ort >= 55 ){
            System.out.print("Ortalamanız : " + ort + " Sınıfı Geçtiniz");
        }else {
            System.out.print("Ortalamanız : " + ort + " Kaldınız");
        }

    }
}