class Main {
  public static void main(String[] args) {
    Plane2D[] a = {
      new Rectangle(2,5),   // 사각형
      new Parallels(2,5),   // 평행사변
    };

    for (int i = 0 ; i < a.length ; i++)
      System.out.println("a["+i+"]의 면적="+a[i].getArea());
  }
}
