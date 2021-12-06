package com.feiniaojin.naaf.init.app;

import com.feiniaojin.naaf.ngr.starter.EnableGracefulResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author <a href="mailto:qinyujie@gingo.cn">Yujie</a>
 * @version 0.1
 */
@SpringBootApplication(scanBasePackages = {
        "com.feiniaojin.naaf.init"
})
@EnableGracefulResponse
public class AppStarter {

    public static void main(String[] args) {
        SpringApplication.run(AppStarter.class, args);
    }
}
