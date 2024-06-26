package com.dinesh.dto;

import com.google.gson.annotations.SerializedName;

public class Photo{

	@SerializedName("albumId")
	private int albumId;

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;

	@SerializedName("url")
	private String url;

	@SerializedName("thumbnailUrl")
	private String thumbnailUrl;

	public int getAlbumId(){
		return albumId;
	}

	public int getId(){
		return id;
	}

	public String getTitle(){
		return title;
	}

	public String getUrl(){
		return url;
	}

	public String getThumbnailUrl(){
		return thumbnailUrl;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}
}