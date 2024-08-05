/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lider;

import Projects.Project;
import Users.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author bizco
 */
public class Manager {

    private ArrayList<Project> listProject;
    private HashSet<User> listUsers;
    private double percentage;
    private int numberTasks;

    public ArrayList<Project> getListProject() {
        return listProject;
    }

    public Manager(ArrayList<Project> listProject) {
        this.listProject = new ArrayList();
        this.listUsers = new HashSet<>();
    }

    public void addProject(Project project) {
        this.listProject.add(project);
    }

    public void daleteProject(Project project) {
        for (Iterator<Project> it = this.listProject.iterator(); it.hasNext();) {
            if (project.equals(it.next().getId())) {
                it.remove();
            }
        }

    }

    public Project lookProject(int id) {
        for (Project project : this.listProject) {
            if (project.getId() == id) {
                return project;
            }
        }
        return null;
    }

    public boolean addUser(User user) {
        return this.listUsers.add(user);
    }

    /**
     * Elimina un usuario de la lista de usuarios.
     *
     * @param user el usuario a eliminar.
     * @return true si el usuario fue eliminado, false si no existía.
     */
    public boolean deleteUser(User user) {
        return this.listUsers.remove(user);
    }

    public User findUser(String id) {
        for (User user : this.listUsers) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }
}
