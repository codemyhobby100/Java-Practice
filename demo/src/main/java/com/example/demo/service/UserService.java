package com.example.demo.service;

import com.example.demo.dto.BankResponse;
import com.example.demo.dto.CreditDebitRequest;
import com.example.demo.dto.EnquiryRequest;
import com.example.demo.dto.UserRequest;

public interface UserService {

    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);

    BankResponse creditAccount(CreditDebitRequest request);

    BankResponse debitAccount(CreditDebitRequest request);
}
