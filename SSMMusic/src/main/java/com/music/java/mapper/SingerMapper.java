package com.music.java.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.music.java.vo.Admin;

public interface SingerMapper {
		//插入数据
		@Insert("insert into music_singer ("
				+ "singer_name, "
				+ "singer_birthday,"
				+ "singer_zodiac,"
				+ "singer_constellation,"
				+ "singer_hobby,"
				+ "singer_brief_intro"
				+ ") value ("
				+ "#{singer_name}, "
				+ "#{singer_birthday}"
				+ "#{singer_zodiac}"
				+ "#{singer_constellation}"
				+ "#{singer_hobby}"
				+ "#{singer_brief_intro}"
				+ ")" )
		
		public int insertSinger(
				  @Param("singer_name") String singer_name,
	              @Param("singer_birthday") Date singer_birthday,
	              @Param("singer_zodiac") String singer_zodiac,
	              @Param("singer_constellation") String singer_constellation,
	              @Param("singer_hobby") String singer_hobby,
	              @Param("singer_brief_intro") String singer_brief_intro
				);
		
		//修改数据
		@Update("update music_singer set singer_name=#{singer_name},"
	            + "singer_birthday=#{singer_birthday},"
	            + "singer_zodiac={singer_zodiac},"
	            + "singer_constellation={singer_constellation},"
	            + "singer_hobby={singer_hobby},"
	            + "singer_brief_intro={singer_brief_intro}  where singer_id=#{singer_id}")
		
		public int updateSingerById(
				@Param("singer_name") String singer_name,
				@Param("singer_birthday") Date singer_birthday,
				@Param("singer_zodiac") String singer_zodiac,
				@Param("singer_constellation") String singer_constellation,
	            @Param("singer_hobby") String singer_hobby,
	            @Param("singer_brief_intro") String singer_brief_intro,
	            @Param("singer_id") int singer_id
	            );
		
		//按照条件查询数据
		@Select("select * from music_singer where singer_name=#{admin_num}")
		public List<Admin> getAdminByNum(@Param("admin_num") String admin_num);
		//查询所有数据
		@Select("select * from music_admin order by admin_num desc")
		public List<Admin> getAllAdmins();
}
