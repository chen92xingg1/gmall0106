package com.atguigu.gmall.user.service;


import com.atguigu.gmall.user.bean.UmsMember;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;


public interface UmsMemberService extends IService<UmsMember> {

   

    /**
     * 保存
     */
    public void add(UmsMember umsMember);

    /**
     * 更新
     */
    public void update(UmsMember umsMember);

    /**
     * 删除
     */
    public void deleteById(String id);

    /**
     * 根据id查询
     */
    public UmsMember findById(String id);

    /**
     * 查询列表
     */
    public List<UmsMember> findAll();

}
