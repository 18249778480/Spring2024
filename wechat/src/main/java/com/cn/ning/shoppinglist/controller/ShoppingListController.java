package com.cn.ning.shoppinglist.controller;

import com.cn.ning.shoppinglist.po.FamilyShoppingListPO;
import com.cn.ning.shoppinglist.services.ShoppingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopppinglist")
public class ShoppingListController {
    @Autowired
    private ShoppingListService shoppingListService;
    @PostMapping("/add")
    public void addShoppingList(FamilyShoppingListPO po){
        shoppingListService.addShoopingList(po);
    }
}
