package testcases;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class ReqresGetTest {

    @Test
    public void client_can_get_all_user(){
        // Test data
        String baseURI = "https://reqres.in";
        String endpoint = "/api/users?page=2";
        int expectedStatusCode = 200;


        // Test steps
        // 1. form a request
        // 2. send the request
        // 3. capture the response
        // 4. extract the data and store them as actual
        RestAssured.baseURI = baseURI;
        RequestSpecification reqSpec = RestAssured.given();
        Response response = reqSpec.request(Method.GET, endpoint);
        int actualStatusCode = response.getStatusCode();
        // Status line  HTTP/1.1 200 OK
        String actualStatusLine = response.getStatusLine();
        System.out.println(actualStatusLine);
        // Headers
        // Convert-Type: Application/json UTF-8
        // Body
        // {"key": false, "name";"Nijat"}


        // Test Assertions

    }
}
// Given() -> prep, form a request
// Request types
// GET, PUT, POST, DELETE  <--- method, req type