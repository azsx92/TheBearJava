package chap_02;

import java.io.FileWriter;
import java.io.IOException;

public class _05_Operator5 {
    public static void main(String[] args)  {

        //  삼항연산자
        //  결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
        System.out.println(max);  // 5

        int min  = (x < y) ? x : y;
        System.out.println(min);  // 3

        boolean b = (x == y) ? true : false;
        System.out.println(b);    // false

        String s = ( x != y) ? "달라요" : "같아요";
        System.out.println(s);   // 달라요

        // CheckException은  반드시 try, throaz 것을 통해서 어떠한 조치를 해야하며 무심코 조치를 하지 않는 것 용인하지 않는 것을 checkException이라고 한다.
        // UnCheckException 반드시 try, throaz 것을 통해서 어떠한 조치를 하지 않아도 되며 무심코 조치를 하지 않는 것 용인하는 것을 UncheckException이라고 한다.
        // 롤백 이슈 가 있는 데 정답은 우리가 정하는 것이다. 
        try {
            FileWriter f = new FileWriter("data.txt");
            f.write("Hello");
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
