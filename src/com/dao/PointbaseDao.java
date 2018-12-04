package com.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import SessionFactory.HibernateSessionFactory;

import com.beans.Pointbase;
import com.beans.User;

public class PointbaseDao {
	    public void savePointbase(Pointbase pb){
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
	    //����ָ���ֶν��и��£�hibernate�����޷����д���ֵ�ĵ������£����Ǿ�д��sql��䣬�����統����дsql���
	    public void updatePointbase(Pointbase pb,Integer pointNum){
		   	 Session session=HibernateSessionFactory.getSession();
		   	 Transaction tx=session.beginTransaction();
		   	 try
		 		{
		   		    Query query1=session.createQuery("update Pointbase set fieldNum='"+pb.getFieldNum()+"'where pointNum='"+pointNum+"'");//HQl���������ݽ��в�ѯ  
		   		    Query query2=session.createQuery("update Pointbase set id='"+pb.getId()+"'where pointNum='"+pointNum+"'");			
		   		    Query query3=session.createQuery("update Pointbase set fieldSquare='"+pb.getFieldSquare()+"'where pointNum='"+pointNum+"'");
		   		    Query query4=session.createQuery("update Pointbase set fieldType='"+pb.getFieldType()+"'where pointNum='"+pointNum+"'");
		   		    Query query5=session.createQuery("update Pointbase set fieldLoc='"+pb.getFieldLoc()+"'where pointNum='"+pointNum+"'");
		   		    Query query6=session.createQuery("update Pointbase set createTime='"+pb.getCreateTime()+"'where pointNum='"+pointNum+"'");
		   		    query1.executeUpdate();
		   		    query2.executeUpdate();
		   		    query3.executeUpdate();
		   		    query4.executeUpdate();
		   		    query5.executeUpdate();
		   		    query6.executeUpdate();
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
	    public void deletePointbase(Integer pointNum){
		   	 Session session=HibernateSessionFactory.getSession();
		   	 Transaction tx=session.beginTransaction();
		   	 
		   	 try
		 		{
		   		    Query query=session.createQuery("delete from Pointbase where pointNum='"+pointNum+"'");//HQl���������ݽ��в�ѯ   
		   		    query.executeUpdate();
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
	
         public ArrayList<Pointbase> searchAll(){
        	 Session session=HibernateSessionFactory.getSession();
     		Transaction tx=session.beginTransaction();
     		
     		ArrayList<Pointbase> pointbases=new ArrayList<Pointbase>();
     		try
     		{
     			Query query=session.createQuery("from Pointbase order by createTime desc");//HQl���������ݽ��в�ѯ
     			pointbases=(ArrayList<Pointbase>) query.list();
     			
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
     		return pointbases; 
         }
         //ͨ���ؿ�ָ���Ž��в�ѯ
         public ArrayList<Pointbase> searchByPointNum(Integer pointNum){
        	 Session session=HibernateSessionFactory.getSession();
     		Transaction tx=session.beginTransaction();
     		
     		ArrayList<Pointbase> pointbases=new ArrayList<Pointbase>();
     		try
     		{
     			Query query=session.createQuery("from Pointbase where pointNum='"+pointNum+"'");//HQl���������ݽ��в�ѯ
     			pointbases=pointbases=(ArrayList<Pointbase>) query.list();
     			
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
     		return pointbases; 
         }
         //ͨ���ؿ��Ž��в�ѯ
         public ArrayList<Pointbase> searchByFieldNum(Integer fieldNum){
        	Session session=HibernateSessionFactory.getSession();
     		Transaction tx=session.beginTransaction();
     		
     		ArrayList<Pointbase> pointbases=new ArrayList<Pointbase>();
     		try
     		{
     			Query query=session.createQuery("from Pointbase where fieldNum='"+fieldNum+"'");//HQl���������ݽ��в�ѯ
     			pointbases=(ArrayList<Pointbase>) query.list();   			
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
     		return pointbases; 
         }
         //ͨ���ؿ��ź͵ؿ�ָ���Ž��в�ѯ
         public ArrayList<Pointbase> searchByNum(Integer FieldNum,Integer pointNum){
        	Session session=HibernateSessionFactory.getSession();
     		Transaction tx=session.beginTransaction();
     		
     		ArrayList<Pointbase> pointbases=new ArrayList<Pointbase>();
     		try
     		{
     			Query query=session.createQuery("from Pointbase where fieldNum='"+FieldNum+"'and pointNum'"+pointNum+"'");//HQl���������ݽ��в�ѯ
     			pointbases=(ArrayList<Pointbase>) query.list();   			
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
     		return pointbases; 
         }
        	
}
