package com.db.blog;

public interface Follower {
    BlogEngine[] blog = null;

    public void reactToPost(Post post);
}
