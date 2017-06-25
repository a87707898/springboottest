package com.huawei.zj.verify.resource;

import org.springframework.web.bind.annotation.*;

/**
 * Created by intel on 2017/6/25.
 */
@RestController
public class UserController
{
    @RequestMapping(value = "/users/{username}", method = RequestMethod.GET, consumes = "application/json")
    public String getUser(@PathVariable String username, @RequestParam String pwd)
    {
        return "Welcome," + username;
    }
}
