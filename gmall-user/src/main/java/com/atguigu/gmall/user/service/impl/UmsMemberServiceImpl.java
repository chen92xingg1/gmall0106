package com.atguigu.gmall.user.service.impl;


import com.atguigu.gmall.user.mapper.UmsMemberMapper;
import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.service.UmsMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("umsMemberServiceImpl")
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberMapper, UmsMember> implements UmsMemberService {

    @Autowired
    private UmsMemberMapper umsMemberDao;

    @Override
    public void add(UmsMember umsMember) {

    }

    @Override
    public void update(UmsMember umsMember) {

    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public UmsMember findById(String id) {
        return null;
    }

    @Override
    public List<UmsMember> findAll() {
        return null;
    }



}
