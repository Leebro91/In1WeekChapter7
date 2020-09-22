class Main {

  // 행렬 x 행렬 y 합 z
  static boolean addMatrix(int[][] x, int [][] y, int [][] z) {
    if (x.length != y.length || y.length != z.length)
      return false;
      // 3개의 배열 x,y,z의 행수가 모두 같은지 확인

    for (int i = 0 ; i < x.length ; i++)
      if (x[i].length != y[i].length || y[i].length != z[i].length)
        return false;
      // 3개의 배열 x,y,z 모든 행의 열수가 같은지 확인

    for (int i = 0 ; i < x.length ; i++)
      for (int j = 0 ; j < x[i].length ; j++)
        z[i][j] = x[i][j] + y[i][j];
    return true;

  }

  // 행렬의 모든 요소를 표시
    static void printMatrix(int[][] m) {
      for ( int i = 0 ; i < m.length ; i++) {
        for (int j = 0 ; j < m[i].length; j++) 
        System.out.print(m[i][j] + " ");
        System.out.println();
      }
    }


  public static void main(String[] args) {
    int[][] a = {{1,2,3},{4,5,6}};
    int[][] b = {{6,4,5},{5,1,2}};
    int[][] c = new int[2][3];

    if(addMatrix(a,b,c)) {
      System.out.println("행렬a");printMatrix(a);
      System.out.println("\n행렬b");printMatrix(b);
      System.out.println("\n행렬c");printMatrix(c);

    }
  }
}
