class ExCar extends Car {
// Car Class : 부모, 상위, 기본, 슈퍼
// ExCar Class : 자식, 하위, 파생, 서브
  
  private double totalMileage;

//생성자
  public ExCar(String name, int width, int height, int length, double fuel, String purchaseDay) {
    super(name, width, height, length, fuel, purchaseDay);
    totalMileage = 0.0;
  }

  public double getTotalMileage() {
    return totalMileage;
  }

  public void putSpec() { // putSpec putSpac
    super.putSpec();
    System.out.printf("총 주행 거리 : %.2fkm\n", totalMileage);
  }

  public boolean move(double dx, double dy) {
    double dist = Math.sqrt(dx * dx + dy * dy);
    if (!super.move(dx,dy))
    return false;
    else {
      totalMileage += dist;
      return true;
    }
  }
}

// 자바에서는 여러 클래스로부터 다중 상속은 지원하지 않는다.
// 서브 클래스는 슈퍼 클래스를 알고 있지만, 슈퍼 클래스는 서브클래스를 모른다.
