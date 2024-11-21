package emsi.example.bank_account_service.service;

import emsi.example.bank_account_service.dto.BankAccountRequestDTO;
import emsi.example.bank_account_service.dto.BankAccountResponseDTO;
import emsi.example.bank_account_service.entities.BankAccount;

public interface AccountService {
    BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);

    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
