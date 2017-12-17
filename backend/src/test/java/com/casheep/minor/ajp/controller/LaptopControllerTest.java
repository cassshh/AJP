package com.casheep.minor.ajp.controller;

import com.casheep.minor.ajp.config.TestConfig;
import com.casheep.minor.ajp.config.WebConfig;
import com.casheep.minor.ajp.service.LaptopService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {TestConfig.class, WebConfig.class})
@WebAppConfiguration
public class LaptopControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private LaptopService laptopServiceMock;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @BeforeEach
    public void setup(){
        Mockito.reset(laptopServiceMock);
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void findAll_ReturnAllExistingLaptops() throws Exception {

        when(laptopServiceMock.getLaptops()).thenReturn(laptopServiceMock.getDemoLaptops());

        mockMvc.perform(get("api/v1/laptops"))
                .andExpect(status().isOk());
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE));
//                .andExpect(jsonPath("$..*", hasSize(9)))
//                .andExpect(jsonPath("$[0].message", is("First Todo")))
//                .andExpect(jsonPath("$[1].id", is(2)))
//                .andExpect(jsonPath("$[2].completed", is(true)));
    }

    @Test
    public void initDemoData() throws Exception {
        mockMvc.perform(get("api/v1/laptops/init"))
                .andExpect(status().isCreated());
    }

}
