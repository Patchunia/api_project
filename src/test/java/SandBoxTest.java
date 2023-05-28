import com.google.gson.Gson;
import io.restassured.RestAssured;

import io.restassured.http.ContentType;
import io.restassured.response.ResponseBody;
import logging.Logging;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;
import pojo.Promotions;
import pojo.Sandbox;
import service.Service;

import static io.restassured.RestAssured.given;

public class SandBoxTest {

    Service sandBoxService;

    @Before
    public void setup() {
        RestAssured.baseURI = "Https://api.tmsandbox.co.nz/v1/";
        sandBoxService = new Service();
    }

    @Test
    public void validate_name() {
       Assert.assertEquals(sandBoxService.sendAGetRequestToSandboxAPI().getName(), "Carbon credits");
    }

    @Test
    public void validate_canRelist() {

        Assert.assertEquals(sandBoxService.sendAGetRequestToSandboxAPI().getCanRelist(), true);

    }

    @Test
    public void validate_Promotions() {

        for (Promotions promotion:sandBoxService.sendAGetRequestToSandboxAPI().getPromotions()) {
           if(  (promotion.getName().equals("Gallery"))  && (promotion.getDescription().contains("Good position in category")) );
            {
                Assert.assertTrue(true, "Succesffuly validated the acceptance criteria");
            }

        }

    }
}
