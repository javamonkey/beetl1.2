package org.bee.tl.samples;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User extends Person
{
	public int id;
	public  static int max = 12;
	String _Name ="defaultName";
	User wife = null;
	User son = null;
	Date bir = new Date();
	List<User> friend = new ArrayList<User>();
	Map<String, String> books = new HashMap<String, String>();
	int age;

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public User()
	{

	}
	
	public Object getSon(){
		return new User() ;
	}

	public String getName()
	{
		return this._Name;
	}

	public void setName(String name)
	{
		this._Name = name;
	}

	public User getWife()
	{
		return wife;
	}

	public void setWife(User wife)
	{
		this.wife = wife;
	}

	public Date getBir()
	{
		return bir;
	}

	public void setBir(Date bir)
	{
		this.bir = bir;
	}

	public List<User> getFriend()
	{
		return friend;
	}
	
	public User getFriend(String name){
		for(User u :friend){
			if(u.getName().equals(name)){
				return u;
			}
		}
		return null;
	}

	public void setFriend(List<User> friend)
	{
		this.friend = friend;
	}

	public Map<String, String> getBooks()
	{
		return books;
	}

	public void setBooks(Map<String, String> books)
	{
		this.books = books;
	}

	public String toString()
	{
		return this._Name;
	}

	public static void main(String[] args)
	{

		User user = new User();
		Boolean isContinue = true;
		String dv = "N/A";
		Object o = null;
		if (user != null && user.getWife() != null)
		{
			o = user.getWife().getName();
			//format
		}
		else
		{
			o = dv;
			isContinue = false;
		}

		System.out.println(o);
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getReadOnly(){
		return "test";
	}

	public static int getMax()
	{
		return max;
	}

}