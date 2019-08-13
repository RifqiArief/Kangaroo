package coba;

import com.sun.deploy.util.ArrayUtil;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1, v1, x2, v2;
        String strInput = input.nextLine();
        String[] strArr = strInput.split(" ");
        x1 = Integer.valueOf(strArr[0]);
        v1 = Integer.valueOf(strArr[1]);
        x2 = Integer.valueOf(strArr[2]);
        v2 = Integer.valueOf(strArr[3]);

        String res = kangaroo(x1,v1,x2,v2);
        System.out.println(res);
    }

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (x1 > x2 && v1 >v2 || x1 < x2 && v1 <v2 || x1 == x2){
            return "NO";
        }else{
            if (x1 > x2){
                while (true) {
                    x1 += v1;
                    x2 += v2;
                    if (x1 == x2) {
                        return "YES";
                    }
                    if (x1 < x2) {
                        return "NO";
                    }
                }
            }else{
                while (true) {
                    x1 += v1;
                    x2 += v2;
                    if (x1 == x2) {
                        return "YES";
                    }
                    if (x1 > x2) {
                        return "NO";
                    }
                }
            }
        }
    }
}

