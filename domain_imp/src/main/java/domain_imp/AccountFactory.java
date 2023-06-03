package domain_imp;

import domain.AbstractAccountFactory;
import domain.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountFactory implements AbstractAccountFactory {
//this is a test comment2
    @Override
    public Account createAccount(int id, int balance) {
        return new AccountImp(id, balance);
    }
}
