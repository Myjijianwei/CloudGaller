package com.project.cloudgallerybackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.project.cloudgallerybackend.mapper")
public class CloudGalleryBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGalleryBackendApplication.class, args);
    }

}
