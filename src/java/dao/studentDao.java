package dao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Student;

@Stateless
public class studentDao {

@PersistenceContext
EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public void addStudent(Student student){
     
        em.persist(student);
        
    }
    
    public String getAllStudents(){
        return em.toString();
    }
    
    
    public void deleteStudent(Student student){
        em.remove(student);
    }
    
}




