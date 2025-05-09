package com.example.transferserviceapi.service;

import com.example.transferserviceapi.model.Transaction;
import com.example.transferserviceapi.model.Account;
import com.example.transferserviceapi.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class TransferService {

    public String transfer(Transaction transaction) {
        Account source = AccountRepository.accounts.get(transaction.getSourceAccount());
        Account dest = AccountRepository.accounts.get(transaction.getDestinationAccount());

        // Validate accounts
        if (source == null || dest == null) {
            return "One or both accounts not found.";
        }

        // Validate balance
        if (source.getBalance() < transaction.getAmount()) {
            return "Insufficient funds.";
        }

        // Transfer funds
        source.setBalance(source.getBalance() - transaction.getAmount());
        dest.setBalance(dest.getBalance() + transaction.getAmount());

        if (transaction.getAmount() <= 0) return "Amount must be positive.";
        if (transaction.getSourceAccount().equals(transaction.getDestinationAccount())) return "Source and destination accounts must differ.";


        return "Transfer successful.";



    }
}
