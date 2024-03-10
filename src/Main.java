import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ert= new Scanner(System.in);

        System.out.println("Lisans bilgilerini giriniz: ");


        System.out.print("Ad: ");
        String ad= ert.nextLine();

        System.out.print("Soyad: ");
        String  soyad= ert.nextLine();

        System.out.print("Numara: ");
        int no= ert.nextInt();
        ert.nextLine();

        System.out.print("Bölümü: ");
        String bolum= ert.nextLine();
        ert.nextLine();

        LisansSınıfı lisansSınıfı= new LisansSınıfı("Kimilik tahmini projesi");
        lisansSınıfı.setAd(ad);
        lisansSınıfı.setSoyad(soyad);
        lisansSınıfı.setBolum(bolum);
        lisansSınıfı.setNumara(no);

        System.out.println("Doktora bilgilerini giriniz: ");
        System.out.print("Ad: ");
        String ad1= ert.nextLine();

        System.out.print("Soyad: ");
        String soyad1= ert.nextLine();

        System.out.print("Bölümü: ");
        String bolumu1= ert.nextLine();
        ert.nextLine();

        System.out.print("Numara: ");
        int no1= ert.nextInt();
        ert.nextLine();

        System.out.print("Danışman: ");
        String danısman1= ert.nextLine();

        System.out.print("Tezk konusu: ");
        String tezkonusu1= ert.nextLine();
        ert.nextLine();

        Doktora doktora= new Doktora("Poz tahmini", "Doc Dr Fatih Demiral", false);
        doktora.setAd(ad1);
        doktora.setSoyad(soyad1);
        doktora.setBolum(bolumu1);
        doktora.setNumara(no1);


        System.out.println("Yüksek lisans bilgilerini giriniz: ");
        System.out.print("Ad: ");
        String ad2= ert.nextLine();

        System.out.print("Soyad: ");
        String soyad2= ert.nextLine();

        System.out.print("Bölümü: ");
        String bolum2= ert.nextLine();
        ert.nextLine();

        System.out.print("Numarası: ");
        int no2= ert.nextInt();
        ert.nextLine();

        System.out.print("Danışman: ");
        String danısman2= ert.nextLine();

        System.out.print("Tez konusu: ");
        String tezkonusu2= ert.nextLine();

        YüksekLisans yüksekLisans= new YüksekLisans("Sıgır hastalıklarının tahmini: ","Doc Dr Elvan Duman");
        yüksekLisans.setAd(ad2);
        yüksekLisans.setSoyad(soyad2);
        yüksekLisans.setNumara(no2);
        yüksekLisans.setBolum(bolum2);


        System.out.println("Lisan öğrencisi bilgileri: ");
        System.out.print("   Ad: "+ " "+ lisansSınıfı.getAd());
        System.out.print("   Soyad: "+" "+ lisansSınıfı.getSoyad() );
        System.out.print("   Numara: "+ " "+ lisansSınıfı.getNumara());
        System.out.print("  Bölüm: "+ " "+ lisansSınıfı.getBolum());
        System.out.print("  Bitirme projesi: "+ " "+ lisansSınıfı.bitirmeprojesi);

        System.out.println("    ");

        System.out.println("Yüksek lisans öğrencisi bilgileri: ");
        System.out.print("   Ad: "+ " "+ yüksekLisans.getAd());
        System.out.print("   Soyad: "+ " "+ yüksekLisans.getSoyad());
        System.out.print("   Bölüm: "+ " "+ yüksekLisans.getBolum());
        System.out.print("   Numarası: "+ "  "+ yüksekLisans.getNumara());
        System.out.print("   Tez konusu: "+ " "+ yüksekLisans.tezkonusu);
        System.out.print("   Danışman: "+ " "+ yüksekLisans.danısman);

        System.out.println("   ");

        System.out.println("Doktora öğrencisi bilgileri: ");
        System.out.print("  Ad: "+ "  "+ doktora.getAd());
        System.out.print("   Soyad: "+ " "+ doktora.getSoyad());
        System.out.print("   Böüm: "+ "  "+ doktora.getBolum());
        System.out.print("   Numara: "+ "  "+ doktora.getNumara());
        System.out.print("  Tez konusu: "+ "  "+ doktora.tezkonusu);
        System.out.print("  Danışman"+ "  "+ doktora.danısman);
        System.out.print(" Yeterlilik: "+ "  "+ doktora.yeterlimi);
    }
}