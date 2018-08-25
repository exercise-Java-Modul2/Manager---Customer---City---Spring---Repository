package com.codegym.service.province;

import com.codegym.model.Province;

public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province customer);

    void remove(Long id);
}
