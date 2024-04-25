package com.dinesh;

import com.dinesh.rest.RestClient;

import java.io.IOException;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        RestClient client = new RestClient();
        System.out.println(Objects.requireNonNull(client.getApi().getPhotos().execute().body()).size());
    }
}