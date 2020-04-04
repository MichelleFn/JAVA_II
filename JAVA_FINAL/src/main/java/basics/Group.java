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
public class Group extends Artist implements Serializable {

    private String begindate;
    private String enddate;
    private ArrayList<SoloArtist> members;

    public Group(String begindate, String enddate, ArrayList<SoloArtist> members, String name, String country, String id, ArrayList<String> aliases, ArrayList<String> tags, String type) {
        super(name, country, id, aliases, tags, type);
        this.begindate = begindate;
        this.enddate = enddate;
        this.members = members;
    }

    public ArrayList<SoloArtist> getMembers() {
        return members;
    }

    public String getBegindate() {
        return begindate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setBegindate(String begindate) {
        this.begindate = begindate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public void setMembers(ArrayList<SoloArtist> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "NAME:" + super.getName() + "\n" + "COUNTRY:" + super.getCountry() + "\n" + "ID:" + super.getId() + "\n" + "BEGIN DATE:"
                + begindate + "\n" + "END DATE:" + enddate + "\n" + "MEMBERS:" + members + "\n" + "ALIASES:" + super.getAliases() + "\n" + "TAGS:" + super.getTags() + "\n" +"TYPE:"+ super.getType()+"\n";
    }

}
