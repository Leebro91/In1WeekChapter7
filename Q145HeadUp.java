class Main {
  public static void main(String[] args) {

    HeadMounted hmd = new HeadMounted();
    hmd.putOn();
    hmd.putOff();
    hmd.changeSkin(Skinnable.BLACK);
    hmd.putSkin();


    // Wearable w = hmd;

    // // Wearable w = new Waerable(); 안됨
    // w.putOn();
    // w.putOff();

    // Skinnable s = hmd;
    // // Skinnable s = new Skinnable(); 안됨
    // s.changeSkin(Skinnable.BLACK);

    // hmd.putSkin();

  }
}

// 클래스 인스턴스
// HeadMounted 클래스형의 변수 hmd, Wearable 형의 변수w, Skinnable 형의 변수 s는 모두가 생성된 동일 인스턴스를 참조한다. 변수 hmd,w ,s의 형이 각각 다르기 때문에 해당 형에서 호출 가능한 메서드만 호출한다
