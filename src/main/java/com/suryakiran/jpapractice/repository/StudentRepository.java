package com.suryakiran.jpapractice.repository;

import com.suryakiran.jpapractice.entity.StudentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentsEntity,Integer> {
}
