import java.util.*;
import java.io.*;


class Main {
  public static void main(String[] args) throws IOException {

    int x, y;  // x 단  y   -> * something
    Random r= new Random();

    x= Math.abs(r.nextInt() % 9) + 1;
    
    y= Math.abs(r.nextInt() % 9) + 1;

    int num = x * y;


    System.out.println();
    System.out.println("* 구구단 "+ x + "단에 대한 문제입니다");
    System.out.println();

    System.out.print(x + " x " + y + " = ");
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String user;
    user = in.readLine();

    int inputNum = new Integer(user).intValue();
    if (num == inputNum) {
      System.out.println("맞았습니다!");
    } else {
      System.out.println("틀렸습니다. 정답은 "+ num + "입니다");
    }
  }
}
