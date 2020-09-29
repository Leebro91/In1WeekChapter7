import java.io.*;

class Main {
  public static void main(String[] args) throws IOException{

    Hangman2 hangman2 = new Hangman2();

    int result = hangman2.playGame(); //failed 값

    // 실패 횟수에 따라서 메시지 출력
    // 1~2 실수 "참 잘했어요"
    // 3 실수 "잘했어요"
    // 4 실수 "보통이네요"
    // 나머지 "분발하세요"
    // 변수명은 result
    // if
    System.out.println();
    if(result<=2){ 
      System.out.println("참 잘했어요!");
    }else if(result<=3){
      System.out.println("잘했어요!");
    }else if(result<=4){
      System.out.println("보통이네요!");
    }else{
      System.out.println("분발하세요!");
    }
  }
}

// hanman class

import java.io.*;

public class Hangman {
  String hiddenString;
  StringBuffer outputString;
  StringBuffer inputString;
  int remainder;
  int failed;


  public Hangman() {
    hiddenString= "hello";  // 찾을 문자열 (문제)
  }


  public int playGame() throws IOException {

    outputString= new StringBuffer();

    for(int i=0;i<hiddenString.length();i++){
      outputString.append('-'); // 문자의 수 만큼 - 출력
    }

    inputString= new StringBuffer();

    remainder= hiddenString.length();
    failed=0;

    // 문제 출제

    System.out.println("\n단어("+ hiddenString.length() +"글자"+"): "+ outputString);
    drawMan();  // 교수대 그림 


    // 한 문자를 입력 받아서 정답인지 확인
    do {

      checkChar(readChar());  // 입력 받는 메서드 -> 확인
      System.out.println("\n단어(" + hiddenString.length() + "글자" + "): " + outputString);
      drawMan();  // 입력 문자에 따라서 교수대 출력

    } while(remainder > 0 && failed <= 5);  
    // remainder 0 초과   실패횟수 failed 5번 까지만 허용
    return failed;
  }

  public void checkChar(char guess) {

    boolean already= false;
    for(int i=0;i<inputString.length();i++){
      if(inputString.charAt(i)==guess){  
        // 이미 입력한 문자 인지 검사
        System.out.println("\n이미 입력한 문자입니다! 다시 입력해주세요,");
        already= true;
      }
    }

 
    if(!already) {

      inputString.append(guess);  //입력한 문자열들의 모음에 추가

      boolean success= false;
      for(int i=0;i<hiddenString.length();i++){
        if(hiddenString.charAt(i)==guess){  //문제에 해당 문자가 있는지 조사
          outputString.setCharAt(i, guess);   // 문제에 문자 있으면  - 해당 문자로 변경
          remainder--; // 맞힐 문자수 1 감소
          success= true;  //입력한 문자가 문제에 있었음을 나타냄
        }
      }
      if(!success) failed++;  // 입력한 문자가 문제에 없으면 실패 횟수 1 증가
    }
  }

  // 그림 그리기
  public void drawMan() {
    System.out.println("  ┌─────┐");
    System.out.println("  │     │");

    switch(failed){
      case 0:
        System.out.println("        │");
        System.out.println("        │");
        System.out.println("        │");
        System.out.println("        │");
        System.out.println("        │");
        System.out.println("        │");
        break;
      case 1:
        System.out.println("  ◑     │");
        System.out.println("        │");
        System.out.println("        │");
        System.out.println("        │");
        System.out.println("        │");
        System.out.println("        │");
        break;
      case 2:
        System.out.println("  ◑     │");
        System.out.println(" ┌┼     │");
        System.out.println("        │");
        System.out.println("        │");
        System.out.println("        │");
        System.out.println("        │");
        break;
      case 3:
        System.out.println("  ◑     │");
        System.out.println(" ┌┼     │");
        System.out.println("  │     │");
        System.out.println("        │");
        System.out.println("        │");
        System.out.println("        │");
        break;
      case 4:
        System.out.println("  ◑     │");
        System.out.println(" ┌┼┐    │");
        System.out.println("  │     │");
        System.out.println("        │");
        System.out.println("        │");
        System.out.println("        │");
        break;
      case 5:
        System.out.println("  ◑     │");
        System.out.println(" ┌┼┐    │");
        System.out.println("  │     │");
        System.out.println(" ┌┴     │");
        System.out.println(" │      │");
        System.out.println("        │");
        break;
      case 6:
        System.out.println("  ◑     │");
        System.out.println(" ┌┼┐    │");
        System.out.println("  │     │");
        System.out.println(" ┌┴┐    │");
        System.out.println(" │ │    │");
        System.out.println("        │");
        break;
    }
  }
  public char readChar() throws IOException {
    BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
    String user;

    System.out.print("1 문자를 입력하세요: ");
    user= in.readLine();
    return user.charAt(0);
  } 
}



// Hangman2 class

import java.util.*;
import java.io.*;

public class Hangman2 extends Hangman
{
  String[] words  = {"influenza", 
                     "fever",
                     "cancer",
                     "poison",
                     "victim",
                     "physician",
                     "clinic",
                     "symptom",
                     "medicine",
                     "drug",
                     "hygiene"};
  String[] meaning= {"독감",
                     "열",
                     "암",
                     "독",
                     "환자",
                     "내과의사",
                     "진료소",
                     "징후",
                     "의학",
                     "약",
                     "위생학"};

  public Hangman2() throws IOException
  {
    Random r= new Random();
    int randomNum= Math.abs(r.nextInt() % words.length);

    hiddenString= words[randomNum];

    System.out.println("\n의미: "+ meaning[randomNum]);
  }

  public char readChar() throws IOException
  {
    BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
    String user;

    do{
      System.out.print("1 문자를 입력하세요(힌트를 원하면 ? 입력): ");
      user= in.readLine();

      if(user.charAt(0)=='?'){
        boolean givehint= false;
        int i=0;
        while(!givehint){
          if(outputString.charAt(i)=='-'){
            System.out.println();
            System.out.println("힌트: "+ hiddenString.charAt(i));
            System.out.println();
            failed++;
            givehint= true;
          }
          i++;
        }
      }
    }while(user.charAt(0)=='?');

    return user.charAt(0);
  }
}

