package testcases;

import commons.ApiConfig;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class PublicContactListTest extends ApiConfig {

    @Test
    public void register_single_user(){
        String payload = "{" +

                "       \"email\": \"user@example.com\"," +
                "        \"password\": \"SuperSecretPassword123\"" +
                "}";

        RestAssured.baseURI = "https://craftplacer.trexion.com";
        RequestSpecification spec = RestAssured.given();
        spec.header("Content-Type", "Application/json");
        spec.body(payload);

        Response response = spec.post("/pcl/auth/register");
        System.out.println(response.getStatusLine());

    }
    @Test
    public  void register_single_user_file_payload(){
        String path = System.getProperty("user.dir") + "/src/test/resources/payloads/newUser.txt";
        String payload = read(path).trim();



        RestAssured.baseURI = "https://craftplacer.trexion.com";
        RequestSpecification spec = RestAssured.given();
        spec.header("Content-Type", "Application/json");
        spec.body(payload);

        Response response = spec.post("/pcl/auth/register");
        System.out.println(response.getStatusLine());
        System.out.println(payload);

    }
    @Test
    public void login_single_user(){
        String payload = "{" +

                "       \"email\": \"user@example.com\"," +
                "        \"password\": \"SuperSecretPassword123\"" +
                "}";


        RestAssured.baseURI = "https://craftplacer.trexion.com";
        RequestSpecification spec = RestAssured.given();
        spec.header("Content-Type", "Application/json");
        spec.body(payload);

        Response response = spec.post("/pcl/auth/login");
        String SessionToken = response.body().asString();
        System.out.println(response.getStatusLine());
        System.out.println(SessionToken);


    }

}
