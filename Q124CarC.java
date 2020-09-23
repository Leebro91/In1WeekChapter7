     // Q124
    Car car1 = new Car("W140", 1885, 1490, 5220, 95.0, "2018,10,13");

    ExCar car2 = new ExCar("W221", 1845, 1490, 5205, 90.0, "2015,12,24"); 

    Car x;     // 클래스형 변수
    x = car1;  // 자기자신의 형 인스턴스를 참조할 수 있다
    x = car2;  // 하위 클래스형의 인스턴스도 참조할 수 있다!!!!!

    System.out.println("x구입일 : " + x.getPurchaseDay());

    // is - A 관계 : ExCar는 Car의 자식으로 Car 가족의 일원이라고 볼 수 있다.
    // ExCar는 Car의 일종이다.
    // 관계의 반대는 성립하지 않는다, 즉 Car는 ExCar의 일종이 아니다.
    // Car1 자동차 클래스 Car의 인스턴스
    // Car2 ExCar형의 인스턴스(총주행거리가 있는 인스턴스)


    ExCar y;      // 클래스형 변수
    // y = car1;  // 상위 클래스 형의 인스턴스는 참조할 수 없다.!!!!!
    y = car2;     // 자기자신의 형 인스턴스는 참조할 수 있다.

    System.out.println("y구입일 : " + y.getPurchaseDay());
    System.out.println("y의 총 주행 거리 : " + y.getTotalMileage());

    // ExCar형의 변수 y는 슈퍼 클래스 Car형의 Car1인스턴스를 참조할 수 없다.
    // 상위 클래스 형의 변수는 하위클래스의 인스턴스를 참조할 수 있지만 하위 클래스형의 변수 상위 클래스의 인스턴스를 참조할 수 없다. (우회방법이 있긴함)
