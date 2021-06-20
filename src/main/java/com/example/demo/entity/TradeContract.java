package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

/**
 * <pre>
 * @Description:
 *
 * </pre>
 *
 * @version v1.0
 * @ClassName: TradeContract
 * @Author: sanwu
 * @Date: 2021/6/19 23:54
 */
@Data
@TypeAlias("TradeContract")
@Document(
        indexName = "sw_test.trade_contract",
        type = "_doc",
        createIndex = false
)
public class TradeContract {


    @Id
    private String id;

    private Double amount;

    private String contractId;

    private Date createdTime;
    private Date modifiedTime;

    private String customId;

    private boolean deleted;

    private String expCurrency;

    private String exportCountryCode;

    private String extra;

    private String invoice_no;

    private String note;
    private String productName;
    private Long productQuantity;

    private String productQuantityUnit;

    private String status;

    private String testAdd;


}
