package com.multiple.common.api.controller;

import com.multiple.common.core.dto.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public ApiResponse index() {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setStatus("200");
        apiResponse.setDescription("테스트!");
        apiResponse.setResultObject("datas");

        return apiResponse;
    }

}
