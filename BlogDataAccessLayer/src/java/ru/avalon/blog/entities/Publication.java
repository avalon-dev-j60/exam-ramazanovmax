package ru.avalon.blog.entities;

import com.sun.istack.NotNull;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


@NamedQueries({
    @NamedQuery(
            name = "find-all-publications",
            query = "SELECT item FROM Publication AS item"
    ),
    @NamedQuery(
            name = "find-publication-by-id",
            query = "SELECT item FROM Publication AS item WHERE item.id = :id"
    )
})
@Entity
public class Publication implements Serializable{
    
    @Id
    @GeneratedValue
    private long id;
    
    @Column(nullable = false)
    private String title;
    
    @Column(columnDefinition = "LONG VARCHAR")
    private String content;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date createdAt;
    
    @ManyToOne
    @JoinColumn(nullable = false)
    private User author;

    protected Publication() {}

    public Publication(User author, String title, String content) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.createdAt = new Date();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public User getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    
    
}
