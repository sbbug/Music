package com.music.java.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.music.java.vo.Album;

public interface AlbumMapper {
	//插入数据
	@Insert("insert into music_album ("
			+ "album_name, "
			+ "album_singer_id, "
			+ "album_release_date, "
			+ "album_brief_intro, "
			+ "album_poster_path"
			+ ") value ("
            + "#{album_name}, "
			+ "#{album_singer_id},"
			+ "#{album_release_date},"
			+ "#{album_brief_intro}, "
			+ "#{album_poster_path}"
            + ")")
		
	public int insertAdmin(
			@Param("album_name") String album_name,
			@Param("album_singer_id") int album_singer_id,
			@Param("album_release_date") Date album_release_date,
			@Param("album_brief_intro") String album_brief_intro,
            @Param("album_poster_path") String album_poster_path
			);
	
	//修改数据
	//根据专辑id修改
	@Update("update music_album set album_name=#{album_name},"
	        + "album_singer_id=#{album_singer_id},"
	        + "album_release_date=#{album_release_date},"
	        + "album_brief_intro=#{album_brief_intro},"
	        + "album_poster_path=#{album_poster_path}  where album_id=#{album_id}")
		
	public int updateAlbumById(
			@Param("album_id") int album_id,
            @Param("album_name") String album_name,
            @Param("album_singer_id") int album_singer_id,
            @Param("album_release_date") Date album_release_date,
            @Param("album_brief_intro") String album_brief_intro,
            @Param("album_poster_path") String album_poster_path
            );
	
	//按照条件查询数据
	@Select("select * from music_album where album_name=#{album_name}")
	public List<Album> getAlbumByNum(@Param("album_name") String album_name);
	@Select("select * from music_album where singer_name=#{singer_name}")
	public List<Album> getAlbumBySingerName(@Param("singer_name") String singer_name);
	@Select("select * from music_album order by album_name asc")
	public List<Album> getAllAlbums();
}
