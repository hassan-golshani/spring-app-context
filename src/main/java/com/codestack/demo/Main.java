package com.codestack.demo;

import com.codestack.demo.model.UserAccount;
import com.codestack.demo.repository.UserAccountRepository;
import com.codestack.demo.service.UserAccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.codestack.demo")
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(Main.class);

        UserAccountService userAccountService = annotationConfigApplicationContext.getBean(UserAccountService.class);

        UserAccount userAccountById = userAccountService.findUserAccountById(1);
        System.out.println(userAccountById);

    }
}