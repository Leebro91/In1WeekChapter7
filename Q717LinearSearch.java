import java.util.Scanner;

class Main {

  static int linearSearch(int[] a,int key) {
    for (int i=0 ; i < a.length ; i++)
      if (a[i] == key)
        return i;
    return -1;  // 값 없음
  }

  static int linearSearchR(int[] a, int key) {
    for (int j = a.length - 1 ; j >= 0 ; j--)
      if (a[j] == key)
        return j;
    return -1;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("요소 수 : ");
    int num = stdIn.nextInt();

    int[] x = new int[num];  // x -> 6

    for ( int i = 0 ; i < num; i++) {
      System.out.print("x[" + i + "] : ");
      x[i] = stdIn.nextInt();
    }

    System.out.print("찾는 값 : ");
    int key = stdIn.nextInt();   // key -> 22

    int idxTop = linearSearch(x,key);
    int idxBtm = linearSearchR(x,key);

    if (idxTop == -1)
      System.out.println("해당 값은 존재하지 않습니다.");
    else if (idxTop == idxBtm)
      System.out.println("해당 값은 x[" + idxTop + "]에 있습니다. ");
    else {
      System.out.println("해당 값의 요소가 여러개 존재합니다.");
      System.out.println("가장 앞에 위치한 값은 x[" + idxTop + "]에 있습니다.");
      System.out.println("가장 뒤에 위치한 값은 x[" + idxBtm + "]에 있습니다.");
    }
  }
}
