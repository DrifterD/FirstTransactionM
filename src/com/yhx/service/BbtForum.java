package com.yhx.service;

import com.yhx.domain.Forum;
import com.yhx.domain.Topic;

public interface BbtForum {

	void addTopic(Topic topic);
	void updateForum(Forum forum);
	Forum getForum(int forumId);
	int getForumNum();
}
