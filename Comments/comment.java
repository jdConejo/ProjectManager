
package Comments;

/**
 *
 * @author bizco
 */

import Users.User;
public class comment {
    
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

    public comment(int id, User user, String comment) {
        this.id = id;
        this.user = user;
        this.comment = comment;
    }
        public comment() {
        this.id = 0;
        this.user = null;
        this.comment = "";
    }

    @Override
    public String toString() {
        return "comment{" + "id=" + id + ", user=" + user + ", comment=" + comment + '}';
    }
    
}
