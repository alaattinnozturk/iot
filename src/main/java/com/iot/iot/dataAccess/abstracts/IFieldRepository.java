package com.iot.iot.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iot.iot.entities.Field;

public interface IFieldRepository extends JpaRepository<Field,Integer> {
    boolean existsByName (String name);
}
