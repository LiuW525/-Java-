import java.util.Random;
import java.util.Scanner;
//这是一个1~100的猜数游戏，一共五次机会，来试试吧!!!
public class CT {
    public static void main(String[] args) {
        int i,cd;
        System.out.println("请输入一个数(1~100):");
        Random a=new Random();
        int X=a.nextInt(100)+1;
        for(i=1;i<=5;i++)
        {
            Scanner W=new Scanner(System.in);
            cd=W.nextInt();

            if(X==cd)
            {
                System.out.print("恭喜你，你猜对了");
                break;
            }
            else
            {
                if(i==5)
                {
                    System.out.println("失败了，重新开始吧，正确答案是："+X);break;
                }
                if(cd<X)
                    System.out.print("你输入的数小了一些,");
                if(cd>X)
                    System.out.print("你输入的数大了一些,");

                System.out.println("你还有"+(5-i)+"次机会,请尝试请再输入一个数:");
            }
        }
    }
}
