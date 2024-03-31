package com.an.Repository;


import com.an.entity.BookEntity;
import com.an.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 关系型数据库mysql Repository
 *
 * @author cloudgyb
 * @since 2022/3/19 19:31
 */
@Repository("itemRepository")
public interface ItemRepository extends JpaRepository<ItemEntity, String> {
    //List<ItemEntity> findBookByAuthorOrTitle();
}