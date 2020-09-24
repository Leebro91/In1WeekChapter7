/**
 * Shape 클래스는 도형의 개념을 나타내기 위한 추상 클래스이다. 
 * 추상 클래스이므로 이 클래스의 인스턴스는 생성할 수 없다. 
 * 구체적인 도형 클래스는 이 클래스로부터 파생된다. 
 * 
 * @author 홍길동
 * @see Object
 */
public abstract class Shape {

    public abstract String toString();

    public abstract void draw();

    public void print() {
        System.out.println(toString());
    }
}

