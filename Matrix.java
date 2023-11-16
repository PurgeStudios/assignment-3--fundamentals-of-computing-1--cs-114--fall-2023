public class Matrix {

  public static int[][] matrix;

  public static void matrix(int size) { // Constructor that accepts User's Input as size

    matrix = new int[size][size];

    System.out.println("Your matrix is " + size + " x " + size + "\n");
    System.out.println("Printing matrix with default values:");
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

    int value = 0;

    System.out.println("Populating matrix...matrix populated \n");
    System.out.println("Printing Matrix:");

    for (int row = 0; row < matrix.length; row++) {
      for (int colomn = 0; colomn < matrix.length; colomn++) {
        matrix[row][colomn] = ++value;
      }
    }
  }

    private static void swap(int x1, int y1, int x2, int y2) {
      int hold = matrix[x1][x2];
      matrix[x1][x2] = matrix[y1][y2];
      matrix[y1][y2] = hold;
  }

   public static void flipMatrix() {

    int row;
    int colomn;

    System.out.println("Flipping matrix...matrix flipped \n");
    System.out.print("Printing flipped matrix:");

    for(row = 0; row < matrix.length - 1; row++){
      for(colomn = row; colomn < matrix.length - 1 - row; colomn++);{
        swap(row, colomn, matrix.length - (colomn  + 1), matrix.length - (row + 1));
      }
    }
  }
}
