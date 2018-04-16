


import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class BaiduTest {
    @Test
    public void testGetHtml(){
        useRelaxedHTTPSValidation();
        given()
                .get("http://www.baidu.com")
                .then().statusCode(200);
    }

    @Test
    public void testMp3(){
        useRelaxedHTTPSValidation();
        given()
                .queryParam("wd", "mp3")
        .when()
                .get("http://www.baidu.com/s")
        .then()
                .log().all()
                .statusCode(200);

    }

}
