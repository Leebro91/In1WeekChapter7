import java.util.Scanner;

class Main {

  static void aryIns(int[] a, int idx, int x) { 
    if (idx >= 0 && idx < a.length) {  // 삽입 받은 값을
      for (int i = a.length-1; i > idx; i--) // 그 자리에 
        a[i] = a[i-1];                // 넣어주고 나머지는
      a[idx] = x;                     // 한칸씩 밀림
    }
    // 인덱스가 a배열의 길이보다 작을때
    // i는 즉 요소수(a배열의 길이) - 1을 하고 차례로 작아짐
    // ex) a[3] = a[2]되어 버림 즉 a[2]번의 4가 a[3]의 4가 됨
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("요소 수 : "); // 입력받아서
    int num = stdIn.nextInt();     // 배열 만듬
    int[] a = new int[num];

    for (int i = 0 ; i < num ; i++) {
      System.out.print("a[" + i + "] : ");
      a[i] = stdIn.nextInt(); // a[i]의 값 입력받기
    }

    System.out.print("삽입할 요소의 인덱스 : ");
    int idx = stdIn.nextInt(); // 삽입할 요소 입력

    System.out.print("삽입할 값 : ");
    int n = stdIn.nextInt(); // 삽입할 값 입력

    aryIns(a, idx, n);
    for (int i = 0 ; i < num ; i++) // aryIns 매소드를 이용
      System.out.println("a[" + i + "] = " + a[i]);
      // 삽입하고 나서의 a[i] 의 값을 받는다
  }
}
