package com.demo.design.dto;

import lombok.Data;

/**
 * @author wjgful
 * @version v1.0
 * @description TODO
 * @date 2021/1/15 16:33
 */
@Data
public class CouponResult {

    private Integer code;
    private String message;

    public CouponResult(Integer code, String message) {
        this.code = code;
        this.message = message;

    }

    public static CouponResult success() {
        return new CouponResult(1, "成功");
    }

    public static CouponResult failure(String message) {
        return new CouponResult(0, message);
    }
}
