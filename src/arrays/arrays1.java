package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {
            int sum = 0;
            double average;
            int vect[] = {1,12,44,47,7,33,43,5,65};
            for(int i = 0; i < vect.length ; i++)
            {
                sum = sum + vect[i];
            }
            average = (double)sum / vect.length;
            System.out.println("Sum:"+sum);
            System.out.println("Average:"+average);
    }
}
