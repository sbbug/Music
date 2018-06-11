package com.music.java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import com.music.java.vo.Song;

@Component
public interface SongMapper {

	//查找所有数据
	@Select("select * from music_song")
	public List<Song> getAllSongs();
	//查询单条数据
	@Select("select * from music_song where song_name=#{song_name}")
	public List<Song> getSongsByName(@Param("song_name") String song_name);
	
	//更新数据
	@Update("update music_song set song_name=#{song_name},"
			                    + "song_album_id=#{song_album_id},"
			                    + "song_time=#{song_time},"
			                    + "song_mp3_path=#{song_mp3_path},"
			                    + "song_poster_path=#{song_poster_path},"
			                    + "song_Lyric_path=#{song_Lyric_path}, "
			                    + "singer_id=#{singer_id}"
			                    + " where song_id=#{song_id}")
	public int updateSongById(
			                  @Param("song_name") String song_name,
			                  @Param("song_album_id") String song_album_id,
			                  @Param("song_time") String song_time,
			                  @Param("song_mp3_path") String song_mp3_path,
			                  @Param("song_poster_path") String song_poster_path,
			                  @Param("song_Lyric_path") String song_Lyric_path,
			                  @Param("song_id") String song_id,
			                  @Param("singer_id") String singer_id
			                 );
	//插入数据
	@Insert("insert into music_song ("
			                      + "song_name,"
                                  + "song_album_id,"
                                  + "song_time,"
                                  + "song_mp3_path,"
                                  + "song_poster_path,"
                                  + "song_Lyric_path,"
                                  + "singer_id) "
                                  + "value ("
                                  + "#{song_name},"
                                  + "#{song_album_id},"
                                  + "#{song_time},"
                                  + "#{song_mp3_path},"
                                  + "#{song_poster_path},"
                                  + "#{song_Lyric_path},"
                                  + "#{singer_id})")
	public int insertSong(
							  @Param("song_name") String song_name,
							  @Param("song_album_id") String song_album_id,
					          @Param("song_time") String song_time,					            
					          @Param("song_mp3_path") String song_mp3_path,
					          @Param("song_poster_path") String song_poster_path,
					          @Param("song_Lyric_path") String song_Lyric_path
					          );
	//删除单条数据
	@Delete("delete from music_song where song_id=#{song_id}")
	public int deleteById(@Param("song_id") int song_id);
	
	
	
}
