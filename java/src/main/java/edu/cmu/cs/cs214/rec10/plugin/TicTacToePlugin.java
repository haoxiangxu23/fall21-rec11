package edu.cmu.cs.cs214.rec10.plugin;

import edu.cmu.cs.cs214.rec10.framework.core.GameFramework;
import edu.cmu.cs.cs214.rec10.framework.core.GamePlugin;
import edu.cmu.cs.cs214.rec10.games.TicTacToe;

public class TicTacToePlugin implements GamePlugin<TicTacToe.Player> {

    private static final String GAME_NAME = "Tic Tac Toe";

    private static final int WIDTH = 3;
    private static final int HEIGHT = 3;
    private GameFramework framework;
    private TicTacToe game;

    public TicTacToePlugin(TicTacToe game) {
        this.game = game;
    }


    @Override
    public String getGameName() {
        return GAME_NAME;
    }

    @Override
    public int getGridWidth() {
        return WIDTH;
    }

    @Override
    public int getGridHeight() {
        return HEIGHT;
    }

    @Override
    public void onRegister(GameFramework f) {
        framework = f;
    }

    @Override
    public void onNewGame() {

    }

    @Override
    public void onNewMove() {

    }

    @Override
    public boolean isMoveValid(int x, int y) {
        return game.isValidPlay(x, y);
    }

    @Override
    public boolean isMoveOver() {
        return false;
    }

    @Override
    public void onMovePlayed(int x, int y) {

    }

    @Override
    public boolean isGameOver() {
        return false;
    }

    @Override
    public String getGameOverMessage() {
        return null;
    }

    @Override
    public void onGameClosed() {

    }

    @Override
    public Object currentPlayer() {
        return null;
    }
}
