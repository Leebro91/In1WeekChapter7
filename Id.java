class Id {
  static int counter = 0;
  private int id;

// 생성자
  public Id() {
    id = ++counter;
  }

  public int getId() {
    return id;
  }
}
