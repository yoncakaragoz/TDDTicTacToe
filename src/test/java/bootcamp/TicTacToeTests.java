package bootcamp;
import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class TicTacToeTests {

    private TicTacToe ticTacToe;

    @BeforeEach
    public void setupTest(){
        ticTacToe = new TicTacToe(3);
    }

    @Test
    public void itShouldThrowInvalidGridSizeException_WhenGridSizeIsInvalid(){



    }
}
