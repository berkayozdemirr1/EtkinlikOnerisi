import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sicak;

        Scanner derece = new Scanner(System.in);
        System.out.print("Sicaklik : ");
        sicak = derece.nextInt();

        if (sicak <5 ) {
            System.out.println("Kayak Yapabilirsiniz");

        } else if (sicak>=5 && sicak<10) {
            System.out.println("Sinemaya Gidebilirsiniz.");
        } else if (sicak>=10 && sicak<15) {
            System.out.println("Sinemaya Gidebilirsiniz");
            System.out.println("Piknige Gidebilirsiniz");
        } else if (sicak>=15 && sicak<25) {
            System.out.println("Piknige Gidebilirsiniz");
        } else if (sicak>=25) {
            System.out.println("Yuzmeye Gidebilirsiniz");
        }
    }

}
