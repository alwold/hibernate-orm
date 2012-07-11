//$Id: User.java 6058 2005-03-11 17:05:19Z oneovthafew $
package org.hibernate.test.hqlfetchscroll;

import java.util.HashSet;
import java.util.Set;

public class Parent {
	private String name;
	private Set children = new HashSet();
	
	Parent() {}
	
	public Parent(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	

	void setName(String name) {
		this.name = name;
	}

	public Set getChildren() {
		return children;
	}
	
	public void setChildren(Set children) {
		this.children = children;
	}
	
	public void addChild (Child child) {
		children.add(child);
	}
	
	public String toString() {
		return name;
	}
}
