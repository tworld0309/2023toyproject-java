package com.boot3.controller;

import com.boot3.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureRestDocs(uriScheme = "http", uriHost = "localhost:8888/apidocs")
class UserControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private UserService userService;

//    @BeforeEach
//    public void setUpData(){
//        userService.saveTestUser();
//    }
//
//    @Test
//    @DisplayName("User List Test")
//    public void getUserListTest() throws Exception {
//
//        // given
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("region_language", "KO_KR");
//
//        // when
//        ResultActions resultActions = mockMvc.perform(RestDocumentationRequestBuilders.get("/user/user")
//                .headers(headers)
//                .accept(MediaType.APPLICATION_JSON)
//                ).andExpect(status().isOk());
//
//        // then
//        resultActions
//                .andDo(
//                        document("{class-name}/{method-name}",
//                                responseFields(
//                                        fieldWithPath("[].userId").type(JsonFieldType.STRING).description("사용자 아이디")
//                                        , fieldWithPath("[].name").type(JsonFieldType.STRING).description("아이디")
//                                        , fieldWithPath("[].email").type(JsonFieldType.STRING).description("이메일")
//                                        , fieldWithPath("[].pwd").type(JsonFieldType.STRING).description("비밀번호")
//                                        , fieldWithPath("[].createdDate").type(JsonFieldType.VARIES).description("비밀번호")
//                                )
//                        )
//                );
//    }
//
//    @Test
//    @DisplayName("User Info Test")
//    public void getUserInfoTest() throws Exception {
//        //given
//        String userId = "temp_1";
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("region_language", "KO_KR");
//
//        // when
//        ResultActions resultActions = mockMvc.perform(RestDocumentationRequestBuilders.get("/user/user/{userId}", userId)
//                        .headers(headers)
//                        .accept(MediaType.APPLICATION_JSON))
//                ;
//
//        // restDocs
//        resultActions.andDo(document("{class-name}/{method-name}",
//                        pathParameters(
//                                parameterWithName("userId").description("사용자 ID")
//                        ),
//                        responseFields(
//                                fieldWithPath("userId").type(JsonFieldType.STRING).description("사용자 아이디")
//                                , fieldWithPath("name").type(JsonFieldType.STRING).description("아이디")
//                                , fieldWithPath("email").type(JsonFieldType.STRING).description("이메일")
//                                , fieldWithPath("pwd").type(JsonFieldType.STRING).description("비밀번호")
//                                , fieldWithPath("createdDate").type(JsonFieldType.VARIES).description("생성일자")
//                        )
//                )
//        );
//
//    }
//
//
//    @Test
//    @DisplayName("User Save - 중복 여부 테스트")
//    @Disabled
//    public void saveUserTest_Duplicate() throws Exception {
//        //given
//        String userId = "thj0309";
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("region_language", "KO_KR");
//
//        UserSaveReqDTO userSaveReqDTO = new UserSaveReqDTO();
//        userSaveReqDTO.setUserId("thj0309");
//        userSaveReqDTO.setName("thj0309");
//        userSaveReqDTO.setPwd("thj0309");
//        userSaveReqDTO.setEmail("thj0309@hotmail.com");
//
//        // when
//        ResultActions resultActions = mockMvc.perform(RestDocumentationRequestBuilders.post("/user/user")
//                        .headers(headers)
//                        .contentType(MediaType.APPLICATION_JSON_UTF8)
//                        .content(objectMapper.writeValueAsString(userSaveReqDTO))
//                        .accept(MediaType.APPLICATION_JSON))
//                ;
//
//        // restDocs
//        resultActions
//                //.andExpect(jsonPath("$.userId").value("thj0309"))
//                .andDo(MockMvcResultHandlers.print());
//
//    }

}