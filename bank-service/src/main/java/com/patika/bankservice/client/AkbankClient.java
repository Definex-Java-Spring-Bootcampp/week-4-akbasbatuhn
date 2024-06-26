package com.patika.bankservice.client;

import com.patika.bankservice.dto.client.ApplicationRequest;
import com.patika.bankservice.dto.client.ApplicationResponse;
import com.patika.bankservice.dto.response.GetLoanResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "akbank", url = "${akbank.url}")
public interface AkbankClient {

    @PostMapping("/api/akbank/v1/applications")
    ResponseEntity<List<ApplicationResponse>> createApplication(ApplicationRequest request);

    @GetMapping("/api/akbank/v1/loans")
    ResponseEntity<List<GetLoanResponse>> getLoans();
}
