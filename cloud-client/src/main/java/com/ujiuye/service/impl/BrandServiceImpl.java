package com.ujiuye.service.impl;

import com.ujiuye.dao.TbBrandMapper;
import com.ujiuye.pojo.TbBrand;
import com.ujiuye.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private TbBrandMapper brandMapper;

    @Override
    public List<TbBrand> findAll() {

        return brandMapper.selectByExample(null);
    }




}
