package com.db.blog;

import java.util.List;

public interface BlogEngine {

    public void publishPost(Post post);

    public void addFollower(Follower follower);
}
