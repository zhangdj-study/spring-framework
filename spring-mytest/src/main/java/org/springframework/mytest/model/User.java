package org.springframework.mytest.model;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author zhangdj
 * @date 2020/09/14
 */
public class User implements InitializingBean {

	private Long id;

	private String name;

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {

	}
}
