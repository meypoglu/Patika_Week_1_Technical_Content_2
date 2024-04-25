import java.util.Scanner;

public class Practice_6_Horoscope_Finder {
    public static void main(String[] args) {
        // Kullanıcıdan girdilerin alınması
        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ayı sayı cinsinden giriniz: ");
        int month = input.nextInt();
        System.out.print("Doğduğunuz günü sayı cinsinden giriniz: ");
        int day = input.nextInt();
        // 30 çeken aylarda 31, 28 çeken aylarda 30 gün hatası kontrolü
        boolean isError = false;
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 31) {
            isError = true;
        } else if (month == 2 && (day > 28 || day == 0)) {
            isError = true;
        }

        if (isError) {
            System.out.println("Yanlış bir tarih girdiniz!");
        } else {
            String burc = "";
            // Tarihe göre hangi burç olduğunun tespiti
            if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
                burc = "Koç";
            } else if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) {
                burc = "Boğa";
            } else if ((month == 5 && day >= 22) || (month == 6 && day <= 22)) {
                burc = "İkizler";
            } else if ((month == 6 && day >= 23) || (month == 7 && day <= 22)) {
                burc = "Yengeç";
            } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
                burc = "Aslan";
            } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
                burc = "Başak";
            } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
                burc = "Terazi";
            } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
                burc = "Akrep";
            } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
                burc = "Yay";
            } else if ((month == 12 && day >= 22) || (month == 1 && day <= 20)) {
                burc = "Oğlak";
            } else if ((month == 1 && day >= 21) || (month == 2 && day <= 19)) {
                burc = "Kova";
            } else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
                burc = "Balık";
            }

            System.out.println("Burcunuz: " + burc);

        }
    }
}
