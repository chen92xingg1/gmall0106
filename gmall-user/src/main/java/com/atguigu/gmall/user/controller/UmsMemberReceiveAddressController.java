package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//解决跨域问题
@CrossOrigin
@RestController
@RequestMapping(value="/umsMemberReceiveAddress")
public class UmsMemberReceiveAddressController {

    @Autowired
    private UmsMemberReceiveAddressService umsMemberReceiveAddressService;

    //保存或更新
   // @RequestMapping(value="",method = RequestMethod.POST)
//    public Result saveOrUpdate(@RequestBody UmsMemberReceiveAddress umsMemberReceiveAddress) {
//        umsMemberReceiveAddressService.saveOrUpdateDetail(adminRole);
//        return new Result(ResultCode.SUCCESS);
//    }

    //根据id删除
    //@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
//    public Result delete(@PathVariable(value="id") String id) {
//        umsMemberReceiveAddressService.removeById(id);
//        return new Result(ResultCode.SUCCESS);
//    }

    //根据id查询
//    @RequestMapping(value="/{id}",method = RequestMethod.GET)
//    public Result findById(@PathVariable(value="id") String id) throws CommonException {
//        UmsMemberReceiveAddress umsMemberReceiveAddress = umsMemberReceiveAddressService.getDetailById(id);
//        return new Result(ResultCode.SUCCESS,umsMemberReceiveAddress);
//    }

    //查询全部
    @RequestMapping(value="",method = RequestMethod.GET)
    public List<UmsMemberReceiveAddress> findAll() {
        List<UmsMemberReceiveAddress> list = umsMemberReceiveAddressService.list();
        return list;
    }
}
