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

    @Test
    public void itShouldThrowRunTimeException_WhenPlayer_X_OutsideBoard(){

    }

    @Test
    public void itShouldThrowRunTimeException_WhenPlayer_O_OutsideBoard(){

    }

    @Test
    public void itShouldWin_WhenAllHorizontalLineIs_X(){

    }

    @Test
    public void itShouldWin_WhenAllVerticalLineIs_O(){

    }


    @Test
    public void itShouldWin_WhenDiagonalLineIs_X(){

    }

    @Test
    public void itShouldWin_WhenDiagonalLineIs_O(){

    }

}
