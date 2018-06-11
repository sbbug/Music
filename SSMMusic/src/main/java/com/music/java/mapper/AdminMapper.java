package com.music.java.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.music.java.vo.Admin;

public interface AdminMapper {
	//��������
	@Insert("insert into music_admin ("
			+ "admin_num, "
			+ "admin_password"
			+ ") value ("
			+ "#{admin_num}, "
			+ "#{admin_password}"
			+ ")" )
	
	public int insertAdmin(
			  @Param("admin_num") String admin_num,
              @Param("admin_password") String admin_password
			);
	
	//�޸�����
	@Update("update music_admin set admin_num=#{admin_num},"
            + "admin_password=#{admin_password}  where admin_num=#{admin_num}")
	
	public int updateBookByNumAndId(
			@Param("admin_num") String admin_num,
            @Param("admin_num") String teacher_num,
            @Param("admin_password") String admin_password
            );
	
	//����������ѯ����
	@Select("select * from music_admin where admin_num=#{admin_num}")
	public List<Admin> getAdminByNum(@Param("admin_num") String admin_num);
	//��ѯ��������
	@Select("select * from music_admin order by admin_num desc")
	public List<Admin> getAllAdmins();
}
