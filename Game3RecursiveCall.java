class Main {

  // public static int power(int x, int y) {
  //   if(y <= 0) {
  //     return 1;
  //   } else {
  //     return x * power(x, y - 1); // x를 y번 곱함
  //   }
  // }

  public static int power(int x, int y) {
    int mul = 1;
    while(y > 0) {
      mul = mul * x; // x를 y번 곱함
      y--;
    }
    return mul;
  }

  
  public static void main(String[] args) {
    System.out.println("power(2,1) : " + power(2,1));
    System.out.println("power(2,2) : " + power(2,2));
    System.out.println("power(2,3) : " + power(2,3));
    System.out.println("power(2,4) : " + power(2,4));
    System.out.println("power(2,5) : " + power(2,5));
  }
}
