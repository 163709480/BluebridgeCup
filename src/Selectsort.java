import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


public class Selectsort {
    public static void main(String[] args) {
//        int[] ar = {101, 34, 119, 1};
        int[] ar= new int[80000];
        for(int i=0;i<80000;i++){
            ar[i]=(int)(Math.random()*80000);
        }
        System.out.println("排序前");
        Date data1= new Date();
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
        String date1Str= simpleDateFormat.format(data1);
        System.out.println("排序前的时间是+"+date1Str);

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


        Date data2= new Date();
        String data2Str = simpleDateFormat.format(data2);
        System.out.println("排序前的时间是"+data2Str);












    }

}