package com.xchong.boot.mapper;

import com.xchong.boot.entity.RsInventoryStatus;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author xchong
 * @create 2019-11-15 18:25
 * description: mapper
 */
@Mapper
public interface RsInventoryStatusMapper {
    List<RsInventoryStatus> findAll();
}
