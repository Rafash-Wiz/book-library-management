package com.Ash.book_library_management.services;

import com.Ash.book_library_management.entity.BorrowingRecord;
import com.Ash.book_library_management.entity_DTO.BorrowingRecordDTO;

import java.util.List;

public interface BorrowingRecordService {

    BorrowingRecordDTO borrowBook(BorrowingRecordDTO borrowingRecordDTO);

    BorrowingRecordDTO returnBook(Long borrowingRecordId);

    List<BorrowingRecordDTO> getAllBorrowingRecords();
}
