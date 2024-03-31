package com.an.controller;

import com.an.entity.ESBook;
import com.an.entity.BookEntity;
import com.an.entity.ItemEntity;
import com.an.service.BookService;
import com.an.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BookController {

    @Autowired
    private final BookService bookService;

    @Autowired
    private ItemService itemService;

    public BookController(BookService bookService, ItemService itemService) {
        this.bookService = bookService;
        this.itemService = itemService;
    }

    /**
     * 添加book，这里我直接使用了Entity，为了演示有点不规范！
     */
    @PostMapping("/item")
    public Map<String, String> addBook(@RequestBody ItemEntity ESItem) {
        itemService.addItem(ESItem);
        Map<String, String> map = new HashMap<>();
        map.put("msg", "ok");
        return map;
    }

    /**
     * 从ES中搜索
     */
    @GetMapping("/book/search/es")
    public List<ESBook> searchES(String key) {
        return bookService.search(key);
    }

    @GetMapping("hello")
    public String Hello() {
        return new String("hello");
    }


    @GetMapping("/book/search")
    public SearchHits<ESBook> search(String key) {
        return bookService.searchBookTitle(key);
    }

    @GetMapping("/book/search/mysql")
    public List<BookEntity> test(String key) {
        return bookService.searchBookFromMysql(key);
    }
}