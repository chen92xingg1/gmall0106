package com.atguigu.gmall.user.service;



import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


public interface UmsMemberReceiveAddressService extends IService<UmsMemberReceiveAddress> {

   

    /**
     * 保存
     */
    public void add(UmsMemberReceiveAddress umsMemberReceiveAddress);

    /**
     * 更新
     */
    public void update(UmsMemberReceiveAddress umsMemberReceiveAddress);

    /**
     * 删除
     */
    public void deleteById(String id);

    /**
     * 根据id查询
     */
    public UmsMemberReceiveAddress findById(String id);

    /**
     * 查询列表
     */
    public List<UmsMemberReceiveAddress> findAll();
}
