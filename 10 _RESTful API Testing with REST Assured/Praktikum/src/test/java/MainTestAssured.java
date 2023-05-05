import static io.restassured.RestAssured.when;

import io.restassured.response.ValidatableResponse;
import org.apache.commons.codec.digest.UnixCrypt;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
public class MainTestAssured {
static String  HOST = "https://jsonplaceholder.typicode.com";
    @Test
    void getAllPosts(){
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .when() .log().all()
                .get("/posts")
                .then() .log().all()
                .statusCode(200)
                .time(lessThan(3000L));
                //.body(matchesJsonSchemaInClasspath("allpostschema.json"));
    }
    @Test
    void createNewPost(){
        int userId = 2;
        String title = "test create post";
        String body = "this is posting";
        JSONObject bodyRequest = new JSONObject();
        bodyRequest.put("userId", userId);
        bodyRequest.put("id", 101);
        bodyRequest.put("title", title);
        bodyRequest.put("body", body);
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type","application/json")
                .body(bodyRequest)
                .when() .log().all()
                .post("/posts")
                .then() .log().all()
                .statusCode(201)
                .body("id",equalTo(101))
                .body("userId",equalTo(userId))
                .body("title",equalTo(title))
                .body("body",equalTo(body));
                //.body(matchesJsonSchemaInClasspath("postschema.json"));
    }
    @Test
    void SpesificPost(){
        int postId = 1;
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .when() .log().all()
                .get("/posts/"+postId)
                .then() .log().all()
                .statusCode(200)
                .body("id", equalTo(1));
                //.body(matchesJsonSchemaInClasspath("postschema.json"));
    }
    @Test
    void editPost(){
        int userId = 2;
        int postId = 1;
        String title = "edit test post";
        String body = "posts edit";
        JSONObject bodyRequest = new JSONObject();
        bodyRequest.put("userId", userId);
        bodyRequest.put("title", title);
        bodyRequest.put("body", body);
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type","application/json")
                .body(bodyRequest)
                .when() .log().all()
                .put("/posts/"+postId)
                .then() .log().all()
                .statusCode(200)
                .body("id",equalTo(postId))
                .body("userId",equalTo(userId))
                .body("title",equalTo(title))
                .body("body",equalTo(body));
                //.body(matchesJsonSchemaInClasspath("postschema.json"));
    }
    @Test
    void deletePost() {
        int postId = 1;
        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .when().log().all()
                .delete("/posts/" + postId)
                .then().log().all()
                .statusCode(200);
    }
}
