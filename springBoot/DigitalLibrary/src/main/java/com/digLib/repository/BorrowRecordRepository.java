package com.digLib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digLib.entities.BorrowRecord;

public interface BorrowRecordRepository extends JpaRepository<BorrowRecord,Integer>{

}
