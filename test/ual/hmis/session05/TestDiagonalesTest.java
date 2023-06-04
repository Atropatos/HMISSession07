package ual.hmis.session05;
import static org.junit.Assert.*;
import ual.hmis.session05.*;
import org.junit.Test;
public class TestDiagonalesTest {
	TestDiagonales testDiagonales = new TestDiagonales();
	 @Test
	    public void testReceiveDiagonales() {
	        int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
	        int[][] expected = {
	            {1, 5, 9},
	            {3, 5, 7}
	        };
	        assertArrayEquals(expected, testDiagonales.receiveDiagonales(matrix));
	    }
	 
	 @Test
	 public void testAddColumns() {
		 double[][] matrix = {
				 {1.0, 2.0, 3.0},
		            {4.0, 5.0, 6.0},
		            {7.0, 8.0, 9.0}
		 };
		 double[] expected = {12.0,15.0,18.0};
		 assertArrayEquals(expected,testDiagonales.addColumns(matrix), 0.0001);
	 }
}
