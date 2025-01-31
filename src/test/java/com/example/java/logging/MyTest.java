package com.example.java.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.MDC;

import java.util.UUID;

public class MyTest {

    //  cara menggunakan MDC (Mapped diagnostic context) - MDC tidak dapat digunakan jika kita memakai multi thread kecuali mdc dimasukan kedalam threadnya juga
    @Test
    void testRequestId() {

        MyController controller = new MyController(new MyService(new MyRepository()));


        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                String requestId = UUID.randomUUID().toString();
                MDC.put("requestId", requestId);
                controller.save(requestId);
                MDC.remove("requestId");
            }).start();
        }


    }

}
