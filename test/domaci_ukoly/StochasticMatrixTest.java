package domaci_ukoly;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lilian
 */
public class StochasticMatrixTest {

    public StochasticMatrixTest() {

    }

    @Test
    public void stochasticMatrixTest1() {
        double[][] matrix = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        assertEquals(true, StochasticMatrix.isStochasticMatrix(matrix));
    }

    @Test
    public void stochasticMatrixTest2() {
        double[][] matrix = {
            {0.5, 0, 0.5},
            {0, 1, 0},
            {0.2, 0.1, 0.7}
        };
        assertEquals(true, StochasticMatrix.isStochasticMatrix(matrix));
    }

    @Test
    public void stochasticMatrixTest3() {
        double[][] matrix = {
            {0, 0, 0.5, 0, 0.5},
            {0, 0, 1, 0, 0},
            {0.25, 0.25, 0, 0.25, 0.25},
            {0, 0, 0.5, 0, 0.5},
            {0, 0, 0, 0, 1}
        };
        assertEquals(true, StochasticMatrix.isStochasticMatrix(matrix));
    }

    @Test
    public void stochasticMatrixTest4() {
        double[][] matrix = {
            {0, 2},
            {0, 1},
            {0.25, 0.25},
            {0, 1},
            {0, 1}
        };
        assertEquals(false, StochasticMatrix.isStochasticMatrix(matrix));
    }

}
