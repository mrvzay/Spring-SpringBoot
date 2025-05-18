package com.in28minutes.__learn_spring_aop;

import com.in28minutes.__learn_spring_aop.aopexample.business.BusinessService1;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

import static org.slf4j.LoggerFactory.getLogger;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private Logger logger = (Logger) getLogger(getClass());

    private BusinessService1 businessService1;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        businessService1.calculateMax();
    }
}
