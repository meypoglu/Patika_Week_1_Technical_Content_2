import java.util.Scanner;

public class Practice_4_Activity_by_Temperature {
    public static void main(String[] args) {
        // Değişkenlerin tanımlanması
        int heat;
        // Kullanıcı girdisinin alınması
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz: ");
        heat = input.nextInt();

        // Sıcaklık aralıkları birlikte verilerek iç içe döngüler azaltılabilir
        if (heat < 5) {
            System.out.println("Kayak yapabilirsin.");
        } else if (heat <= 15 && heat >= 5) {
            System.out.println("Sinemaya gidebilirsin.");
        } else if (heat <= 25 && heat >= 10) {
            System.out.println("Pikniğe gidebilirsin.");
        } else if (heat > 25) {
            System.out.println("Yüzmeye gidebilirsin.");
        }

    }
}
