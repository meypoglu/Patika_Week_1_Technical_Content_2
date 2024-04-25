import java.util.Scanner;

public class Practice_8_Leap_Year_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yılı giriniz: ");
        int year = input.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " bir artık yıldır.");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " bir artık yıldır.");
        } else {
            System.out.println(year + " bir artık yıl değildir.");
        }
    }
}
