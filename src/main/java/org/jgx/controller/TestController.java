package org.jgx.controller;

import org.jgx.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by JiangGuagnxing on 2016/12/17.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/index")
    @ResponseBody
    public Map toIndex() {
        Map<String, TestJson> maps = new HashMap<String, TestJson>();
        TestJson s1 = new TestJson();
        s1.setName("test");
        s1.setAge("12");
        maps.put("s1", s1);
        maps.put("s2", s1);
        return maps;
    }

    @RequestMapping(value = "test")
    @ResponseBody
    public void saveUser(@RequestBody List<TestJson> testJsons) {
        System.out.println(testJsons.get(0).getName());
//        for (TestJson t : testJsons) {
//            System.out.println(t.getName());
//        }
    }

    @Resource
    private UserService userService;

    //    @RequestMapping(value = "{name}", method = RequestMethod.GET)
//    public
//    @ResponseBody
//    TestJson getShopInJSON(@PathVariable String name) {
//        TestJson shop = new TestJson();
//        shop.setName(name);
//        return shop;
//    }
    @RequestMapping(value = "/info", method = RequestMethod.PUT)
    public ModelAndView updateProduct(@RequestBody TestJson testJson, HttpServletRequest request, HttpServletResponse response) throws Exception {

        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("pid", "tttt");

        ModelAndView mav = new ModelAndView("/index", map1);

        return mav;

    }
}
