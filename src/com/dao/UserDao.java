package com.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import SessionFactory.HibernateSessionFactory;

import com.beans.User;

public class UserDao {
	
	public User search(String userName) {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		
		User user=null;
		List<User> list=null;
		try
		{
			Query query=session.createQuery("from User where userName='"+userName+"'");//HQl语句对于数据进行查询
			//Query进行查询 "from User where u_name='"+username+"'"
			list=(List<User>) query.list();
			user=(User)list.get(0);
			
			tx.commit();
		}
		catch(Exception e)
		{
			if(tx!=null)
				tx.rollback();
			e.printStackTrace();
		}
		finally
		{
			HibernateSessionFactory.closeSession();
		}
		return user;
	}
}
