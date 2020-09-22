import id.DateId;
// 하나의 패키지 안에 동일 명의 패키지와 클래스가 존재해서는 안된다.
// 패키지 명의 첫 글자는 소문자를 사용한다. (원칙)
// date 패키지 안에서 date 패키지와 Date클래스를 넣는 것은 가능하다.

class Main {
  public static void main(String[] args) {
    DateId a = new DateId();
    DateId b = new DateId();
    DateId c = new DateId();

    System.out.println("a의 식별 번호 : " + a.getId());
    System.out.println("b의 식별 번호 : " + b.getId());
    System.out.println("c의 식별 번호 : " + c.getId());

  }
}
