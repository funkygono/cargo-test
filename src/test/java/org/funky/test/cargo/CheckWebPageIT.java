package org.funky.test.cargo;

import com.google.common.io.CharStreams;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

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
        assertThat(connection.getResponseCode(), is(200));
        assertThat(getResponseAsString(connection),
                containsString("Welcome to the cargo test application"));
    }

    private String getResponseAsString(HttpURLConnection connection) throws IOException {
        return CharStreams.toString(new InputStreamReader(connection.getInputStream()));
    }

}
