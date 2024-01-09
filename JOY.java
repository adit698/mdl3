package Github;

import java.util.Scanner;
public class JOY {
    /**
     *
     * @param args
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi segitiga sama sisi: ");
        double sisi = input.nextDouble();

        double luas = hitungLuasSegitiga(sisi);
        double keliling = hitungKelilingSegitiga(sisi);

        System.out.println("Luas segitiga sama sisi: " + luas);
        System.out.println("Keliling segitiga sama sisi: " + keliling);

        input.close();
    }

    public static double hitungLuasSegitiga(double sisi) {
        // Rumus luas segitiga sama sisi
        return (Math.sqrt(3) / 4) * sisi * sisi;
    }

    public static double hitungKelilingSegitiga(double sisi) {
        // Keliling segitiga sama sisi adalah jumlah ketiga sisinya
        return 3 * sisi;
    }
}