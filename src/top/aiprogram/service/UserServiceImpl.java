package top.aiprogram.service;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/9/26.
 */
@Service("myUserService")
public class UserServiceImpl implements UserService{
    @Override
    public String say(String value) {
        System.out.println(value);
        return "succeed";
    }
}
