package com.example.transferserviceapi.repository;

import com.example.transferserviceapi.model.Account;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class AccountRepository {
    public static final Map<String, Account> accounts = new ConcurrentHashMap<>();

    static {
        // Predefined accounts
        accounts.put("80801215", new Account("80811215", 1000.0));
        accounts.put("80811215", new Account("80801215", 1500.0));
    }
}
