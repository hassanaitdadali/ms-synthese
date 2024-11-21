package emsi.example.bank_account_service.mappers;

import emsi.example.bank_account_service.dto.BankAccountResponseDTO;
import emsi.example.bank_account_service.entities.BankAccount;
import org.springframework.beans.BeanUtils;

public class AccountMapper {
    public BankAccountResponseDTO fromBankAccount(BankAccount bankAccount) {
        BankAccountResponseDTO bankAccountResponseDTO = new BankAccountResponseDTO();
        BeanUtils.copyProperties(bankAccount, bankAccountResponseDTO);
        return bankAccountResponseDTO;
    }
}
