package top.aiprogram.service;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/9/26.
 */
@Service(value = "userService")
public interface UserService {
    String say(String value);
}
