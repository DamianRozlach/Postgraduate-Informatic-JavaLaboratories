package pl.edu.agh.asd2.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise07Array2DTest {

	// correct values

	@Test
	public void testHorizontalWinArrays() {
		assertTrue(Exercise07Array2D.checkTicTacToeBoard(new String[][] { { Exercise07Array2D.O, Exercise07Array2D.O, Exercise07Array2D.O }, { Exercise07Array2D.EMPTY, Exercise07Array2D.EMPTY, Exercise07Array2D.EMPTY }, { Exercise07Array2D.X, Exercise07Array2D.O, Exercise07Array2D.EMPTY } }));
		assertTrue(Exercise07Array2D.checkTicTacToeBoard(new String[][] { { Exercise07Array2D.X, Exercise07Array2D.O, Exercise07Array2D.EMPTY }, { Exercise07Array2D.O, Exercise07Array2D.O, Exercise07Array2D.O }, { Exercise07Array2D.EMPTY, Exercise07Array2D.EMPTY, Exercise07Array2D.EMPTY } }));
		assertTrue(Exercise07Array2D.checkTicTacToeBoard(new String[][] { { Exercise07Array2D.X, Exercise07Array2D.O, Exercise07Array2D.EMPTY }, { Exercise07Array2D.X, Exercise07Array2D.O, Exercise07Array2D.X }, { Exercise07Array2D.X, Exercise07Array2D.X, Exercise07Array2D.X } } ));

	}
	
	@Test
	public void testVerticalWinArrays() {
		assertTrue(Exercise07Array2D.checkTicTacToeBoard(new String[][] { { Exercise07Array2D.X, Exercise07Array2D.O, Exercise07Array2D.O }, { Exercise07Array2D.X, Exercise07Array2D.EMPTY, Exercise07Array2D.EMPTY }, { Exercise07Array2D.X, Exercise07Array2D.O, Exercise07Array2D.EMPTY } }));
		assertTrue(Exercise07Array2D.checkTicTacToeBoard(new String[][] { { Exercise07Array2D.X, Exercise07Array2D.O, Exercise07Array2D.EMPTY }, { Exercise07Array2D.O, Exercise07Array2D.O, Exercise07Array2D.O }, { Exercise07Array2D.EMPTY, Exercise07Array2D.O, Exercise07Array2D.EMPTY } }));
		assertTrue(Exercise07Array2D.checkTicTacToeBoard(new String[][] { { Exercise07Array2D.X, Exercise07Array2D.O, Exercise07Array2D.X }, { Exercise07Array2D.X, Exercise07Array2D.O, Exercise07Array2D.X }, { Exercise07Array2D.EMPTY, Exercise07Array2D.EMPTY, Exercise07Array2D.X } } ));

	}
	
	@Test
	public void testCrossWinArrays() {
		assertTrue(Exercise07Array2D.checkTicTacToeBoard(new String[][] { { Exercise07Array2D.X, Exercise07Array2D.O, Exercise07Array2D.O }, { Exercise07Array2D.O, Exercise07Array2D.X, Exercise07Array2D.EMPTY }, { Exercise07Array2D.O, Exercise07Array2D.O, Exercise07Array2D.X } }));
		assertTrue(Exercise07Array2D.checkTicTacToeBoard(new String[][] { { Exercise07Array2D.X, Exercise07Array2D.O, Exercise07Array2D.O }, { Exercise07Array2D.EMPTY, Exercise07Array2D.O, Exercise07Array2D.X }, { Exercise07Array2D.O, Exercise07Array2D.X, Exercise07Array2D.EMPTY } }));
	}

	// false values
	
	@Test
	public void testFalseArrays() {
		assertFalse(Exercise07Array2D.checkTicTacToeBoard(new String[][] { { Exercise07Array2D.EMPTY, Exercise07Array2D.EMPTY, Exercise07Array2D.EMPTY }, { Exercise07Array2D.EMPTY, Exercise07Array2D.EMPTY, Exercise07Array2D.EMPTY }, { Exercise07Array2D.EMPTY, Exercise07Array2D.EMPTY, Exercise07Array2D.EMPTY } }));
		assertFalse(Exercise07Array2D.checkTicTacToeBoard(new String[][] { { Exercise07Array2D.EMPTY, Exercise07Array2D.X, Exercise07Array2D.EMPTY }, { Exercise07Array2D.EMPTY, Exercise07Array2D.O, Exercise07Array2D.EMPTY }, { Exercise07Array2D.EMPTY, Exercise07Array2D.X, Exercise07Array2D.EMPTY } }));
		assertFalse(Exercise07Array2D.checkTicTacToeBoard(new String[][] { { Exercise07Array2D.X, Exercise07Array2D.O, Exercise07Array2D.X }, { Exercise07Array2D.O, Exercise07Array2D.X, Exercise07Array2D.O }, { Exercise07Array2D.O, Exercise07Array2D.X, Exercise07Array2D.O } }));
	}
	
	// wrong values
	@Test(expected = IllegalArgumentException.class)
	public void testEmptyArray() {
		Exercise07Array2D.checkTicTacToeBoard(new String[0][0]);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTooSmallArray() {
		Exercise07Array2D.checkTicTacToeBoard(new String[2][3]);
		Exercise07Array2D.checkTicTacToeBoard(new String[3][2]);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTooBigArray() {
		Exercise07Array2D.checkTicTacToeBoard(new String[4][3]);
		Exercise07Array2D.checkTicTacToeBoard(new String[3][4]);
	}

}