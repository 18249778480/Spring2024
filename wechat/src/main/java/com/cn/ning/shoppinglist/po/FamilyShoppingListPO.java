package com.cn.ning.shoppinglist.po;

import lombok.Data;

import java.util.Date;

@Data
public class FamilyShoppingListPO {
    private int id;
    private String productName;//物品名称
    private String amountBudget;//预算金额
    private int ownerId;    //属于（谁想要\给谁）
    private int operatorId; //创建者（提出人）
    private Date createTime; //创建时间
    private Date updateTime; //更新时间
    private String flag;    //是否已购买
    private String amount;  //实际金额
    private int priorityLevel;  //优先级
    private int priorityLevel2; //第二优先级
    private String remarks; //备注
}
