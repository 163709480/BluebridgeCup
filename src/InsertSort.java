import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class InsertSort {
    public static void main(String[] args) {
//        int[] ar={101,34,119,1,23,43,7,-8};
        int[] arr= new int[80000];
        for(int i=0;i<80000;i++){
            arr[i]=(int)(Math.random()*80000);
        }
        System.out.println("排序前");
        Date data1= new Date();
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
        String date1Str= simpleDateFormat.format(data1);
        System.out.println("排序前的时间是+"+date1Str);
        insertsort(arr);
        Date data2= new Date();
        String data2Str = simpleDateFormat.format(data2);
        System.out.println("排序前的时间是"+data2Str);

    }

    public static void insertsort(int[] arr){

        for(int i=0;i<arr.length-1;i++) {
            int insertvalue = arr[i+1];
            int insertindex = i;
            while (insertindex >= 0 && insertvalue < arr[insertindex]) {
                arr[insertindex + 1] = arr[insertindex];
                insertindex--;

            }
            arr[insertindex + 1] = insertvalue;

        }

//        System.out.println(Arrays.toString(arr));

    }
}
