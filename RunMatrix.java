import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {

    System.out.print("Please enter the size of your matrix: ");
    Scanner scan = new Scanner(System.in);


    int userInput = scan.nextInt();

    if(userInput > 0) { //Checks if input negative

    }
    else if(userInput <= 0) {
      System.out.println("\n\u001B[33m" + "You have entered a negative number, please provide a postive number. " +
      "Specific error code below:" + "\u001B[0m\n");
    }

    System.out.println(); //Spaces output for readability

    Matrix.matrix(userInput);

    Matrix.printMatrix(userInput);
    System.out.println();

    Matrix.populateMatrix();

    Matrix.printMatrix(userInput);
    System.out.println();

    Matrix.flipMatrix();
    System.out.println();

    Matrix.printMatrix(userInput);

    scan.close();
    }
  }
