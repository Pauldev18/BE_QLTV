package com.example.QuanLyThuVien.DTO;

import com.example.QuanLyThuVien.Entity.Category;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.QuanLyThuVien.Entity.Book}
 */
@Value
public class BookDto implements Serializable {
    Integer id;
    String title;
    String author;
    Integer publishYear;
    Integer quantity;
    Integer cateID;
}