package com.example.QuanLyThuVien.DTO;

import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.example.QuanLyThuVien.Entity.Borrowrequest}
 */
@Value
public class BorrowrequestDto implements Serializable {
    Integer id;
    Integer bookID;
    LocalDate borrowDate;
    LocalDate returnDate;
    String status;
}