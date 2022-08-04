package arrays;

public class arrays2 {
    public static void main(String[] args) {
        int vect[] = {2, 5, 4, 1, 3};

        int max = vect[0];
        int min = vect[0];
        int sum = 0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > max)
                max = vect[i];

            if (vect[i] < min)
                min = vect[i];

            sum += vect[i];
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Sum of the elements: " + sum);
    }
}
