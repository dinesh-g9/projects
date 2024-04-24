package com.dinesh;

import com.dinesh.greet.Greeting;
import com.dinesh.http.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        System.out.println(client.get("https://example.com/"));
    }
}