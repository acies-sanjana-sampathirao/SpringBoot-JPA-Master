package com.example.PropertyManagement.repository;

import com.example.PropertyManagement.entity.PropertyEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface PropertyRepository extends CrudRepository<PropertyEntity, Long> {
}
