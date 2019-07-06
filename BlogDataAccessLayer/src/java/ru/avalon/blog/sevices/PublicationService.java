/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.blog.sevices;

import java.util.Collections;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import ru.avalon.blog.entities.Publication;


@Stateless
public class PublicationService {
    @PersistenceContext(unitName = "Blog-PU")
    EntityManager em;
    
    public void create(Publication publication){
        em.persist(publication);
    }
    public void update(Publication publication){
        em.merge(publication);
    }
    public void delete(Publication publication){
        em.remove(publication);
    }
    public Publication find(Object id){
        try {
            return em.createNamedQuery("find-publication-by-id", Publication.class).setParameter("id", id).getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
    public List<Publication> all(){
        try {
            return em.createNamedQuery("find-all-publications", Publication.class).getResultList();
        } catch (NoResultException e) {
            return Collections.emptyList();
        }
    }
}
