package com.example.test2.model;


import com.example.test2.model.vo.AccountVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AccountDAO {

    @Select("select * from account")
    List<AccountVO> selectAll();

}
