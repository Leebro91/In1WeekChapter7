class Main {

  public static void main(String[] args)
  {
    SuperClass superclass= new SuperClass();

    System.out.print("SuperClass의 print() 메소드: ");
    superclass.print();

    SubClass subclass= new SubClass();

    System.out.print("SubClass의 print() 메소드: ");
    subclass.print();

    System.out.println("SubClass에서 super, this로 호출: ");
    subclass.callSuperThis();
  }
}
