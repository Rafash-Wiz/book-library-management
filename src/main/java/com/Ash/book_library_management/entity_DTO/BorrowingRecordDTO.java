package com.Ash.book_library_management.entity_DTO;

import com.Ash.book_library_management.entity.Book;
import com.Ash.book_library_management.entity.Member;

import java.time.LocalDate;

public class BorrowingRecordDTO {

    private Long id;

    private Long memberId;

    private Long bookId;

    private LocalDate borrowDate;
    private int borrowPeriodWeeks;
    private LocalDate returnDate;

    private boolean returned;
    public BorrowingRecordDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public int getBorrowPeriodWeeks() {
        return borrowPeriodWeeks;
    }

    public void setBorrowPeriodWeeks(int borrowPeriodWeeks) {
        this.borrowPeriodWeeks = borrowPeriodWeeks;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }
}
