import java.util.Scanner;

public class Practice_1_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        double num1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double num2 = input.nextDouble();
        System.out.print("Yapmak istediğiniz işleme karşılık gelen sayıyı seçiniz" +
                "\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
        int op = input.nextInt();

        switch (op) {
            case 1:
                System.out.println("Toplamanın sonucu: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Çıkarmanın sonucu: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Çarpmanın sonucu: " + (num1 * num2));
                break;
            case 4:
                System.out.println("Bölmenin sonucu: " + (num1 / num2));
                break;
        }
    }

}
