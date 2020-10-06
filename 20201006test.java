import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner stdIn = new Scanner(System.in);

    String[] monthString = {
      "January","February","March","April","May","June",
      "July","August","September","October","November","December"
    };
    System.out.println("해당 월의 영어 단어를 입력하세요.");
    System.out.println("첫 글자는 대문자로, 나머지는 소문자로 입력하세요.");

    int[] order = new int[12];
    for (int i = 0; i < order.length; i++)
      order[i] = i;
    for (int i = 0; i < 24; i++) {
      int idx1 = rand.nextInt(12);
      int idx2 = rand.nextInt(12);
      int t = order[idx1];
      order[idx1] = order[idx2];
      order[idx2] = t;
    }

    int correct = 0; 
    for (int i = 0; i < 12; i++) {
      int month = order[i];
      System.out.print((month+1) + "月 : ");
      String s = stdIn.next();

      if (s.equals(monthString[month])) {
        System.out.println("정답입니다.");
        correct++;
      }
      else {
        System.out.println("틀렸습니다.");
      }
    }
    System.out.println("12회 중 " + correct + " 번 맞추었습니다.");
  }
}
