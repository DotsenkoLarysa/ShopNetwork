package com.itstep.dos.repository;

import com.itstep.dos.model.Seller;
import com.itstep.dos.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {

    @Query("select s from Seller s where s.firstname = :firstname and s.lastname = :lastname")
    Seller findByFullName(@Param("firstname") String firstname, @Param("lastname") String lastname);
}
