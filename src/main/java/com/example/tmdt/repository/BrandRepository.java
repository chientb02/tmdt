package com.example.tmdt.repository;

import com.example.tmdt.core.repository_base.BaseRepository;
import com.example.tmdt.model.address.Address;
import com.example.tmdt.model.fkProduct.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends BaseRepository<Brand>, JpaRepository<Brand, Long> {
}
