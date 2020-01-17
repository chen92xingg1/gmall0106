package com.atguigu.gmall.user.controller;
import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.service.UmsMemberService;
import com.atguigu.gmall.user.bean.UmsMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//解决跨域问题
@CrossOrigin
@RestController
@RequestMapping(value="/umsMember")
public class UmsMemberController {

    @Autowired
    private UmsMemberService umsMemberService;

    //保存或更新
//    @RequestMapping(value="",method = RequestMethod.POST)
//    public Result saveOrUpdate(@RequestBody UmsMember umsMember) {
//        umsMemberService.saveOrUpdateDetail(adminRole);
//        return new Result(ResultCode.SUCCESS);
//    }

    //根据id删除
    //@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
//    public Result delete(@PathVariable(value="id") String id) {
//        umsMemberService.removeById(id);
//        return new Result(ResultCode.SUCCESS);
//    }

    //根据id查询
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public UmsMember findById(@PathVariable(value="id") String id)  {
        UmsMember umsMember = umsMemberService.getById(id);
        return umsMember;
    }

    //查询全部
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    @ResponseBody
    public List findAll() {
        List<UmsMember> list = umsMemberService.list();
        //Result result = new Result(ResultCode.SUCCESS);
        //result.setData(list);
        return list;
    }
}
