import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class GenerateAllergies {
  public static void main(String[] args) {

        String layout = "templates/layout.vtl";

        get("/", (request, response) -> {
          Map<String, Object> model = new HashMap<String, Object>();
          model.put("template", "templates/home.vtl");
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/detector", (request, response) -> {
          Map<String, Object> model = new HashMap<String, Object>();
          model.put("template", "templates/detector.vtl");

          String inputString = request.queryParams("inputString");
          Integer inputInteger = Integer.parseInt(inputString);
          String allergies = generateAllergies(inputInteger);

          model.put("inputInteger", inputInteger);
          model.put("allergies", allergies);
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
      }

  public static String generateAllergies (Integer inputInteger) {

    Integer input = inputInteger;
    ArrayList allergies = new ArrayList();

    while (input >= 128) {
      allergies.add("cats");
      input -= 128;
    }

    while (input >= 64) {
      allergies.add("pollen");
      input -= 64;
    }

    while (input >= 32) {
      allergies.add("chocolate");
      input -= 32;
    }

    while (input >= 16) {
      allergies.add("tomatoes");
      input -= 16;
    }

    while (input >= 8) {
      allergies.add("strawberries");
      input -= 8;
    }

    while (input >= 4) {
      allergies.add("shellfish");
      input -= 4;
    }
    while (input >= 2) {
      allergies.add("peanuts");
      input -= 2;
    }
    while (input >= 1) {
      allergies.add("eggs");
      input -= 1;
    }

    return allergies.toString();

    // Integer input = inputInteger;
    // Integer quarterCount = 0;
    // Integer dimeCount = 0;
    // Integer nickelCount = 0;
    // String result = "";
    //
    // while (input >= 25) {
    //   input -= 25;
    //   quarterCount++;
    // }
    //   result += quarterCount + " quarter.";
    // while (input >= 10) {
    //   input -= 10;
    //   dimeCount++;
    // }
    //   result += " " + dimeCount + " dime.";
    //
    // while (input >= 5) {
    //   input -= 5;
    //   nickelCount++;
    // }
    //   result += " " + nickelCount + " nickel.";
    //
    //
    // if (input != 0) {
    //   result += " And " + input + " penny.";
    // }
    //
    // return result;
  }
}
