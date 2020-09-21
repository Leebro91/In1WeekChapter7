import java.util.Scanner;

class Main {

  static int min(int a, int b, int c) {

    int min = a;
    if (b < min) min = b;
    if (c < min) min = c;

    return min;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    
    System.out.print("정수 a : ");
    int a = stdIn.nextInt();
    System.out.print("정수 b : ");
    int b = stdIn.nextInt();
    System.out.print("정수 c : ");
    int c = stdIn.nextInt();

    int x = min(a,b,c);
    System.out.println("최소값은 " + x + "입니다.");
  }
}
