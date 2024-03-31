package com.an.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * mysql 存储book
 *
 * @author cloudgyb
 * @since 2022/3/19 20:33
 */
@Data
@Entity
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String storeName;
    private String description;
    private String imgUrl;
    private Double price;
    private Long sales;


}