package arrays;


public class arrays5 {
    public static void main(String[] args) {

        int vect[] = {3,4,5,2,2,3,6,7};
        int length = vect.length;
        length = removeDuplicateElements(vect, length);
        for (int i=0; i<length; i++)
            System.out.print(vect[i]+" ");
    }
    public static int removeDuplicateElements(int vect[], int n){
        if (n==0 || n==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (vect[i] != vect[i+1]){
                temp[j++] = vect[i];
            }
        }
        temp[j++] = vect[n-1];
        for (int i=0; i<j; i++){
            vect[i] = temp[i];
        }
        return j;
    }
}
