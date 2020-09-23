/**
 * Point 클래스는 점을 나타내는 클래스이다.
 * 이클래스는 도형을 나타내는 추상 클래스 Shape로부터 파생된 클래스이다.
 * 필드는 없다.
 * @author 이몽룡
 * @see Shape
 */



public class Point extends Shape {

    /**
     * 점을 생성하는 생성자이다.
     */

    public point() {
        // 아무것도 하지 않는다.
    }

    /**
     * toString 매서드는 점에 관련된 도형 정보를 문자열로 변환한다.
     * 반환하는 문자열은 항상 "Point"이다.
     * @return 문자열 "Point"를 반환한다.
     */

    public String toString() {
         return "Point";

    /**
     * draw 매서드는 점을 그리는 매서드이다.
     * 플러스 기호 +를 1개만 표시하고 줄 바꿈한다.
     */
        public void draw() {
            System.out.println("+");
        }
    }
    
}
