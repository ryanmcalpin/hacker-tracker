import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {

  @Test
  public void team_instantiatesCorrectly_true() {
    Team team = new Team("The Hacks");
    assertTrue(team instanceof Team);
  }
}