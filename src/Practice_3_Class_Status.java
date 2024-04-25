import java.util.ArrayList;
import java.util.Scanner;

public class Practice_3_Class_Status {
    public static void main(String[] args) {
        // Ders notlarına ilişkin değişkenlerin tanımlanması
        int mat, fizik, turkce, kimya, muzik;
        // Notları daha sonra değerlendirebilmek için bir array oluşturup içine depoladım
        ArrayList<Integer> array = new ArrayList<Integer>();
        // Kullanıcı girdisinin alınması
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        // Oluşturduğum arraye değişkenleri yollamak için kullanılan komut
        array.add(mat);
        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        array.add(fizik);
        System.out.print("Türkçe notunuz: ");
        turkce= input.nextInt();
        array.add(turkce);
        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        array.add(kimya);
        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();
        array.add(muzik);

        double average = 0;
        // Eğer girilen değer 100'den büyük ya da 0'dan küçükse arrayden çıkarılıp ortalamaya dahil edilmiyor
        for (int i = 0;i<array.size();i++) {
            if (array.get(i) > 100 || array.get(i) < 0) {
                array.remove(i);
                i -= 1;
            // Eğer değer uygunsa ortalamaya dahil oluyor
            } else {
                average += array.get(i);
            }
        }
        average /= array.size();
        // Ortalama 55'ten yüksekse öğrenci geçer, yoksa kalır
        System.out.println(average >= 55 ? ("Geçtiniz, not ortalamanız: " + average) : ("Kaldınız, not ortalamanız: " + average));
    }
}
