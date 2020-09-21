import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class DemoTest {
    @Test
    public void practiceTest() {
        String url = "https://reqres.in/api/users/2";

        Response response = RestAssured.given().get(url).andReturn();
        response.getBody().prettyPrint();
    }

    @Test
    public void practicetest2() {
        String url = "https://swapi.dev/api/people/1/";
        Response response = RestAssured.given().get(url).andReturn();
        response.getBody().prettyPrint();
    }
}
