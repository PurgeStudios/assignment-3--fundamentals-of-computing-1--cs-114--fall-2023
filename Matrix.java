public class Matrix {

  public static int[][] matrix;

  public static void matrix(int size) { // Constructor that accepts User's Input as size

    matrix = new int[size][size];

    System.out.println("Your matrix is " + size + " x " + size);
  }

  public static void printMatrix(int size) {

    for (int row = 0; row < matrix.length; row++) {
      for (int colomn = 0; colomn < matrix.length; colomn++)

        if (row + colomn == matrix.length - 1) { //Highlighs every diagonal for this truth
          System.out.print("\u001B[33m" + matrix[row][colomn] + "\u001B[0m \t");
        }
        else {
          System.out.print(matrix[row][colomn] + "\t");
        }
      System.out.println();
    }
  }
  public static void populateMatrix() {

  }



  //   private void swap(int x1, int y1, int x2, int y2) {
  // }
}
