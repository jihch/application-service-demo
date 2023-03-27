package io.github.jihch.controller;

import io.github.jihch.pojo.People;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class DemoController {

    @RequestMapping("/demo")
    public String demo() {
        return "demo";
    }


    @RequestMapping("/demo2")
    public String demo2(String name, Integer age) {
        return "name:" + name + ",age:" + age;
    }

    @RequestMapping("/demo3/{name}/{age}")
    public String demo3(@PathVariable String name, @PathVariable Integer age) {
        return "name:" + name + ",age:" + age;
    }

    @RequestMapping("/demo4")
    public String demo4(String name, Integer age, @RequestBody Map<String, Object> map) {
        System.out.println(map);
        return "name:" + name + ",age:" + age;
    }

    @RequestMapping("/demo5")
    public People demo5() {
        return new People(1, "jihch");
    }

    @RequestMapping("/demo6")
    public List<People> demo6() {
        List<People> list = new ArrayList<>();
        list.add(new People(1, "jihch1"));
        list.add(new People(2, "jihch2"));
        return list;
    }
}
