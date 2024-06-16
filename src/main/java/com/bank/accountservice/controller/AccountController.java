package com.bank.accountservice.controller;

import com.bank.accountservice.dto.AccountDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AccountController {

    @GetMapping("/")
    public ResponseEntity<AccountDto> getAccountById
            (@RequestParam(required = false, defaultValue = "000", name = "acctNum") String acctNumber) {
        log.info("Received get account info for acctNo:{}", acctNumber);
        AccountDto account = new AccountDto(acctNumber, "SAVINGS", 890000L);
        return ResponseEntity.ok(account);
    }

    @GetMapping("/msg")
    public String getMsg() {
        return "Hello";
    }
}
