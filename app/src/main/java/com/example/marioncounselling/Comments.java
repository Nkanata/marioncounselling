package com.example.marioncounselling;

public class Comments {
    String email;
    String comments;

    public Comments() {
    }

    public Comments(String email, String comments) {
        this.email = email;
        this.comments = comments;
    }

    public String getEmail() {
        return email;
    }

    public String getComments() {
        return comments;
    }
}
