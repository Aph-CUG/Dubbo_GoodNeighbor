package com.an.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Goods implements Serializable {

    private Integer id;

    private String name;

    private Double price;

    private Integer nums; // 库存

    private String description;
}

