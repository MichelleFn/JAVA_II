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
public abstract class Artist implements Serializable {

    private String name;
    private String country;
    private String id;
    private ArrayList<String> aliases;
    private ArrayList<String> tags;
    private String type;

    public Artist(String name, String country, String id, ArrayList<String> aliases, ArrayList<String> tags, String type) {
        this.name = name;
        this.country = country;
        this.id = id;
        this.aliases = aliases;
        this.tags = tags;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public ArrayList<String> getAliases() {
        return aliases;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAliases(ArrayList<String> aliases) {
        this.aliases = aliases;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "NAME:" +
                name + "\n" + "\n" + "COUNTRY:" + country + "\n" + "BIRTHDATE:"
                + "ALIASES:" + "\n" + "ARTIST_ID:" + id;
    }

}
