# ***你好这是我的蓝桥杯练习项目***

## 	排序

###### 	冒泡排序





代码

```java
 int arr[] = new int[1000000];
        for(int i=0;i<1000000;i++){
            Random rc= new Random();
            System.out.println(i);

            arr[i]=rc.nextInt();
        }


        //定义两个for循环 {4,2,43,3,2}
       for(int i=0;i< arr.length-1;i++){
           //内部for循环 i 与j 进行大小判断
           for(int j=i+1;j< arr.length;j++){
               int temp=0;
               if(Maxnum(arr[i],arr[j])){
                   //进行数据交换 
//                   temp=arr[i];
//                   arr[i]=arr[j];
//                   arr[j]=temp;
                   System.out.println(arr[i]);



                   arr= Masort(arr,i,j);

               }else {


               }
           }

       }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }

    }


    public static boolean Maxnum(int a,int b){

        if(a>b){
            return true;
        }else {
            return false;
        }
    }
    public static int[] Masort(int[] arr,int b,int c){
        int ex=arr[b];
        arr[b]=arr[c];
        arr[c]=ex;
        return arr;
    }

}
```

