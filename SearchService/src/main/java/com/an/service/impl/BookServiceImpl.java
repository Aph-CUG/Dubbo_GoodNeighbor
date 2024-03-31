package com.an.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;


public class BookServiceImpl {
    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

}
