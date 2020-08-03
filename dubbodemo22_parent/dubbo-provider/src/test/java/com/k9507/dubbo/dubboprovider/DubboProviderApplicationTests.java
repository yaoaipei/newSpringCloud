package com.k9507.dubbo.dubboprovider;

import com.k9507.dubbo.dubboprovider.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class DubboProviderApplicationTests {


    @Autowired
    private TestService testService;

    @Test
  public void test() {

        System.out.println(testService.getHw());
    }

}
