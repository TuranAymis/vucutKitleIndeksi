import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight;
        double height;
        double index;

        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        weight = scan.nextDouble();

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        height = scan.nextDouble();

        index = weight / (height * height);

        System.out.println("Boy: " + height + "m");
        System.out.println("Kilo: " + weight + "kg");
        System.out.println("Vücut Kitle İndeksi: " + index);
    }
}