package com.db.blog;

import java.util.ArrayList;
import java.util.List;

public class SimpleBlogEngine implements BlogEngine {
    List<Follower> followers;

    SimpleBlogEngine(){
        followers = new ArrayList<Follower>();
    }


    @Override
    public void publishPost(Post post){
        for (Follower follower : followers){
            follower.reactToPost(post);
        }
    }

    @Override
    public void addFollower(Follower follower) {
        followers.add(follower);
    }
}
