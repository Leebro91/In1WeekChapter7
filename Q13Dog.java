class Dog extends Animal {
  private String type; // 개의 종류

  // 생성자
  public Dog(String name, String type) {
    super(name); this.type = type;
  }

  public void bark() { 
    System.out.println("멍멍");
  }
}
