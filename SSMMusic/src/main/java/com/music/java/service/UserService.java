package com.music.java.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.music.java.mapper.UserMapper;
import com.music.java.vo.User;


@Service
public class UserService {

	   @Autowired
	   private UserMapper userMapper;
	   
	 //插入数据
		
		public int insertUser(
				              String user_name,
				              String user_password ,
				              String user_sex,
				              String user_card,
				              String user_birtday ,
				              String user_address ,
				              String user_status 
				             ){
			
			return userMapper.insertUser(
					                    user_name, 
					                    user_password, 
					                    user_sex, 
					                    user_card, 
					                    user_birtday, 
					                    user_address, 
					                    user_status);
		}
		//查询所有数据
		
		public List<User> getAllUsers(){
			
			return userMapper.getAllUsers();
		}
		
	
		public int updateUserById(
	             String user_name,
	             String user_password ,
	             String user_sex,
	             String user_card,
	             String user_birtday ,
	             String user_address ,
	             String user_status 
	            ){
			
			return userMapper.updateUserById(
					                        user_name, 
					                        user_password, 
					                        user_sex, 
					                        user_card, 
					                        user_birtday, 
					                        user_address, 
					                        user_status);
		}
		
		
		public int deleteUserById( int user_id){
			
			return userMapper.deleteUserById(user_id);
		}
	
}
