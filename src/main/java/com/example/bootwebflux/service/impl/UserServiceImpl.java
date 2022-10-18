package com.example.bootwebflux.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bootwebflux.domain.User;
import com.example.bootwebflux.service.UserService;
import com.example.bootwebflux.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author pcdn
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-10-18 16:57:21
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




