package com.example.transferserviceapi.controller;

import com.example.transferserviceapi.model.Transaction;
import com.example.transferserviceapi.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TransferController {

    @Autowired
    private TransferService transferService;

    @PostMapping("/transfer")
    public String transfer(@RequestBody Transaction transaction) {
        return transferService.transfer(transaction);
    }
}
