import java.lang.reflect.Array;
import java.util.Arrays;

public class Selectsort {
    public static void main(String[] args) {
        int[] ar = {101, 34, 119, 1};

        for(int i=0;i<ar.length;i++) {
            int min = ar[i];
            int minindex = i;

            for (int j = i + 1; j < ar.length; j++) { //外层 ar[i]与 内层ar[j]进行比较  i=0  j=1

                if (min > ar[j]) {
                    min = ar[j];
                    minindex = j;
                }

            }
            if(minindex!=i) {
                ar[minindex] = ar[i];
                ar[i] = min;
            }
        }












        System.out.println(Arrays.toString(ar));


    }

}