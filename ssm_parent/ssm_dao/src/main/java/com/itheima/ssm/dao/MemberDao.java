package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Member;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MemberDao {

    @Select("select * from member where id = #{memberId}")
    public Member findByMemberId(String memberId);
}
