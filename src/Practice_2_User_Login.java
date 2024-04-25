import java.util.Scanner;

public class Practice_2_User_Login {
    public static void main(String[] args) {
        // Değişkenler tanımlandı ve kullanıcıdan girdiler alındı
        String userName, password, yesno, currentPassword, passwordCheck;
        currentPassword = "java123";
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifreyi giriniz: ");
        password = input.nextLine();
        // Kullanıcı adı ve şifrenin doğru girilip girilmediğinin kontrol edilmesi
        if (userName.equals("patika") && password.equals(currentPassword)) {
            System.out.println("Giriş yaptınız !");
        // Sadece şifre yanlışsa yeni bir şifre oluşturmak için kullanıcıya izin verilir
        } else if (userName.equals("patika") && password != currentPassword) {
            System.out.print("Şifreniz yanlış ! Sıfırlamak ister misiniz ? (y/n): ");
            yesno = input.nextLine();
            // Eğer kullanıcı şifreyi sıfırlamak istemezse işlem yapılmaz
            if (yesno.equals("n")) {

            } else if (yesno.equals("y")) {
                System.out.print("Lütfen yeni şifrenizi giriniz: ");
                password = input.nextLine();
                // Eğer yeni şifre önceki şifreyle aynıysa şifrenin değiştirilmesi istenir
                if (password.equals(currentPassword)) {
                    // While döngüsü içindeki koşul sağlanmayana kadar devam eder
                    while (password.equals(currentPassword)) {
                        System.out.print("Şifreniz oluşturulamadı, lütfen başka şifre giriniz. ");
                        password = input.nextLine();
                    }
                    // Yeni şifre oluşturulur ve güncel şifre olarak tanımlanır
                    currentPassword = password;
                    System.out.println("Şifre oluşturuldu");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            }
        // İki bilgi de yanlışsa program kapanır
        } else {
            System.out.println("Bilgileriniz yanlış !");
        }
    }
}
