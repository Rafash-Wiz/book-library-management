package com.Ash.book_library_management.repository;

import com.Ash.book_library_management.entity.BorrowingRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BorrowingRecordRepository extends JpaRepository<BorrowingRecord, Long> {
    List<BorrowingRecord> findByMemberIdAndReturnedFalse(Long memberId);
}
