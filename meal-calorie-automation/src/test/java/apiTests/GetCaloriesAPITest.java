package apiTests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetCaloriesAPITest {

    @Test
    public void testGetCalories() {
        String payload = "{\"dish_name\":\"chicken biryani\", \"servings\":2}";

        Response response = RestAssured.given()
                .baseUri("http://localhost:8000")
                .basePath("/get-calories")
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .post();

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertTrue(response.getBody().asString().contains("total_calories"));
    }

}
