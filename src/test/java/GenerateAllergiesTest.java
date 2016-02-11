import org.junit.*;
import static org.junit.Assert.*;

public class GenerateAllergiesTest {

  @Test
  public void generateAllergies_128_cats() {
    GenerateAllergies generateAllergiesTest = new GenerateAllergies();
    String[] allergies = {"cats"};
    assertEquals(allergies, generateAllergiesTest.generateAllergies(128));

}
}
