package com.ltp;

import com.ltp.service.TbContentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSecurityOauth2ResourceApplicationTests {

    @Autowired
    private TbContentService tbContentService;

    @Test
    void contextLoads() {
        System.out.println(tbContentService.delete("31"));
    }

}
