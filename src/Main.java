
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    Scanner inp=new Scanner(System.in);
     int matematik,fizik,kimya,turkce,tarih,muzik;


        System.out.print("Matematik notunu giriniz:");
        matematik=inp.nextInt();

        System.out.print("Fizik notunu giriniz:");
        fizik=inp.nextInt();

        System.out.print("Türkçe notunu giriniz:");
        turkce= inp.nextInt();

        System.out.print("Kimya notunu giriniz:");
        kimya=inp.nextInt();

        System.out.print("Tarih notunu giriniz:");
        tarih=inp.nextInt();

        System.out.print("Müzik notunu giriniz:");
        muzik=inp.nextInt();

        int toplam_puan=(matematik+fizik+kimya+turkce+muzik+tarih);
        double ortalama=toplam_puan/6;

        System.out.println("Öğrenci not ortalaması:"+ortalama);

       String sonuc=ortalama>60 ? "Sınıfı Geçti":"Sınıfta kaldı";
       System.out.println(sonuc);


    }
}