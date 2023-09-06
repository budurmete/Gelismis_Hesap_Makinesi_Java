import java.util.Scanner;
public class Main {

    static int summation(int numberOne, int numberTwo) {
        int result = numberOne + numberTwo;
        System.out.println("Toplama işleminizin sonucu: " + result+"\n");
        return result;
    }

    static int dismantlement (int numberOne, int numberTwo) {
        int result = numberOne - numberTwo;
        System.out.println("Çıkarma işleminizin sonucu: " + result+"\n");
        return result;
    }

    static int multiplication (int numberOne, int numberTwo) {
        int result = numberOne + numberTwo;
        System.out.println("Çarpma işleminizin sonucu: " + result+"\n");
        return result;
    }

    static int Division (int numberOne, int numberTwo) {
        if (numberTwo==0){System.out.println("İkinici Sayıyı 0 olarak giremezsiniz"); return 0;}
        int result = numberOne / numberTwo;
        System.out.println("Bölme işleminizin sonucu: " + result+"\n");
        return result;
    }

    static int üstalma (int numberOne, int numberTwo) {
        int result =1;
        for (int a =1; a<=numberTwo; a++)
        {
            result *= numberOne;
        }
        System.out.println("Üslü Sayı işleminizin sonucu: " + result+"\n");
        return result;
    }

    static int faktöriyel (int numberOne, int numberTwo) {
        int a=numberOne-numberTwo;
        int faktoriyeln=1,faktoriyelr=1,faktoriyela=1;
        for (int i = 1; i<=numberOne; i=i*4) {
            faktoriyeln*=i;
        }
        for (int i = 1; i<=numberTwo; i=i*4) {
            faktoriyelr*=i;
        }
        for (int i = 1; i<=a; i=i*4) {
            faktoriyela*=i;
        }
        int result=faktoriyeln/(faktoriyelr*faktoriyela);
        System.out.print("Faktöriyel İşleminizin Sonuçu: "+result);

        return result;
    }

    static int modAlma  (int numberOne, int numberTwo) {
        return numberOne % numberTwo;
    }

    static void calc  (int numberOne, int numberTwo) {
        System.out.println("Çevresi: "+(2*(numberOne+numberTwo)));
        System.out.println("alanı: "+(numberOne*numberTwo));
    }

    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        System.out.println(menu);
        while (true) {

            System.out.print("Yapmak isteğiniz işlemi seçiniz: ");
            select = imp.nextInt();

            if (select == 0) {
                break;
            }

            System.out.print("İlk Sayınızı: ");
            int numberOne = imp.nextInt();

            System.out.print("İkinci Sayınızı: ");
            int numberTwo = imp.nextInt();

            switch (select) {
                case 1:
                    summation(numberOne, numberTwo);
                    break;
                case 2:
                    dismantlement(numberOne, numberTwo);
                    break;
                case 3:
                    multiplication(numberOne, numberTwo);
                    break;
                case 4:
                    Division(numberOne, numberTwo);
                    break;
                case 5:
                    üstalma(numberOne, numberTwo);
                    break;
                case 6:
                    faktöriyel(numberOne, numberTwo);
                    break;
                case 7:
                    System.out.println("Mod Alma İşlemi Sonucunuz:  "+modAlma(numberOne, numberTwo));
                    break;
                case 8:
                    calc(numberOne,numberTwo);
                    break;
                default:
                    System.out.print("Geçersiz bir değer girdiniz.");
            }
        }
        System.out.print("Hoşçakal...");
    }
}
