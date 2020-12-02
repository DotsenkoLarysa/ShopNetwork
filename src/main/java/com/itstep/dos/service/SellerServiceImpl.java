package com.itstep.dos.service;

import com.itstep.dos.model.Seller;
import com.itstep.dos.repository.SellerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerServiceImpl implements SellerService {

    private final SellerRepository sellerRepository;

    public SellerServiceImpl(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

    @Override
    public Seller addSeller(Seller seller) {
        return sellerRepository.saveAndFlush(seller);
    }

    @Override
    public void deleteById(Long id) {
        this.sellerRepository.deleteById(id);
    }

    @Override
    public Seller findByFullName(String firstname, String lastname) {
        return sellerRepository.findByFullName(firstname, lastname);
    }

    @Override
    public Seller editSeller(Seller seller) {
        return sellerRepository.saveAndFlush(seller);
    }

    @Override
    public List<Seller> getAll() {
        return sellerRepository.findAll();
    }
}
