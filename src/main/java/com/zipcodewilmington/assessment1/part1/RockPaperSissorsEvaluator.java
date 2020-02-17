package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        if(handSign == ROCK)
            return PAPER;
        else if(handSign == PAPER)
            return  SCISSOR;
        else if(handSign == SCISSOR)
            return ROCK;
        else
            return null;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        if(handSign == ROCK)
            return SCISSOR;
        else if(handSign == PAPER)
            return  ROCK;
        else if(handSign == SCISSOR)
            return PAPER;
        else
            return null;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        if(getWinningMove(handSignOfPlayer1) == handSignOfPlayer2){
            //player2 wins
            return handSignOfPlayer2;
        }else if(getLosingMove(handSignOfPlayer1) == handSignOfPlayer2){
            //player2 loses
            return handSignOfPlayer1;
        }else{
            //a tie
            return null;
        }
    }
}
