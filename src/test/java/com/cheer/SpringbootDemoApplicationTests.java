package com.cheer;

import com.cheer.domain.Emp;
import com.cheer.service.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDemoApplicationTests {
    @Autowired
      private EmpService empService;
    @Test
    public void getEmp() {
        List<Emp> empList = empService.getEmp();
        System.out.println(empList);
    }

}
