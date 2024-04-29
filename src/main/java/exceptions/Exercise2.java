package exceptions;

import java.util.Scanner;

public class Exercise2 {

    public static int[] getUserInput() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int[] arr = new int[2];

        while (true) {
            System.out.println("Insert number ");
            try {
                arr[i] = sc.nextInt();
                i++;
                if (i == arr.length) {
                    return arr;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc.next();
                //System.out.println(i);
            }
        }
    }
}
