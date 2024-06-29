package com.cn.ning.shoppinglist.mapper;

import com.cn.ning.shoppinglist.po.FamilyShoppingListPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShoppingListMapping {

    int addShoppingList(FamilyShoppingListPO po);

}
