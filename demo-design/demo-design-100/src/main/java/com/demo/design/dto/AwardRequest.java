package com.demo.design.dto;

import lombok.Data;

/**
 * @author wjgful
 * @version v1.0
 * @description TODO
 * @date 2021/1/15 15:55
 */
@Data
public class AwardRequest {
    private String type;
    private Integer uid;
    private String awardNumber;
    private String bizId;
}
