package com.xchong.boot.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author xchong
 * @create 2019-11-15 18:20
 * description:
 */
@Data
@ToString
public class RsInventoryStatus {
        private Integer inventory_status_id;
        private Integer inventory_id;
        private Byte status;
        private String user_name;
        private Date add_time;

}
