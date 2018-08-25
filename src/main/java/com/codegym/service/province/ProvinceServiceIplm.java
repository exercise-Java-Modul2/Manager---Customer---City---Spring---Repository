package com.codegym.service.province;

import com.codegym.model.Province;
import com.codegym.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProvinceServiceIplm implements ProvinceService {

    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Province findById(Long id) {
        return provinceRepository.findOne(id);
    }

    @Override
    public void save(Province customer) {
        provinceRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        provinceRepository.delete(id);
    }
}
