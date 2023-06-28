package com.hotel.serverapi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.hotel.serverapi.data.dto.request.UserGradeReqSaveDto;
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

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    @DisplayName("사용자 전체 조회하기 (성공)")
    @Disabled
    void userListTest() throws Exception {
        // given

        // when & then
        mockMvc.perform(MockMvcRequestBuilders.get("/user/cust")
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
    @DisplayName("고객 상세 정보 조회자")
    @Disabled
    void userInfoTest() throws Exception {
        // given
        String userId = "test_a";

        // when & then
        mockMvc.perform(MockMvcRequestBuilders.get("/user/cust/{userId}}")
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


    @Test
    @DisplayName("특정 사용자 등급 조회하기")
    @Disabled
    void getUserGradeInfoTest() throws Exception {
        // given
        String userId = "test_a";

        // when & then
        mockMvc.perform(MockMvcRequestBuilders.get("/user/grade/{userId}}")
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

    @Test
    @DisplayName("특정 사용자 등급 변경하기")
    @Disabled
    void saveUserGradeInfoTest() throws Exception {
        // given
        String userId = "test_a";

        UserGradeReqSaveDto dto = UserGradeReqSaveDto
                .builder()
                .custId(userId)
                .custGradeCd("AA")
                .build();

        String s = objectMapper.registerModule(new JavaTimeModule()).writeValueAsString(dto);

        // when & then
        mockMvc.perform(MockMvcRequestBuilders.post("/user/grade")
                        .param("userId", userId)
                        .content(s)
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