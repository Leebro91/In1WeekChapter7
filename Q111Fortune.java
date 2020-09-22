import java.util.GregorianCalendar;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    GregorianCalendar today = new GregorianCalendar();
    int y = today.get(GregorianCalendar.YEAR);  // 년
    int m = today.get(GregorianCalendar.MONTH) + 1; // 월
    int d = today.get(GregorianCalendar.DATE);  // 일

    System.out.printf("오늘은 %d년 %d월 %d일입니다.\n",y,m,d);

    Random rand = new Random();
    int k = rand.nextInt(10);

    System.out.print("오늘의 운세는 " );

    String kk = "";
    switch (k) {
      case 0 : kk = "흉";
        break;
      case 1 : case 2 : case 3 : kk = "소길";
        break;
      case 4 : case 5 : case 6 : kk = "중길";
        break;
      case 7 : case 8 : kk = "길";
        break;
      case 9 : kk = "대길";
        break;
    }
    System.out.print(kk);
    System.out.println("입니다.");
  }
}
