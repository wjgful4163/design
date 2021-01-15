package com.demo.design.controller;

import com.demo.design.dto.AwardRequest;
import com.demo.design.dto.AwardResponse;
import com.demo.design.dto.DeliverReq;
import com.demo.design.service.CouponService;
import com.demo.design.service.GoodsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wjgful
 * @version v1.0
 * @description 根据不同类型发放不同奖品
 * @date 2021/1/15 15:33
 */
public class PrizeController {
    @Autowired
    private CouponService couponService;
    @Autowired
    private GoodsService goodsService;

    /**
     * 用一坨代码实现 根据不同类型发放不同奖品
     *
     * @param awardReq
     * @return
     */
    public AwardResponse awardToUser(AwardRequest awardReq) {
        //根据不同类型进行兑换（1-优惠券，2-实体物品，3-第三方兑换卡-腾讯视频会员卡）
        if (StringUtils.equals(awardReq.getType(), "1")) {
            couponService.sendCoupon(awardReq.getUid(),awardReq.getAwardNumber(),awardReq.getBizId());
        } else if (StringUtils.equals(awardReq.getType(), "2")) {
            DeliverReq deliverReq=new DeliverReq();
            deliverReq.setUserId(awardReq.getUid());
            goodsService.deliverGoods(deliverReq);
        } else if (StringUtils.equals(awardReq.getType(), "3")) {

        } return null;
    }
}
