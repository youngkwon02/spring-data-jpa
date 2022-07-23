package com.spring.data.datajpa.repository;

import com.spring.data.datajpa.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    public List<Member> findByUsernameAndAgeGreaterThan(String username, int age);
}
