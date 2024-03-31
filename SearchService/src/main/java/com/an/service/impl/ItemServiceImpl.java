package com.an.service.impl;

import com.an.Repository.BookRepository;
import com.an.Repository.ESBookRepository;
import com.an.Repository.ESItemRepository;
import com.an.Repository.ItemRepository;
import com.an.entity.BookEntity;
import com.an.entity.ESBook;
import com.an.entity.ESItem;
import com.an.entity.ItemEntity;
import com.an.service.ItemService;
import org.aspectj.lang.annotation.Around;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.elasticsearch.index.query.QueryBuilders.matchPhraseQuery;
import static org.elasticsearch.index.query.QueryBuilders.matchQuery;

@Service
public class ItemServiceImpl implements ItemService {

    private ItemRepository itemRepository;

    private ESItemRepository esItemRepository;
    private TransactionTemplate transactionTemplate;

    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;



    public ItemServiceImpl(ItemRepository itemRepository,
                       ESItemRepository esItemRepository,
                       TransactionTemplate transactionTemplate) {
        this.itemRepository = itemRepository;
        this.esItemRepository = esItemRepository;
        this.transactionTemplate = transactionTemplate;
    }


    @Override
    public List<ESItem> searchItem(String keyword) {

        NativeSearchQuery searchQuery = new NativeSearchQueryBuilder().
                withQuery(matchQuery("storeName", keyword)).
                withQuery(matchQuery("storeName.pinyin", keyword)).build();


        SearchHits<ESItem> search = elasticsearchRestTemplate.search(searchQuery, ESItem.class);
        Stream<SearchHit<ESItem>> searchHitStream = search.get();

        List<ESItem> list = searchHitStream.map(SearchHit::getContent).collect(Collectors.toList());

        System.out.println(list.size());
        list.forEach(entity -> {
            System.out.println((entity.toString()));
        });
        return list;
    }

    @Override
    public void addItem(ItemEntity item) {
//        final ItemEntity saveESItem = transactionTemplate.execute((status) ->
//                itemRepository.save(item)
//        );
        final ESItem esItem = new ESItem();
        //assert saveESItem != null;
        BeanUtils.copyProperties(item, esItem);
        esItem.setId(item.getId());
        try {
            esItemRepository.save(esItem);
        } catch (Exception e) {
            System.out.println("保存ES错误！%s" + e.getMessage());
        }
    }

    @Override
    public void deleteBook() {

    }

    @Override
    public List<ESBook> search(String keyword) {
        return null;
    }

    @Override
    public SearchHits<ESBook> searchBookTitle(String keyword) {
        return null;
    }

    @Override
    public List<BookEntity> searchBookFromMysql(String key) {
        return null;
    }


}
