package com.k9507.dubbo.dubboprovider;

import com.k9507.dubbo.service.DistrictService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class DubboProviderApplicationTests {


    @Autowired
    private DistrictService districtService;

    @Test
  public void test() {

        System.out.println(districtService.getAllDistrict());
    }

}
