package com.example.test2.service;

import com.example.test2.model.AccountDAO;
import com.example.test2.model.vo.AccountVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AccountService {

    @Autowired
    private AccountDAO dao;

    public List<AccountVO> getTable() {
        return dao.selectAll();
    }
}
