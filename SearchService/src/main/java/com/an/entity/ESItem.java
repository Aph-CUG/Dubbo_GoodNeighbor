package com.an.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

/**
 * @author geng
 * 2020/12/18
 */
@Data
@Document(indexName = "goods", createIndex = false)
public class ESItem {
    @Id
    @Field(type = FieldType.Keyword)
    private Integer id;


    @Field(type = FieldType.Text, index = true)
    private String description;


    @Field(type = FieldType.Text, index = false)
    private String imgUrl;
    @Field(type = FieldType.Double, index = false)
    private Double price;

    @Field(type = FieldType.Long, index = false)
    private Long sales;

    @Field(type = FieldType.Text, index = true)
    private String storeName;

}