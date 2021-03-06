package com.cloud.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@RunWith(SpringRunner.class)
@SpringBootTest
//url测试
@AutoConfigureMockMvc
public class TbAdminControllerTest {
    @Autowired
    MockMvc mc;

    @Test
    public void handle() {
    }

    @Test
    public void selectOne() throws Exception {
//        测试
        mc.perform(MockMvcRequestBuilders.get("/tbAdmin/selectOne")).andExpect(
                MockMvcResultMatchers.status().isOk()
        );
    }

    @Test
    public void insertTbAdmin() {
    }

    @Test
    public void string() throws Exception {
        //        测试
        mc.perform(MockMvcRequestBuilders.get("/tbAdmin/string")).andExpect(
                MockMvcResultMatchers.status().isOk()
        );
    }
}