/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tasks;

import Comment.Comments;
import Users.User;
import java.util.ArrayList;

/**
 *
 * @author jcone
 */
public class Task {
    private int id;
    private String description;
    private boolean complete;
    private User user;
    private ArrayList<Comments> comments;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isComplete() {
        return complete;
    }

    public User getUser() {
        return user;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    
    
    public ArrayList<Comments> getComments() {
        return comments;
    }

    public Task(int id, String description, boolean complete, User user, ArrayList<Comments> comments) {
        this.id = id;
        this.description = "Pendiente";
        this.complete = complete;
        this.user = user;
        this.comments = comments = new ArrayList();
    }

    public Task() {
        this(0,"",false,null,new ArrayList());
    }
    
    public void addComments(Comments comment){
        comments.add(comment);
        
    }
    
    
}
