package com.demo.design.dto;

import lombok.Data;

/**
 * @author wjgful
 * @version v1.0
 * @description TODO
 * @date 2021/1/15 17:15
 */
@Data
public class DeliverReq {
    private Integer userId;
    private String userPhone;
    private String userName;
    private String sku;
    private Integer orderId;
    private String consigneeUserName;
    private String consigneeUserPhone;
    private String consigneeUserAddr;

}
