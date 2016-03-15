
package com.naveed;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;

@ManagedBean
@SessionScoped
public class Data {
    
    private Members m;
    private HibernateUtil helper;
    private Session session;


    public void addMember(){
        m = new Members("Steve");
        session = helper.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(m);
        session.getTransaction().commit();
        session.close();
    }
    
}
