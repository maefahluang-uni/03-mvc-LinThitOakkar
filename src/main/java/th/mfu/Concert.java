package th.mfu;

import java.util.Date;

public class Concert {

    //TODO: add attributes
    int id;
    String title;
    String performer;
    Date date;
    String description;
    public Concert() {
    }
    public Concert(String title, String description) {
        //TODO: set attributes
        this.title = title;
        this.description = description;
    }
 
    //TODO: add getters and setters for all attributes
    // You can use Source action/generate getter setter function
    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getPerformer(){
        return performer;
    }

    public void setPerformer(String performer){
        this.performer = performer;
    }
}
