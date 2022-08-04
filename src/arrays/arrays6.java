package arrays;

public class arrays6 {
    public static void main(String[] args) {
        int[] vect = { 40, 50, 30, 40, 50, 30, 30 };
        int n = vect.length;
        System.out.print(mostFrequent(vect, n));
    }
    public static int mostFrequent(int[] vect, int n)
    {
        int maxcount = 0;
        int element_having_max_freq = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (vect[i] == vect[j]) {
                    count++;
                }
            }

            if (count > maxcount) {
                maxcount = count;
                element_having_max_freq = vect[i];
            }
        }

        return element_having_max_freq;
    }
}
