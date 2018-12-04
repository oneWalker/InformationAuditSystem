package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import SessionFactory.HibernateSessionFactory;

import com.beans.Pointbase;
import com.beans.Pointfield;

public class PointfieldDao {
	 public void savePointfield(Pointfield pb){
	   	 Session session=HibernateSessionFactory.getSession();
	   	 Transaction tx=session.beginTransaction();
	   	 try
	 		{
	 			session.save(pb);   			
	 			tx.commit();
	 		}
	 		catch(Exception e)
	 		{
	 			e.printStackTrace();
	 		}
	 		finally
	 		{
	 			HibernateSessionFactory.closeSession();
	 		}
	    }
	    public void updatePointfield(Pointfield pb){
		   	 Session session=HibernateSessionFactory.getSession();
		   	 Transaction tx=session.beginTransaction();
		   	 try
		 		{
		 			session.update(pb);   			
		 			tx.commit();
		 		}
		 		catch(Exception e)
		 		{
		 			e.printStackTrace();
		 		}
		 		finally
		 		{
		 			HibernateSessionFactory.closeSession();
		 		}
		    }
	    public void deletePointfield(String f_id){
		   	 Session session=HibernateSessionFactory.getSession();
		   	 Transaction tx=session.beginTransaction();
		   	 try
		 		{
		 			session.delete(f_id);   			
		 			tx.commit();
		 		}
		 		catch(Exception e)
		 		{
		 			e.printStackTrace();
		 		}
		 		finally
		 		{
		 			HibernateSessionFactory.closeSession();
		 		}
		    }
}
