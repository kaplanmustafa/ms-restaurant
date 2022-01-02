package com.example.msrestaurant;

import com.example.mscommon.error.ErrorConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ErrorConfig.class})
public class MsRestaurantApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsRestaurantApplication.class, args);
    }

}
