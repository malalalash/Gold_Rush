import edu.io.Board;
import edu.io.Player;
import edu.io.token.PlayerToken;
import edu.io.token.Token;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayerTest {
    Board  board;
    Player player;

    @BeforeEach
    void setUp() {
        board = new Board();
        player = new Player();
    }

    @Test
    void can_assign_token_to_player() {
        PlayerToken token = new PlayerToken(board);
        player.assignToken(token);
        Assertions.assertEquals(token, player.token());
    }

}