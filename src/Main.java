import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Meyve fiyatları
        double armutFiyati = 2.14;
        double elmaFiyati = 3.67;
        double domatesFiyati = 1.11;
        double muzFiyati = 0.95;
        double patlicanFiyati = 5.00;

        // Kullanıcıdan kilogram değerlerini alma
        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kaç Kilogram? : ");
        double armutKilo = scanner.nextDouble();

        System.out.print("Elma Kaç Kilogram? : ");
        double elmaKilo = scanner.nextDouble();

        System.out.print("Domates Kaç Kilogram? : ");
        double domatesKilo = scanner.nextDouble();

        System.out.print("Muz Kaç Kilogram? : ");
        double muzKilo = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilogram? : ");
        double patlicanKilo = scanner.nextDouble();

        // Toplam tutarı hesaplama
        double toplamTutar = armutKilo * armutFiyati +
                elmaKilo * elmaFiyati +
                domatesKilo * domatesFiyati +
                muzKilo * muzFiyati +
                patlicanKilo * patlicanFiyati;

        // Sonucu ekrana yazdırma
        System.out.println("Toplam Tutar: " + toplamTutar + " TL");


    }
}
