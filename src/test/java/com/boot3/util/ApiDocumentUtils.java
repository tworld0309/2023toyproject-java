package com.boot3.util;

import org.springframework.restdocs.operation.preprocess.OperationRequestPreprocessor;
import org.springframework.restdocs.operation.preprocess.OperationResponsePreprocessor;

import static org.springframework.restdocs.operation.preprocess.Preprocessors.*;

public interface ApiDocumentUtils {
    static OperationRequestPreprocessor getDocumentRequest() {
        return preprocessRequest(
                modifyUris() // 1 문서상에 표기되는 기본값 변경
                        .scheme("https")
                        .host("docs.api.com")
                        .removePort(),
                prettyPrint()); //2 request 를 예쁘게 출력
    }

    // 3 reponse 를 예쁘게 출력
    static OperationResponsePreprocessor getDocumentResponse() {
        return preprocessResponse(prettyPrint());
    }
}
