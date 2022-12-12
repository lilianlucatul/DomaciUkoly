package domaci_ukoly;

/**
 *
 * @author Lilian
 */
public class StochasticMatrix {

    public static void main(String[] args) {
        double[][] matrix = {
            {0, 0, 0.5, 0, 0.5},
            {0, 0, 1, 0, 0},
            {0.25, 0.25, 0, 0.25, 0.25},
            {0, 0, 0.5, 0, 0.5},
            {0, 0, 0, 0, 1}
        };
        printMatrix(matrix);
        System.out.println("Tato matice " + (isStochasticMatrix(matrix) ? "je" : "neni") + " stochasticka.");
    }

    public static boolean isStochasticMatrix(double[][] matrix) {
        return checkRowSum(matrix) && containOnlyNonNegative(matrix);
    }

    public static boolean checkRowSum(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            double rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != 1) {
                return false;
            }
            rowSum = 0;
        }
        return true;
    }

    public static boolean containOnlyNonNegative(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
