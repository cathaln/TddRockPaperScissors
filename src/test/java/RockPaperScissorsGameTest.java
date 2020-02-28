import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RockPaperScissorsGameTest {

    RockPaperScissorsGame rockPaperScissorsGame;

    @BeforeEach
    void Setup(){
        rockPaperScissorsGame = new RockPaperScissorsGame();
    }

    @Test
    void PlayRound_OneRockOneScissor_ReturnPlayer1(){
        var result = rockPaperScissorsGame.playRound("Rock", "Scissor");
        Assertions.assertEquals("Player1", result);
    }

    @Test
    void PlayRound_OneRockOnePaper_ReturnPlayer2(){
        var result = rockPaperScissorsGame.playRound("Rock", "Paper");
        Assertions.assertEquals("Player2", result);
    }

    @Test
    void PlayRound_OneScissorOneRock_ReturnDraw(){
        var result = rockPaperScissorsGame.playRound("Rock", "Rock");
        Assertions.assertEquals("Draw", result);
    }

    @Test
    void PlayRound_OneScissorOneRock_ReturnRock(){
        var result = rockPaperScissorsGame.playRound("Scissor", "Rock");
        Assertions.assertEquals("Player2", result);
    }

    @Test
    void PlayRound_OneScissorOnePaper_ReturnPlayer1(){
        var result = rockPaperScissorsGame.playRound("Scissor", "Paper");
        Assertions.assertEquals("Player1", result);
    }

    @Test
    void PlayRound_OneScissorOneScissor_ReturnDraw(){
        var result = rockPaperScissorsGame.playRound("Scissor", "Scissor");
        Assertions.assertEquals("Draw", result);
    }

    @Test
    void PlayRound_OnePaperOneRock_ReturnPlayer1(){
        var result = rockPaperScissorsGame.playRound("Paper", "Rock");
        Assertions.assertEquals("Player1", result);
    }

    @Test
    void PlayRound_OnePaperOneScissor_ReturnPlayer1(){
        var result = rockPaperScissorsGame.playRound("Paper", "Scissor");
        Assertions.assertEquals("Player2", result);
    }

    @Test
    void PlayRound_OnePaperOnePaper_ReturnDraw(){
        var result = rockPaperScissorsGame.playRound("Paper", "Paper");
        Assertions.assertEquals("Draw", result);
    }

    @Test
    void PlayGame_Player1RRRPlayer2SSS_ReturnPlayer1(){
        var resultRoundOne = rockPaperScissorsGame.playRound("Rock", "Scissor");
        Assertions.assertEquals("Player1", resultRoundOne);
        var resultRoundTwo = rockPaperScissorsGame.playRound("Rock", "Scissor");
        Assertions.assertEquals("Player1", resultRoundTwo);
        var resultRoundThree = rockPaperScissorsGame.playRound("Rock", "Scissor");
        Assertions.assertEquals("Player1 has won the game", resultRoundThree);
    }

}