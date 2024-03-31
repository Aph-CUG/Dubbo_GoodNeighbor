package com.an.Repository;

import com.an.entity.ESBook;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.annotations.Highlight;
import org.springframework.data.elasticsearch.annotations.HighlightField;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("esBookRepository")
public interface ESBookRepository extends ElasticsearchRepository<ESBook, String> {

    List<ESBook> findByTitleOrAuthor(String title, String author);

    @Highlight(fields = {
            @HighlightField(name = "title"),
            @HighlightField(name = "author")
    })
    @Query("{\"match\":{\"title\":\"?0\"}}")
    SearchHits<ESBook> find(String keyword);
}