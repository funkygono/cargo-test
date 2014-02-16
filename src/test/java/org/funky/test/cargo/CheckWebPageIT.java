package org.funky.test.cargo;

import org.junit.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Integration test that checks the web application deployed with Cargo.
 */
public class CheckWebPageIT {

    /**
     * Get the index page and check it.
     */
    @Test
    public void test__GetIndex() throws IOException {
        URL url = new URL("http://localhost:8080/cargo-test/index.html");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int responseCode = connection.getResponseCode();
        System.out.println("Response code: " + responseCode);
    }

}
