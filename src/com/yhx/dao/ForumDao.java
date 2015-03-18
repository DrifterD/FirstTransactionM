package com.yhx.dao;

import java.util.List;

import com.yhx.domain.Forum;

public interface ForumDao {
   void addForum(Forum forum);
   void updateForum(Forum forum);
   Forum getForum(int forumId);
   int getForumNum();
}
