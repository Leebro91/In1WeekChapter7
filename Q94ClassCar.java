import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("day1을 입력하자.");
    System.out.print("년: "); int y = stdIn.nextInt();
    System.out.print("월: "); int m = stdIn.nextInt();
    System.out.print("일: "); int d = stdIn.nextInt();

    Day day1 = new Day(y,m,d);




  }
}
