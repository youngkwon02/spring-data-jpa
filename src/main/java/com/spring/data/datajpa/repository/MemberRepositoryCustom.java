package com.spring.data.datajpa.repository;

import com.spring.data.datajpa.entity.Member;

import java.util.List;

public interface MemberRepositoryCustom {
    List<Member> findMemberCustom();
}
