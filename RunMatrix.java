import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {

    System.out.print("Please enter the size of your matrix: ");
    Scanner scan = new Scanner(System.in);

    int userInput = scan.nextInt();
    System.out.println(); //Spaces output for visibility

    Matrix.matrix(userInput);
    System.out.println();

    Matrix.printMatrix(userInput);
    System.out.println();

    scan.close();

    }
  }
