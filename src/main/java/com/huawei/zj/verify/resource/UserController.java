package com.huawei.zj.verify.resource;

import org.springframework.web.bind.annotation.*;

/**
 * Created by intel on 2017/6/25.
 * 相关调用方法已经使用postman调通并保存
 */
@RestController
public class UserController
{
    @RequestMapping(value = "/users/{username}", method = RequestMethod.GET, consumes = "application/json")
    public String getUser(@PathVariable String username, @RequestParam String pwd)
    {
        return "Welcome," + username;
    }

    @RequestMapping(value = "/groups/{groupname}", method = RequestMethod.GET)
    public String getUser(@PathVariable String groupname)
    {
        return "Welcome," + groupname;
    }
}
