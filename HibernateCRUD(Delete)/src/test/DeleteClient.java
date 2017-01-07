package test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class DeleteClient {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.get(Student.class, 111);//puts this record with id=111 into the session
		Student st=new Student();
		st.setId(111);
		s.delete(st); 
		t.commit();//Db Query will execute upon this line execution
		s.close();
		sf.close();
		System.out.println("Record Deleted success");
	}

}
