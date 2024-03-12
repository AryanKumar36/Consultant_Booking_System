package com.example.consultantbookingsystem.dao;

import com.example.consultantbookingsystem.entity.Slot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SlotRepository extends JpaRepository<Slot, Long> {
}