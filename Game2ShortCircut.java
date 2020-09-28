class Main {

  public static void main(String[] args)
  {
    int a= 2;
    int b= 4;
         //2->3   ?4-?5
    if((++a>3)&&(++b>8)){
      System.out.println("if문이 수행되었습니다.");
    }

    System.out.println("a : "+ a +", b : "+ b);
  }
}

// 자바는 &&(and)에서는 조건에 False 거짓 이거나 ||(or)에서 조건이 true 인경우는 그 이후에 나오는 조건은 아예 평가하지 않는다.

// 자바는 최단평가를 한다. 
