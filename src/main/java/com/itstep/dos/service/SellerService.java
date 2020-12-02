package com.itstep.dos.service;

import com.itstep.dos.model.Seller;

import java.util.List;

public interface SellerService {
    Seller addSeller(Seller seller);
    void deleteById(Long id);
    Seller findByFullName(String firstname, String lastname);
    Seller editSeller(Seller seller);
    List<Seller> getAll();
}
