package com.feiniaojin.naaf.init.entity;

import java.math.BigDecimal;

/**
 * @author <a href="mailto:qinyujie@gingo.cn">Yujie</a>
 * @version 0.1
 */
public class DemoItem {

    private Long id;
    private String itemName;
    private BigDecimal itemLength;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public BigDecimal getItemLength() {
        return itemLength;
    }

    public void setItemLength(BigDecimal itemLength) {
        this.itemLength = itemLength;
    }
}
