package ru.avalon.blog.sevices;

import javax.ejb.*;
import javax.persistence.*;
import ru.avalon.blog.entities.User;


@Stateless
public class UserService {
    @PersistenceContext(unitName = "Blog-PU")
    EntityManager em;
    
    public void create(User user){
        em.persist(user);
        em.flush();
    }
    
    public void save(User user){
        em.merge(user);
        em.flush();
    }
    
    public User findByEmail(String email){
        try{
            return em.createNamedQuery("find-user-by-email", User.class).setParameter("email", email).getSingleResult();    
        }catch(NoResultException e){
            return null;
        }
    }
}
