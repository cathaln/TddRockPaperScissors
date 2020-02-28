public class RockPaperScissorsGame {

    private int completedRounds = 0;

    public String playRound(String playerOneHand, String playerTwoHand) {
        if(completedRounds == 3) return "Game is over";

        String result = "Draw";

        completedRounds++;
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

        if (!result.equals("Draw")) {
            if (completedRounds == 3) result += " has won the game";
        }
        else completedRounds--;

        return result;
    }
}
