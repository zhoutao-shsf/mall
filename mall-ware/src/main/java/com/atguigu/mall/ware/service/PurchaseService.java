package com.atguigu.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.mall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * ?ɹ???Ϣ
 *
 * @author zhoutao
 * @email sunlightcs@gmail.com
 * @date 2020-05-11 20:58:56
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

