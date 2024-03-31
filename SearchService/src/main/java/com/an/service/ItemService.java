package com.an.service;

import com.an.Repository.BookRepository;
import com.an.Repository.ESBookRepository;
import com.an.entity.BookEntity;
import com.an.entity.ESBook;
import com.an.entity.ESItem;
import com.an.entity.ItemEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;

@Service
public interface ItemService {

    public void addItem(ItemEntity item);

    public void deleteBook();

    public List<ESBook> search(String keyword);

    public SearchHits<ESBook> searchBookTitle(String keyword);

    public List<BookEntity> searchBookFromMysql(String key);

    public List<ESItem> searchItem(String keyword);
}