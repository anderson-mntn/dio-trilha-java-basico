package aulas_oo.set;

import java.util.Comparator;

public class Serie {
    private String name;
    private String gender;
    private Integer epMinutes;

    // Source actions:

    // Constructor
    public Serie(String name, String gender, Integer epMinutes) {
        this.name = name;
        this.gender = gender;
        this.epMinutes = epMinutes;
    }

    // Getter and setters
    public String getName() {
        return name;
    }
   
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Integer getEpMinutes() {
        return epMinutes;
    }
    public void setEpMinutes(Integer epMinutes) {
        this.epMinutes = epMinutes;
    }

    // toString
    @Override
    public String toString() {
        return "\n[name: " + name + ", gender: " + gender + ", epMinutes: " + epMinutes + "m]";
    }
   
    
    
    
}
// Gender Comparator
class ComparetorGender implements Comparator <Serie>{
    @Override
    public int compare(Serie s1, Serie s2){
        int gender = s1.getGender().compareTo(s2.getGender());
        if (gender != 0) return gender;

        return -1;
    }
}

class ComparetorDuration implements Comparator<Serie>{
    @Override
    public int compare(Serie s1, Serie s2){
        int duration = s1.getEpMinutes().compareTo(s2.getEpMinutes());
        if(duration != 0) return duration;
        return -1;
    }
}