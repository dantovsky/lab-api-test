package org.dante.lab.apitest;

import org.hamcrest.CoreMatchers;
import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

/**
 * Classe que realiza testes a uma API.
 * @author dantiii
 *
 */
public class APITest {

    // @BeforeClass executes one time before testes
    @BeforeClass
    public static void setup() {
        // Config global for Rest Assured
        RestAssured.baseURI = "http://localhost:8001/lab-backend/voos";
    }

    // (1) Status code when GET

    @Test
    public void getAllAtates() {
        RestAssured.given()
                //.log().all() 	// log da req
                .when()
                .get("/todo")
                .then()
                //.log().all()	// log da res
                .statusCode(200)
        ;
    }
}
