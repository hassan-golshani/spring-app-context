package com.codestack.demo.service;

import com.codestack.demo.model.UserAccount;
import com.codestack.demo.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class UserAccountService {

    private UserAccountRepository userAccountRepository;

    public void setUserAccountRepository(UserAccountRepository userAccountRepository) {
        this.userAccountRepository = userAccountRepository;
    }

    public UserAccount findUserAccountById(long id) {
        return userAccountRepository.findById(id);
    }
}