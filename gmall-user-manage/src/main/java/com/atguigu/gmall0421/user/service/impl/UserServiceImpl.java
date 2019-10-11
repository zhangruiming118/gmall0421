package com.atguigu.gmall0421.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall0421.bean.UserAddress;
import com.atguigu.gmall0421.bean.UserInfo;
import com.atguigu.gmall0421.service.UserService;
import com.atguigu.gmall0421.user.mapper.UserAddressMapper;
import com.atguigu.gmall0421.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserInfo> findByUserInfo(UserInfo userInfo) {
        return null;
    }

    @Override
    public List<UserInfo> findByLoginName(String loginName) {
        return null;
    }

    @Override
    public void addUser(UserInfo userInfo) {

    }

    @Override
    public void updUser(UserInfo userInfo) {

    }

    @Override
    public void delUser(UserInfo userInfo) {

    }

    @Override
    public List<UserAddress> findUserAddressByUserId(String userId) {
        //select * from userAddress where userId = ?
        //第一种方法
//        UserAddress userAddress = new UserAddress();
//        userAddress.setUserId(userId);
//        return userAddressMapper.select(userAddress);
        //第二种方法
        Example example = new Example(UserAddress.class);
        example.createCriteria().andEqualTo("userId",userId);
        return userAddressMapper.selectByExample(example);
    }
}
