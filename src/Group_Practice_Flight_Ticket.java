import java.util.Scanner;

public class Group_Practice_Flight_Ticket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi giriniz: ");
        double dist = input.nextDouble();
        System.out.print("Yaşınızı giriniz: ");
        int age = input.nextInt();
        System.out.println("Yolculuk tipini giriniz\n1-Tek Yön\n2-Gidiş Dönüş ");
        int type = input.nextInt();

        double priceDistance = 0.10d;
        double ticketPrice = dist * priceDistance;

        if (dist < 0 || age < 0 || type > 2 || type < 1) {
            System.out.println("Hatalı veri girdiniz !");
        } else {
            if (age < 12) {
                ticketPrice = ticketPrice - (ticketPrice * 0.5d);
            } else if (age >= 12 && age < 24) {
                ticketPrice = ticketPrice - (ticketPrice * 0.1d);
            } else if (age > 65) {
                ticketPrice = ticketPrice - (ticketPrice * 0.3d);
            }
            if (type == 2) {
                ticketPrice = (ticketPrice - (ticketPrice * 0.2d)) * 2;
                System.out.println("Toplam tutar " + ticketPrice + " TL");
            } else {
                System.out.println("Toplam tutar " + ticketPrice + " TL");
            }
        }

    }
}
