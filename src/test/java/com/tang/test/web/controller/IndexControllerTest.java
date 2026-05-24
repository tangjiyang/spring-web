package com.tang.test.web.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.resttestclient.autoconfigure.AutoConfigureRestTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.client.RestTestClient;

@SpringBootTest
@AutoConfigureRestTestClient
public class IndexControllerTest {
    @Autowired
    private RestTestClient restTestClient;

    @Test
    public void testIndex() {
        byte[] responseBodyContent = restTestClient.get()
                .uri("/index")
                .exchange()
                .expectStatus().isOk()
                .returnResult().getResponseBodyContent();
        System.out.println(new String(responseBodyContent));
    }

}
