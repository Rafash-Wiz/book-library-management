package com.Ash.book_library_management.entity_Mappers;


import com.Ash.book_library_management.entity.BorrowingRecord;
import com.Ash.book_library_management.entity_DTO.BorrowingRecordDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {MemberMapper.class, BookMapper.class})
public interface BorrowingRecordMapper {

    @Mapping(source = "member.id", target = "memberId")
    @Mapping(source = "book.id", target = "bookId")
    BorrowingRecordDTO toDto(BorrowingRecord borrowingRecord);

    @Mapping(source ="memberId", target="member.id")
    @Mapping(source ="bookId", target="book.id")
    BorrowingRecord toEntity(BorrowingRecordDTO borrowingRecordDTO);
}
