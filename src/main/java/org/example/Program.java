package org.example;


import org.example.boardgame.Board;
import org.example.chess.ChessMatch;

public class Program {
    public static void main(String[] args) {
        Board board = new Board(8, 8);

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}