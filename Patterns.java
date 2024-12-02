public class Patterns {
    public static void main(String[] args) {
        printPattern17(5);
    }

    static void printPattern5(int n){
        for (int row = 0; row < 2*n; row++) {
            int noOfCols = row > n ? 2*n - row : row;
            for (int col = 0; col < noOfCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printPattern28(int n){
        for (int row = 0; row < 2*n; row++) {
            int noOfCols = row > n ? 2*n - row : row;
            int noOfSpaces = n - noOfCols;
            for (int space = 0; space < noOfSpaces; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < noOfCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printPattern30(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col  + " ");
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(col  + " ");
            }
            System.out.println();
        }

    }

    static void printPattern17(int n){
        for (int row = 1; row <= 2 * n; row++) {
            int noOfCols = row > n ? 2*n - row : row;
            for (int space = 0; space < n - noOfCols; space++) {
                System.out.print("  ");
            }

            for (int col = noOfCols; col >= 1; col--) {
                System.out.print(col  + " ");
            }

            for (int col = 2; col <= noOfCols; col++) {
                System.out.print(col  + " ");
            }
            System.out.println();
        }

    }
}
