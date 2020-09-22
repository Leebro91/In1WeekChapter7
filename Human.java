class Human {
  private static int counter = 0;
  private String name;
  private int height;
  private int weight;
  private int id;

  // 생성자 // constructor
  // 1. 이름이 클래스와 같다
  // 2. 반환형이 없다.

  Human(String name, int height, int weight){
    this.name = name; 
    this.height = height;
    this.weight = weight;
    id = ++ counter;
  }

  String getName() { return name;}
  int getHeight() { return height;}
  int getWeight() { return weight;}

  public void gainWeight(int w) { weight += w;} //몸무게 증가
  public void reduceWeight(int w) {weight -= w ;} // 몸무게 감소

  public int getId() {return id;}

  public void putData() {
    System.out.println("이름 : " + name);
    System.out.println("신장 : " + height + "cm");
    System.out.println("체중 : " + weight + "kg");
 }
}

