package com.atguigu.gmall.user.service.impl;



import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.atguigu.gmall.user.service.UmsMemberReceiveAddressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("umsMemberReceiveAddressServiceImpl")
public class UmsMemberReceiveAddressServiceImpl extends ServiceImpl<UmsMemberReceiveAddressMapper, UmsMemberReceiveAddress> implements UmsMemberReceiveAddressService {

    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressDao;


    @Override
    public void add(UmsMemberReceiveAddress umsMemberReceiveAddress) {

    }

    @Override
    public void update(UmsMemberReceiveAddress umsMemberReceiveAddress) {

    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public UmsMemberReceiveAddress findById(String id) {
        return null;
    }

    @Override
    public List<UmsMemberReceiveAddress> findAll() {
        return null;
    }
}
