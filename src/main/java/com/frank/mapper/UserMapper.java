package com.frank.mapper;
/**
 * @author:ZHIANGRONGCHUAN
 * @time：2019/7/28 15:09
 * @description:
 */

import com.frank.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Insert("insert into user (name,account_id,token,gmt_create,gmt_modified) values " +
            "(#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    Integer insert(User user);//类可以直接放

    @Select("select * from user where token = #{token}")
    User findUserByToken(@Param("token") String token);//String需要加注解
}
