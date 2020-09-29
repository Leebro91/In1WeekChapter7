public class Main {

  public static void main(String[] args) {

    Animal aAnimal= new Animal();
    aAnimal.print();

    Human aHuman= new Human();
    aHuman.print();

    Boy aBoy= new Boy();
    aBoy.print();

    System.out.println();

    Animal tiger= new Animal("거북이",8);
    tiger.print();

    Human mary= new Human("김정아", 20);
    mary.print();

    Boy smin= new Boy("백승민", 14);
    smin.print();
  }
}


// 클래스들이 상속 관계에 있을때 생성자가 실행되는 순서에 따라 전혀 다른 결과를 얻을 수도있다. 예를들어, 상속관계에 있는 2개의 클래스가 있을때, 슈퍼클래스인 Asia의 생성자와 서브클라스인 korea클래스의 생성자가 서로 다른 값을 같은 변수에 저장한다면 실행되는 순서에 따라 다른 값이 변수에 저장 될수도 있다. 따라서, 이러한 순서를 정확히 알아야 상속을 이용하여 프로그래밍을 할 수 있다.

// 상속시에 생ㅇ성자 관계에서 반드시 주의해야할 것은
// 1. 생성자는 상속되지 않는다.
// 2. 서브 클래스의 생성자가 호출될 때 자동적으로 슈퍼클래스의 생성자가 먼저 호출된다.



// Animal class

public class Animal {
  String name;
  int age;

  public Animal() {
    this("동물", 0);
  }

  public Animal(String name, int age) {
    this.name= name;
    this.age= age;
  }

  public void print() {
    System.out.println("이름: "+ name);
    System.out.println("나이: "+ age +"세");
  }
}


// Boy class

public class Boy extends Human {
  public Boy() {
    this("소년", 0);
  }

  public Boy(String name, int age) {
    super(name, age);
  }
}


// Human class

public class Human extends Animal {
  public Human() {
    this("인간", 0);
  }

  public Human(String name, int age) {
    super(name, age);
  }

}
