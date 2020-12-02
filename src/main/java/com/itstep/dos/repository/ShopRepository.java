package com.itstep.dos.repository;

import com.itstep.dos.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Integer> {

    @Query("select s from Shop s where s.nameShop = :name")
    Shop findByName(@Param("name") String name);
}
