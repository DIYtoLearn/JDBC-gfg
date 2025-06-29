package com.gl.repo;

import com.gl.beans.User;

public interface UserDao {
	public int checkuser(User user);
	public int saveUser(User user);
}
