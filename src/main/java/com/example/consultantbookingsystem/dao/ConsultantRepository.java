package com.example.consultantbookingsystem.dao;

import com.example.consultantbookingsystem.entity.Consultant;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ConsultantRepository extends JpaRepository<Consultant, Long> {
}