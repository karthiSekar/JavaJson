package shenba.test.javaJson;

import java.io.Serializable;

/**
 * Hello world!
 *
 */
public class App 
{
	@Override
	public String toString() {
		return "App [no=" + no + ", name=" + name + "]";
	}

	int no;
	String name;
	
    public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
