package com.yhx.service.impl;

import com.yhx.dao.ForumDao;
import com.yhx.dao.PostDao;
import com.yhx.dao.TopicDao;
import com.yhx.domain.Forum;
import com.yhx.domain.Topic;
import com.yhx.service.BbtForum;

public class BbtForumImpl implements BbtForum{

	private ForumDao forumDao;
	private TopicDao topicDao ;
	private PostDao postDao;
	/* (non-Javadoc)
	 * @see com.yhx.service.BbtForum#addTopic(com.yhx.domain.Topic)
	 */
	@Override
	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topicDao.addTopic(topic);
		postDao.addPost(topic.getPost());
	}

	/* (non-Javadoc)
	 * @see com.yhx.service.BbtForum#updateForum(com.yhx.domain.Forum)
	 */
	@Override
	public void updateForum(Forum forum) {
		// TODO Auto-generated method stub
		forumDao.updateForum(forum);
		
	}

	/* (non-Javadoc)
	 * @see com.yhx.service.BbtForum#getForum(int)
	 */
	@Override
	public Forum getForum(int forumId) {
		// TODO Auto-generated method stub
		return forumDao.getForum(forumId);
	}

	/* (non-Javadoc)
	 * @see com.yhx.service.BbtForum#getForumNum()
	 */
	@Override
	public int getForumNum() {
		// TODO Auto-generated method stub
		return forumDao.getForumNum();
	}

}
