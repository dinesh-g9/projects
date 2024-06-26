package com.dinesh.rest;

import com.dinesh.dto.Photo;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface JSONPlaceholderAPI {
    @GET("/photos")
    Call<List<Photo>> getPhotos();
}
