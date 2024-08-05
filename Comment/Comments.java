/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comment;

import Users.User;

/**
 *
 * @author jcone
 */
public class Comments {
    private int id;
    private User user;
    private String comment;

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    

    public Comments(int id, User user, String comment) {
        this.id = id;
        this.user = user;
        this.comment = comment;
    }

    public Comments() {
        this(0,null,"");
    }

    @Override
    public String toString() {
        return "Comments{" + "id=" + id + ", user=" + user + ", comment=" + comment + '}';
    }
   
    
    
}
