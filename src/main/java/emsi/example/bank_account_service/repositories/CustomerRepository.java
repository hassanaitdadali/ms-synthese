package emsi.example.bank_account_service.repositories;

import emsi.example.bank_account_service.entities.BankAccount;
import emsi.example.bank_account_service.entities.Customer;
import emsi.example.bank_account_service.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;
import java.util.Locale;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
