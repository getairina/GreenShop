package com.UG.repository;

import java.util.List;
import java.util.Optional;

public class ProductRepository implements CrudRepository{

    @Override
    public Optional findById(Object id) {
        return Optional.empty();
    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public Optional save(Object object) {
        return Optional.empty();
    }

    @Override
    public Object deleteById(Object id) {
        return null;
    }
}
