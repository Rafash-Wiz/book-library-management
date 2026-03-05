package com.Ash.book_library_management.entity_DTO;

import com.Ash.book_library_management.entity.Author;

public class BookDTO {

    private long id;
    private  String title;
    private Long authorId;
    private String genre;
    private int year;
    private int quantity;

    public BookDTO() {
    }

    public BookDTO(String title, Long authorId, String genre, int year, int quantity) {
        this.title = title;
        this.authorId = authorId;
        this.genre = genre;
        this.year = year;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
