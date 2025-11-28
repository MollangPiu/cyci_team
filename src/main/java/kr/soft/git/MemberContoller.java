package kr.soft.git;

import ch.qos.logback.classic.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberContoller {

    @GetMapping ("/mollang")
    public void mollang(){
        log.info("mollang");
    }


}
