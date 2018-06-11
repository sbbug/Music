package com.music.java.vo;

import java.util.Date;

public class Album {

	private int album_id;
	private String album_name;
	private int album_singer_id;
	private Date album_brief_intro;
	private String album_poster_path;
	private Date album_release_date;
	
	public Date getAlbum_release_date() {
		return album_release_date;
	}
	public void setAlbum_release_date(Date album_release_date) {
		this.album_release_date = album_release_date;
	}
	public int getAlbum_id() {
		return album_id;
	}
	public void setAlbum_id(int album_id) {
		this.album_id = album_id;
	}
	public String getAlbum_name() {
		return album_name;
	}
	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}
	public int getAlbum_singer_id() {
		return album_singer_id;
	}
	public void setAlbum_singer_id(int album_singer_id) {
		this.album_singer_id = album_singer_id;
	}
	public Date getAlbum_brief_intro() {
		return album_brief_intro;
	}
	public void setAlbum_brief_intro(Date album_brief_intro) {
		this.album_brief_intro = album_brief_intro;
	}
	public String getAlbum_poster_path() {
		return album_poster_path;
	}
	public void setAlbum_poster_path(String album_poster_path) {
		this.album_poster_path = album_poster_path;
	}
	
}
