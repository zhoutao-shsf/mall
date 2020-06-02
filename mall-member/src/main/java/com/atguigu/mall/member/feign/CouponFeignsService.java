package com.atguigu.mall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mall-coupon")
public interface CouponFeignsService {

    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
