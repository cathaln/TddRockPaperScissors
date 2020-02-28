public class RockPaperScissorsGame {

    private int roundNumber = 1;
    private String winnerAppendage;

    public String playRound(String playerOneHand, String playerTwoHand) {
        if(roundNumber > 3) return "Game is over.";

        String result = "Draw";

        roundNumber++;
        switch (playerOneHand) {
            case "Rock":
                if (playerTwoHand.equals("Paper")) result = "Player2";
                if (playerTwoHand.equals("Scissor")) result = "Player1";
                break;
            case "Scissor":
                if (playerTwoHand.equals("Rock")) result = "Player2";
                if (playerTwoHand.equals("Paper")) result = "Player1";
                break;
            case "Paper":
                if (playerTwoHand.equals("Rock")) result = "Player1";
                if (playerTwoHand.equals("Scissor")) result = "Player2";
                break;
        }

        roundNumber--;
        return result;
    }
}
