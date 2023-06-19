package com.hotel.serverapi.controller;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ActiveProfiles("local")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@AutoConfigureMockMvc
@SpringBootTest
class UserControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("사용자 전체 조회하기 (성공)")
    @Disabled
    void userListTest() throws Exception {
        // given

        // when & then
        mockMvc.perform(MockMvcRequestBuilders.get("/user/user")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$.code").exists())
//                .andExpect(jsonPath("$.message").exists())
//                .andExpect(jsonPath("$.data.meta.totalCount").exists())
//                .andExpect(jsonPath("$.data.meta.isEnd").exists())
//                .andExpect(jsonPath("$.data.documents[0].title").exists())
//                .andExpect(jsonPath("$.data.documents[0].contents").exists())
//                .andExpect(jsonPath("$.data.documents[0].url").exists())
//                .andExpect(jsonPath("$.data.documents[0].blogname").exists())
//                .andExpect(jsonPath("$.data.documents[0].thumbnail").exists())
//                .andExpect(jsonPath("$.data.documents[0].registrationDate").exists())
                .andDo(print());
    }

    @Test
    @DisplayName("사용자 전체 조회하기 (성공)")
    @Disabled
    void userInfoTest() throws Exception {
        // given
        String userId = "test_a";

        // when & then
        mockMvc.perform(MockMvcRequestBuilders.get("/user/{userId}}")
                        .param("userId", userId)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$.code").exists())
//                .andExpect(jsonPath("$.message").exists())
//                .andExpect(jsonPath("$.data.meta.totalCount").exists())
//                .andExpect(jsonPath("$.data.meta.isEnd").exists())
//                .andExpect(jsonPath("$.data.documents[0].title").exists())
//                .andExpect(jsonPath("$.data.documents[0].contents").exists())
//                .andExpect(jsonPath("$.data.documents[0].url").exists())
//                .andExpect(jsonPath("$.data.documents[0].blogname").exists())
//                .andExpect(jsonPath("$.data.documents[0].thumbnail").exists())
//                .andExpect(jsonPath("$.data.documents[0].registrationDate").exists())
                .andDo(print());
    }
}