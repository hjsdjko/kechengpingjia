package com.dao;

import com.entity.KechengPingfenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengPingfenView;

/**
 * 课程评价 Dao 接口
 *
 * @author 
 */
public interface KechengPingfenDao extends BaseMapper<KechengPingfenEntity> {

   List<KechengPingfenView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
