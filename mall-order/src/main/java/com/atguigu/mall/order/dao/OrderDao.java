package com.atguigu.mall.order.dao;

import com.atguigu.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * ????
 * 
 * @author zhoutao
 * @email sunlightcs@gmail.com
 * @date 2020-05-11 20:45:40
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
