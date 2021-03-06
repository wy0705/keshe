package com.example.demo.controller;



import com.example.demo.entity.Clazz;
import com.example.demo.service.ClazzServiceImpl;
import com.example.demo.service.UserClazzServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClazzController {

    @Autowired
    private UserClazzServiceImpl userClazzService;

    @Autowired
    private ClazzServiceImpl clazzService;


    @RequestMapping(value = "add_clazz", method = RequestMethod.POST)
    @ResponseBody
    public String registry(@RequestBody Clazz clazz) {
        int result = clazzService.insertClazz(clazz);
        if (result != 0) {
            return "sucess insert" + clazz.getClazzName();
        }
        return "添加班级失败";
    }
}
