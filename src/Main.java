import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /** // Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

      //   Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
         * double[] numbers = {1, 2, 3, 4, 5};
                double sum = 0;
                for (int i = 0; i < numbers.length; i++) {
                    sum += 1/numbers[i];
                }
                System.out.println(sum); */

/*
//Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int target = sc.nextInt();

        int[] list = {56, 34, 1, 8, 101, -2, -33};

        Arrays.sort(list); // Diziyi küçükten büyüğe sırala

        int closestSmaller = Integer.MIN_VALUE;
        int closestLarger = Integer.MAX_VALUE;

        for (int num : list) {
            if (num < target && num > closestSmaller) {
                closestSmaller = num;
            }
            if (num > target && num < closestLarger) {
                closestLarger = num;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);
*/

       /** boyutlu diziler kullanılarak "yıldızlar" ile ekrana "B" harfi yazan programı yazınız.
                String[][] letter = new String[6][4];

                for (int i = 0; i < letter.length; i++) {
                    for (int j = 0; j < letter[i].length; j++) {
                        if (i == 0 || i == 2 || i == 5) {
                            letter[i][j] = " * ";
                        } else if (j == 0 || j == 3) {
                            letter[i][j] = " *   ";
                        } else {
                            letter[i][j] = "  ";
                        }
                    }
                }

                for (String[] row : letter){
                    for (String col : row){
                        System.out.print(col);
                    }
                    System.out.println();
                }
*/


    }
}
