package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Item;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {

    List<Item> findItemsByBookId(Integer bookId);
}
