package com.dsapp.room;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class RoomApplication {

    public static final String APPLICATION_LOCATIONS = "spring.config.location="
            + "classpath:application.yml,"
            + "/app/config/springboot-webservice/real-application.yml";
            //+ "file:///D:/workspace-mj/config/room/application.yml";

    public static void main(String[] args) {
        new SpringApplicationBuilder(RoomApplication.class)
                .properties(APPLICATION_LOCATIONS)
                .run(args);
        //SpringApplication.run(RoomApplication.class, args);
    }

}
