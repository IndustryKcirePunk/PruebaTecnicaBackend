package org.inclusion.pruebatecnica.controllers;

import static org.junit.jupiter.api.Assertions.*;
import org.inclusion.pruebatecnica.services.MathServices;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@WebMvcTest(MathController.class)
public class MathControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MathServices service;

    @Test
    public void validateGetFzindMaximumNumber() throws Exception {
        int x = 7;
        int y = 5;
        int z = 12345;
        int expected = 12339;

        Mockito.when(service.findMaximumNumber(x, y, z)).thenReturn(expected);

        mockMvc.perform(
                get("/math/7/5/12345")
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andExpect(status().isOk())
                .andExpect(content().string(String.valueOf(expected)));
    }

    @Test
    public void validatePostFindMaximumNumber() throws Exception {
        int x = 5;
        int y = 0;
        int z = 4;
        int expected = 0;

        Mockito.when(service.findMaximumNumber(x, y, z)).thenReturn(expected);

        mockMvc.perform(
                        post("/math")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content("{\"x\": 5, \"y\": 0, \"z\": 4}")
                )
                .andExpect(status().isOk())
                .andExpect(content().string(String.valueOf(expected)));
    }

}
