package com.music.java.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.music.java.mapper.SongMapper;
import com.music.java.vo.Song;

@Service
public class SongService {

   	   @Autowired
	   private SongMapper songMapper;
	
	   //查找所有数据

		public List<Song> getAllSongs(){
			
			return songMapper.getAllSongs();
		}
		//查询单条数据
		
		public List<Song> getSongsByName( String song_name){
			
			return songMapper.getSongsByName(song_name);
		}
		
		//更新数据
	
		public int updateSongById(
				                   String song_name,
				                   String song_album_id,
				                   String song_time,
				                   String song_mp3_path,
				                   String song_poster_path,
				                   String song_Lyric_path,
				                   String song_id,
				                   String singer_id
				                 ){
			
			return songMapper.updateSongById(
					                       song_name, 
					                       song_album_id, 
					                       song_time, 
					                       song_mp3_path, 
					                       song_poster_path, 
					                       song_Lyric_path, 
					                       song_id, 
					                       singer_id);
		}
		//插入数据
		
		public int insertSong(
								  String song_name,
								  String song_album_id,
						          String song_time,					            
						          String song_mp3_path,
						          String song_poster_path,
						          String song_Lyric_path
						          ){
			
			return songMapper.insertSong(
					                    song_name, 
					                    song_album_id, 
					                    song_time,
					                    song_mp3_path, 
					                    song_poster_path, 
					                    song_Lyric_path);
		}
		//删除单条数据
	
		public int deleteById(int song_id){
			
			return songMapper.deleteById(song_id);
		}
}
