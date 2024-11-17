import java.util.Random;
import java.util.Scanner;
/*这是一个随机生成（1~100）数并存入数组中，然后输出存入数组arr和你输入的数一样的数组索引位置代码*/
public class LX {
    public static void main(String[] args) {
        Random w=new Random();
        Scanner W=new Scanner(System.in);
        int sc=W.nextInt();
        int count=0;
        int [] arr=new int[100];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=w.nextInt(100)+1;
            if(arr[i]==sc)
            {
                System.out.print("数组"+i+"，");
                count=1;
            }
        }
        if(count!=0)
        System.out.println("就是你猜的数所存的数组arr中的位置。");
        else
           System.out.println("很可惜100个随机数，都没有你猜的数。");
    }
}