import java.util.Scanner;

class Main {

  static void aryExchng(int[] a , int[] b) {
    int n = a.length < b.length ? a.length : b.length;
    // a의 길이가 b보다 작으면 a.length이고 크면 b.length임
    for ( int i = 0 ; i < n ; i++ ) {
      int t  = a[i] ;  // t를 만들어서
                       // 두 배열을 서로 바꿔주는과정임
        a[i] = b[i] ;  
        b[i] = t; // 많이 나오는 방식임 바로 바꿀수없어서
    }
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("배열 a의 요소 수 : ");
    int na = stdIn.nextInt(); // 입력 받는 요소수까지 
    int[] a = new int[na];    // 배열 생성
    for (int i = 0 ; i < na ; i ++) { // a[i] = " "입력값
      System.out.print("a[" + i + "] = "); // 반복으로 받기
      a[i] = stdIn.nextInt(); // 즉 요소수를 입력하면
                              // 거기까지만 배열을 만듬
    }

    System.out.print("배열 b의 요소 수 : "); // 위에 요소수랑
    int nb = stdIn.nextInt();               // 같음
    int[] b = new int[nb];
    for (int i = 0 ; i < nb ; i ++) {
      System.out.print("b[" + i + "] = ");
      b[i] = stdIn.nextInt();
    }

    aryExchng(a,b);
    System.out.println("배열 a와 b의 전체 요소를 교환했습니다.");
    for (int i = 0; i < na ; i++) // 위 교환하는매소드를 이용
      System.out.println("a[" + i + "] = "+ a[i]);
      // 반복문으로 만들어줌
    for (int i = 0 ; i < nb ; i++)
      System.out.println("b[" + i + "] = "+ b[i]);
      // 바로 위랑 동일
  }
}
