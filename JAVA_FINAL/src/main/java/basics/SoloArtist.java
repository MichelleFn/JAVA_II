/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basics;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author it21771-it21794
 */
public class SoloArtist extends Artist implements Serializable {
    private String gender;
    private String birthdate;
    private String deathdate;

    public SoloArtist(String gender, String birthdate, String deathdate, String name, String country, String id,ArrayList<String> aliases, ArrayList<String> tags, String type) {
        super(name, country, id, aliases, tags, type);
        this.gender = gender;
        this.birthdate = birthdate;
        this.deathdate = deathdate;
    }

   public String getGender() {
        return gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getDeathdate() {
        return deathdate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setDeathdate(String deathdate) {
        this.deathdate = deathdate;
    }

    public String toString() {
        return "NAME:" + 
                super.getName() 
                + "\n" + "COUNTRY:" + super.getCountry() + "\n" + "BIRTHDATE:"+birthdate
                +"\n"+"DEATHDATE:"+deathdate+"\n"+"GENDER:"+gender+"\n"+ "ALIASES:" + super.getAliases()+ "\n" + "ARTIST_ID:" + super.getId()+"\n"+"TYPE:"+super.getType()+"\n";
    }
  
    
}
