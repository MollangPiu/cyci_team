package kr.soft.git;

import ch.qos.logback.classic.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class MemberContoller {
    @GetMapping("/babo")
    public void babo(){
        log.info("babo");
    }
}


