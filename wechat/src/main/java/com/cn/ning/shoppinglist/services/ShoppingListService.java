package com.cn.ning.shoppinglist.services;

import com.cn.ning.common.entry.Result;
import com.cn.ning.shoppinglist.mapper.ShoppingListMapping;
import com.cn.ning.shoppinglist.po.FamilyShoppingListPO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ShoppingListService {

    @Resource
    private ShoppingListMapping shoppingListMapping;

    public Result addShoopingList(FamilyShoppingListPO po){
        shoppingListMapping.addShoppingList(po);
        return new Result();


    }
}
