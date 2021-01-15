package com.demo.design.service;

import com.demo.design.dto.CouponResult;

/**
 * @author wjgful
 * @version v1.0
 * @description 优惠券
 * @date 2021/1/15 16:32
 */
public interface CouponService {
    /**
     * 发送优惠券
     * @param uId 用户id
     * @param couponNumber
     * @param uuid
     * @return
     */
    CouponResult sendCoupon(Integer uId, String couponNumber, String uuid);
}
