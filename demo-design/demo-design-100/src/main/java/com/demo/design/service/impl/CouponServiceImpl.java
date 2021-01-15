package com.demo.design.service.impl;

import com.demo.design.dto.CouponResult;
import com.demo.design.service.CouponService;
import org.springframework.stereotype.Service;

/**
 * @author wjgful
 * @version v1.0
 * @description TODO
 * @date 2021/1/15 16:35
 */
@Service
public class CouponServiceImpl implements CouponService {
    @Override
    public CouponResult sendCoupon(Integer uId, String couponNumber, String uuid) {
        return CouponResult.success();
    }
}
