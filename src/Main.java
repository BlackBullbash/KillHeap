import java.util.Scanner;

public class Main {

    final int LENGTH = 8;
    int[] arr = new int[LENGTH];
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Main app = new Main();
        app.run();
    }

    private void run() {
        arr = gora(); //вызов функции, которая проинициализирует массив числами, которые введет пользователь
        for (int i = 0; i < LENGTH; i++) {
            killMas(arr); //последовательно убиваем самую высокую часть горки на каждой итерации
        }
    }

    private int[] gora() {
        int[] mas = new int[LENGTH];
        int mountainH = 0;
        for(int i = 0; i < LENGTH; i++) {
            System.out.println("Enter height of mountain: ");
                if(scan.hasNextInt()) {
                    mountainH = scan.nextInt();
                    mas[i] = mountainH;
                }
        }
        return mas;
    }

    private int[] killMas(int[] massiv) {
        int max = 0;
        int indexMax = 0;
        int i;
            for (i = 0; i < LENGTH; i++) {
                if (massiv[i] > max) {
                    max = massiv[i];
                    indexMax = i;
                }
            }
        System.out.println("Maximum for now is: " + max);
        massiv[indexMax] = 0;
        System.out.println("killing element " + (indexMax + 1) + "...");
        return massiv;
    }

    /* private void printMas(int[] mas) {

        for(int i = 0; i < mas.length; i++) {
            System.out.println(mas[i] + " ");
        }

    } */

}
