/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projects;

import Tasks.Task;
import java.util.HashSet;

/**
 *
 * @author jcone
 */
public class Project {

    private int id;
    private String name;
    private HashSet<Task> tasks;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashSet<Task> getTasks() {
        return tasks;
    }

    public Project(int id, String name, HashSet<Task> tasks) {
        this.id = id = 1;
        id++;
        this.name = name;
        this.tasks = tasks;
    }

    public Project() {
        this.id = 0;
        this.name = "";
        this.tasks = new HashSet();
    }

    public Task FindTask(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Project{" + "id=" + id + ", name=" + name + ", tasks=" + tasks + '}';
    }
}
