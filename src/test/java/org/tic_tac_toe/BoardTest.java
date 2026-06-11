package org.tic_tac_toe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    @Test
    void testIsPositionEmpty() {
        // arrange
        Board board = new Board();

        // act
        boolean result = board.isPositionEmpty(0, 0);

        // assert
        assertTrue(result);
    }

    @Test
    void testIsBoardFull() {
        Board board = new Board();

        board.placeMark(0, 0, 'X');
        board.placeMark(0, 1, 'O');
        board.placeMark(0, 2, 'X');

        board.placeMark(1, 0, 'O');
        board.placeMark(1, 1, 'X');
        board.placeMark(1, 2, 'O');

        board.placeMark(2, 0, 'X');
        board.placeMark(2, 1, 'O');
        board.placeMark(2, 2, 'X');

        boolean result = board.isBoardFull();

        assertTrue(result);
    }

    @Test
    void testIsBoardNotFull() {
        // arrange
        Board board = new Board();
        board.placeMark(0, 0, 'X');
        board.placeMark(0, 1, 'O');
        board.placeMark(0, 2, ' ');

        board.placeMark(1, 0, 'O');
        board.placeMark(1, 1, 'X');
        board.placeMark(1, 2, 'O');

        board.placeMark(2, 0, 'X');
        board.placeMark(2, 1, 'O');
        board.placeMark(2, 2, 'X');

        // act
        boolean result = board.isBoardFull();

        // assert
        assertFalse(result);
    }

    @Test
    void testIsCheckRows() {
         // arrange
        Board board = new Board();
        board.placeMark(0, 0, 'X');
        board.placeMark(0, 1, 'X');
        board.placeMark(0, 2, 'X');

        // act
        boolean result=board.checkRows('X');

         // assert
        assertTrue(result);
    }

    @Test
    void testIsNotCheckRows() {
         // arrange
        Board board = new Board();
        board.placeMark(0, 0, 'X');
        board.placeMark(0, 1, ' ');
        board.placeMark(0, 2, 'X');

        // act
        boolean result=board.checkRows('X');

         // assert
        assertFalse(result);
    }

    @Test
    void testIsCheckColumns() {
         // arrange
        Board board = new Board();
        board.placeMark(0, 0, 'O');
        board.placeMark(1, 0, 'O');
        board.placeMark(2, 0, 'O');

        // act
        boolean result=board.checkColumns('O');

         // assert
        assertTrue(result);
    }

    @Test
    void testIsNotCheckColumns() {
         // arrange
        Board board = new Board();
        board.placeMark(0, 0, 'O');
        board.placeMark(1, 0, ' ');
        board.placeMark(2, 0, 'O');

        // act
        boolean result=board.checkRows('O');

         // assert
        assertFalse(result);
    }
    

 
}
