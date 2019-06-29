package ru.avalon.blog.entities;

import java.io.Serializable;
import javax.persistence.*;

@NamedQueries({
    @NamedQuery(
            name="find-user-by-email",
            query="SELECT user FROM Users AS user Where user.email = :email"
    )
})
@Entity(name = "Users")
public class User implements Serializable{
    
    @Id
    @GeneratedValue
    private long id;
    
    private String email;
    
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }
    
}
