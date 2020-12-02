package com.itstep.dos.service;

import com.itstep.dos.model.Shop;
import com.itstep.dos.repository.ShopRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    private final ShopRepository shopRepository;

    public ShopServiceImpl(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    @Override
    public Shop addShop(Shop shop) {
        return shopRepository.saveAndFlush(shop);
    }

    @Override
    public void deleteById(Integer id) {
        this.shopRepository.deleteById(id);
    }

    @Override
    public Shop getByName(String name) {
        return shopRepository.findByName(name);
    }

    @Override
    public Shop editShop(Shop shop) {
        return shopRepository.saveAndFlush(shop);
    }

    @Override
    public List<Shop> getAll() {
        return shopRepository.findAll();
    }
}
