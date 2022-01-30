package com.davidagood.mapstruct;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class MapstructFilerExceptionApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MapstructFilerExceptionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        UserDto user = UserMapper.INSTANCE.mapUser(User.builder().id("User123").build());
        log.info("{}", user);
    }
}
