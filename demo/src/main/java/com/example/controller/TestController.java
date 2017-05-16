package com.example.controller;

import com.example.Util.TeacherConstans;
import com.example.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zf-42 on 2017/4/8.
 */
@Controller
public class TestController {
    @Autowired
    TeacherConstans tc;

    @Autowired
    JdbcTemplate jt;
    /*@RequestMapping(value = "/{name}",method = RequestMethod.GET)
    public @ResponseBody String test(@PathVariable("name") String name) {

        return "Hello " + name;
    }*/

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public @ResponseBody String test1() {

        return tc.getName() + "-" + tc.getAge();
    }

    @RequestMapping(value = "/getCars")
    public @ResponseBody String getBean(){

        List cars = jt.queryForList("select * from Car");
        return cars.toString();
    }

}
