package com.an.Repository;

import com.an.entity.ESBook;
import com.an.entity.ESItem;
import org.springframework.data.elasticsearch.annotations.Highlight;
import org.springframework.data.elasticsearch.annotations.HighlightField;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("esItemRepository")
public interface ESItemRepository extends ElasticsearchRepository<ESItem, String> {

//    List<ESItem> findByStoreName();
//
//    @Highlight(fields = {
//            @HighlightField(name = "StoreName"),
//            //@HighlightField(name = "author")
//    })
//    @Query("{\"match\":{\"storeName\":\"?0\"}}")
//    SearchHits<ESItem> find(String storeName);
}