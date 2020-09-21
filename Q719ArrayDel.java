import java.util.Scanner;

class Main {
                      //       [1] [2] [3]
                        //  1   3   4   7   9   11
                           // a ,    1 ,      3
    static void aryRmvN(int[] a, int idx, int n) {
      if (n > 0 && idx >= 0 && idx + n < a.length) {
        // 
        int idx2 = idx + n - 1;
                //  1  + 3 - 1 = 3 <- idx2
        if (idx2 > a.length - n - 1)
          // 3   >  6 - 3 - 1 = 2
          idx2 = a.length - n - 1;
          // idx2 => 2
        for (int i = idx ; i <= idx2; i ++)
          //          1     1      2
        a[i] = a[i + n];  
       // 1     1 + 3 -> 4
        // 삭제할 인덱스와 요소수를 제거
      }
    }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("요소 수 : "); // 요소수 입력 받고
    int num = stdIn.nextInt(); // 배열 만듬
    int[] a = new int[num];

    for (int i = 0 ; i < num ; i++) {
      System.out.print("a[" + i + "] : "); // a[i]값 입력
      a[i] = stdIn.nextInt();
    }

    System.out.print("삭제를 시작할 인덱스 : ");
    int idx = stdIn.nextInt(); // 입력받음

    System.out.print("삭제할 요소의 수 : ");
    int n = stdIn.nextInt(); // 입력받음

    aryRmvN(a, idx, n);
    for (int i = 0 ; i < num ; i++) //aryRmvN을 받아서 입력함
      System.out.println("a[" + i + "] = " + a[i]);
      // 삭제할 인덱스와 요소수를 제거되고 나서 나머지 수 나옴
  }
}
