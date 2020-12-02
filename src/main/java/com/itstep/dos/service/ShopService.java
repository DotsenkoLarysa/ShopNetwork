package com.itstep.dos.service;

import com.itstep.dos.model.Shop;

import java.util.List;

public interface ShopService {
    Shop addShop(Shop shop);
    void deleteById(Integer id);
    Shop getByName(String name);
    Shop editShop(Shop shop);
    List<Shop> getAll();
}
