package com.music.java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import com.music.java.vo.User;

@Component
public interface UserMapper {

	
	//插入数据
	@Insert("insert into music_user ("
			                       + "user_name,"
			                       + "user_password,"
			                       + "user_sex,"
			                       + "user_card,"
			                       + "user_birthday,"
			                       + "user_address,"
			                       + "user_status"
			                       + ") "
			                       + "value"
			                       + " ("
			                       + "#{user_name},"
			                       + "#{user_password},"
			                       + "#{user_sex},"
			                       + "#{user_card},"
			                       + "#{user_birthday},"
			                       + "#{user_address},"
			                       + "#{user_status})")
	public int insertUser(
			             @Param("user_name") String user_name,
			             @Param("user_password") String user_password ,
			             @Param("user_sex") String user_sex,
			             @Param("user_card") String user_card,
			             @Param("user_birthday") String user_birtday ,
			             @Param("user_address") String user_address ,
			             @Param("user_status") String user_status 
			             );
	//查询所有数据
	@Select("select * from music_user")
	public List<User> getAllUsers();
	
	//更新单条数据
	@Update("update music_user set "
			                  + "user_name=#{user_name},"
			                  + "user_password=#{user_password},"
			                  + "user_sex=#{user_sex},"
			                  + "user_card=#{user_card},"
			                  + "user_birthday=#{user_birthday},"
			                  + "user_address=#{user_address},"
			                  + "user_status=#{user_status} where user_id=#{user_id}")
	public int updateUserById(
            @Param("user_name") String user_name,
            @Param("user_password") String user_password ,
            @Param("user_sex") String user_sex,
            @Param("user_card") String user_card,
            @Param("user_birthday") String user_birtday ,
            @Param("user_address") String user_address ,
            @Param("user_status") String user_status 
            );
	
	//删除数据
	@Delete("delete from music_user where user_id=#{user_id}")
	public int deleteUserById(@Param("user_id") int user_id);
	
	
	
}
