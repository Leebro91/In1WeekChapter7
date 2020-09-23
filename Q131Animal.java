class Main {
  public static void main(String[] args) {

    // 추상클래스는 인스턴스를 생성할 수 없다.
    // Animal x = new Animal();

    Animal[] a = new Animal[2];

    a[0] = new Dog("뭉치","치와와"); // 클래스 Dog참조
    a[1] = new Cat("마이클",7);      // 클래스 Cat참조
    
    // for (Animal s : a) {
    //   System.out.println(s.getName() + " ");
    //   s.bark();
    //   System.out.println();
    // }
    
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i].getName() + " ");
      a[i].bark();
      System.out.println();
    }

  }
}
