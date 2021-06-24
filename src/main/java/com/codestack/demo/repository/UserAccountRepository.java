package com.codestack.demo.repository;

import com.codestack.demo.model.UserAccount;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public class UserAccountRepository {

    private List<UserAccount> userAccounts;

    public UserAccountRepository() {
        userAccounts = new ArrayList<UserAccount>();
        UserAccount userAccount = new UserAccount();
        userAccount.setId(1);
        userAccount.setFirstName("Hassan");
        userAccount.setLastName("Golshani");

        userAccounts.add(userAccount);
    }

    public UserAccount findById(long id) {
        for (UserAccount userAccount : userAccounts) {
            if (userAccount.getId() == id) {
                return userAccount;
            }
        }

        return null;
    }
}