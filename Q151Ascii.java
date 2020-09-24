class Main {
  public static void main(String[] args) {

    for(char i = 0x21 ; i <= 0x7E; i++)
      System.out.printf("%c %04x\n", i, (int)i);
  }
}
// 숫자 문자 1의 문자코드 16진수 0x31
// 0x21 ~ 0x7E



// 유니코드
// 자바에서의 유니코드 1. 문자마다 고유의 번호  2. 플랫폼에 의존하지 않는다.   3. 프로그램에 의존하지 않는다.   4. 언어에 의존하지 않는다.
// 각 문자는 기본적으로 16비트로 표현한다. 0~65535


// Ascii 코드
// 미국용, 유니코드의 앞 128 개와 일치한다.
