package com.music.java.vo;

public class Song {

	private int song_id;
	private String song_name;
	private int song_album_id;
	private String song_time;
	private String song_mp3_path;
	private String song_poster_path;
	private String song_Lyric_path;
	private int singer_id;
	
	public int getSinger_id() {
		return singer_id;
	}
	public void setSinger_id(int singer_id) {
		this.singer_id = singer_id;
	}
	public int getSong_id() {
		return song_id;
	}
	public void setSong_id(int song_id) {
		this.song_id = song_id;
	}
	public String getSong_name() {
		return song_name;
	}
	public void setSong_name(String song_name) {
		this.song_name = song_name;
	}
	public int getSong_album_id() {
		return song_album_id;
	}
	public void setSong_album_id(int song_album_id) {
		this.song_album_id = song_album_id;
	}
	public String getSong_time() {
		return song_time;
	}
	public void setSong_time(String song_time) {
		this.song_time = song_time;
	}
	public String getSong_mp3_path() {
		return song_mp3_path;
	}
	public void setSong_mp3_path(String song_mp3_path) {
		this.song_mp3_path = song_mp3_path;
	}
	public String getSong_poster_path() {
		return song_poster_path;
	}
	public void setSong_poster_path(String song_poster_path) {
		this.song_poster_path = song_poster_path;
	}
	public String getSong_Lyric_path() {
		return song_Lyric_path;
	}
	public void setSong_Lyric_path(String song_Lyric_path) {
		this.song_Lyric_path = song_Lyric_path;
	}
	
	
	
}
