package com.example.tmdt.repository;

import com.example.tmdt.core.repository_base.BaseRepository;
import com.example.tmdt.model.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepository extends BaseRepository<Discount>, JpaRepository<Discount, Long> {
}
