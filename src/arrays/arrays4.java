package arrays;

import java.util.Arrays;

public class arrays4 {
    public static void main(String[] args) {
        int vect[] = {66, 71, 76, 82, 88, 99};

        Arrays.sort(vect);
        printNumbers(vect);

    }

    public static void printNumbers(int[] vect) {
        for (Integer items : vect) {
            System.out.print(items + " ");
        }
    }
}


