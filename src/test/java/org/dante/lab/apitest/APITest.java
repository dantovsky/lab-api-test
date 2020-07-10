package org.dante.lab.apitest;

import org.hamcrest.CoreMatchers;
import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

/**
 * Classe que realiza testes à API.
 * @author dantiii
 *
 */
public class APITest {

    // @BeforeClass executes one time before testes
    @BeforeClass
    public static void setup() {
        // Config global for Rest Assured
        RestAssured.baseURI = "http://localhost:8080/api/";
    }

    // Status code when GET

    @Test
    public void getAllStates() {
        RestAssured.given()
                //.log().all() 	// log da req
                .when()
                    .get("/states")
                .then()
                //.log().all()	// log da res
                    .statusCode(200)
        ;
    }
}
