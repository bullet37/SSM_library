package com.tz.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: tz / bullet37
 * @Description: com.tz.pojo.Book
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private int ID;
    private String Name;
    private int Amount;
    private String Description;
}
