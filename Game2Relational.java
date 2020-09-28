class Main {
  public static void main(String[] args)
  {
    int x, y, z;
    boolean b;

    x = y = z = 1;
    b = ((x-- > 0 ) || ( ++y != 0 ) && ( --z == 0));
         // 크니            다르니           같니    = true or false

    System.out.println("x = "+ x +", y = "+ y +", z = "+ z +", b = "+ b);
  }
}

// a instaceof b a객체가 b클래스로 생성한 객체이면 true
