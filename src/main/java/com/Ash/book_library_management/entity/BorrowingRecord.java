package com.Ash.book_library_management.entity;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class BorrowingRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Book book;

    private LocalDate borrowDate;
    private int borrowPeriodWeeks;
    private LocalDate returnDate;

    private boolean returned;
    public BorrowingRecord() {}

    public BorrowingRecord(Member member, Book book, LocalDate borrowDate, LocalDate returnDate, int borrowPeriodWeeks, boolean returned) {
        this.member = member;
        this.book = book;
        this.borrowDate = borrowDate;
        this.borrowPeriodWeeks = borrowPeriodWeeks;
        this.returnDate = returnDate;
        this.returned = returned;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
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
