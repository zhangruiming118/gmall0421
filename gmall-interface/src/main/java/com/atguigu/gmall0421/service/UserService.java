package com.atguigu.gmall0421.service;





import com.atguigu.gmall0421.bean.UserAddress;
import com.atguigu.gmall0421.bean.UserInfo;

import java.util.List;

public interface UserService {

    // 查询所有数据
    List<UserInfo> findAll();
    // 如何判断返回 loginName ,nickName,id
    List<UserInfo> findByUserInfo(UserInfo userInfo);
    // loginName 做模糊查询
    List<UserInfo> findByLoginName(String loginName);
    // 添加用户信息
    void addUser(UserInfo userInfo);
    // 修改用户数据
    void updUser(UserInfo userInfo);
    // 删除数据
    void delUser(UserInfo userInfo);

    // select * from userAddress where userId = ?

    /**
     *  根据userId 查询用户地址列表
     * @param userId
     * @return
     */
    List<UserAddress> findUserAddressByUserId(String userId);




}
