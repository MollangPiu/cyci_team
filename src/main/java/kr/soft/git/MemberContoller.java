package kr.soft.git;


import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MemberContoller {


    @GetMapping("/mollang1")
    public void mollang1() {
      log.info("mollang1");
    }

    @GetMapping ("/mollang")
    public void mollang(){
        log.info("mollang");
    }



}
