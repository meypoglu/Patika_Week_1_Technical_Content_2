import java.util.Scanner;

public class Practice_5_Sort_by_Value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin (a): ");
        int a = input.nextInt();
        System.out.print("İkinci sayıyı girin (b): ");
        int b = input.nextInt();
        System.out.print("Üçüncü sayıyı girin (c): ");
        int c = input.nextInt();

        if (a < b && a < c) {
            if (b < c) {
                System.out.println("a < b < c");
            } else {
                System.out.println("a < c < b");
            }
        } else if (b < c && b < a){
            if (a < c) {
                System.out.println("b < a < c");
            } else {
                System.out.println("b < c < a");
            }
        } else {
            if (a < b) {
                System.out.println("c < a < b");
            } else {
                System.out.println("c < b < a");
            }
        }
    }
}
