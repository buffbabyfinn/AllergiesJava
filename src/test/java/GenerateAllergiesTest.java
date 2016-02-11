import org.junit.*;
import static org.junit.Assert.*;

public class GenerateAllergiesTest {

  @Test
  public void generateAllergies_128_cats() {
    GenerateAllergies generateAllergiesTest = new GenerateAllergies();
    assertArrayEquals(new String[]{"cats"}, generateAllergiesTest.generateAllergies(128));
}
  @Test
  public void generateAllergies_192_pollen() {
    GenerateAllergies generateAllergiesTest = new GenerateAllergies();
    assertArrayEquals(new String[]{"cats", "pollen"}, generateAllergiesTest.generateAllergies(192));
}

@Test
public void generateAllergies_160_CatsAndChocolate() {
  GenerateAllergies generateAllergiesTest = new GenerateAllergies();
  assertArrayEquals(new String[]{"cats", "chocolate"}, generateAllergiesTest.generateAllergies(160));
}
@Test
public void generateAllergies_160_CatsAndEggs() {
  GenerateAllergies generateAllergiesTest = new GenerateAllergies();
  assertArrayEquals(new String[]{"cats", "eggs"}, generateAllergiesTest.generateAllergies(129));
}
}
