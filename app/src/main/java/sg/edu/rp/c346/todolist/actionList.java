package sg.edu.rp.c346.todolist;

import java.util.Date;

public class actionList {

    private String name;
    private String date;

    public actionList(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return name + ':'+ date;
    }
}
