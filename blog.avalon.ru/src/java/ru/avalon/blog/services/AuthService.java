package ru.avalon.blog.services;



import javax.ejb.*;
import javax.inject.*;
import javax.naming.AuthenticationException;
import javax.servlet.http.*;
import ru.avalon.blog.entities.User;
import ru.avalon.blog.exceptions.DataIntegrityViolationException;
import ru.avalon.blog.exceptions.RequiredDataException;
import ru.avalon.blog.sevices.UserService;

@Stateless
public class AuthService {

    @EJB UserService userService;      
    @Inject HttpSession session;

    public void signIn(String email, String password) throws AuthenticationException{
        User user = userService.findByEmail(email);
        if(user == null){
            throw new AuthenticationException("error.user.unknow");
        } else if(!password.equals(user.getPassword())){
            throw new AuthenticationException("error.password.wrong");
        }
        
        session.setAttribute("user", email);
    }
    
    public boolean isSignIn(){
        return session.getAttribute("user") != null;
    }
    
    public void signOut(){
        session.invalidate();
    }
    
    public User getUser(){
        String email = (String) session.getAttribute("user");
        
        if(email != null){
            return userService.findByEmail(email);
        }
        throw new AccessLocalException("error.user.required");
        
    }
    
    public void register(String email, String password, String confPassword) 
            throws RequiredDataException, DataIntegrityViolationException{
        if(email == null || email.trim().isEmpty()){
            throw new RequiredDataException("error.email.required");
        }else if(password == null || password.trim().isEmpty()){
            throw new RequiredDataException("error.password.required");
        }else if(confPassword == null || confPassword.trim().isEmpty()){
            throw new RequiredDataException("error.password.confirmation.required");
        }else if(!password.equals(confPassword)){
            throw new DataIntegrityViolationException("error.password.confirmation.incorrect");
        }
        User user = userService.findByEmail(email);
        if(user != null){
            throw new DataIntegrityViolationException("error.user.duplicated");
        }
        user = new User(email, password);
        userService.create(user);
    }
}
