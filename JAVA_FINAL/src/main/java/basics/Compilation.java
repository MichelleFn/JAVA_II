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
public class Compilation extends Release implements Serializable {
    private ArrayList<Album> albums;

    public Compilation(String title, String status, String language, String releaseDate, String format, int trackCount) {
        super(title, status, language, releaseDate, format, trackCount);
    }
    
    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public Compilation(ArrayList<Album> albums, String title, String status, String language, String releaseDate, String format, int trackCount) {
        super(title, status, language, releaseDate, format, trackCount);
        this.albums = albums;
    }
    
    
    @Override
    public String toString() {
        return "ALBUMS:" +albums + "\n" +"STATUS:"+super.getStatus()+"\n" +"TITLE:" + this.getTitle() + "\n" + "LANGUAGE:" + super.getLanguage()+"\n" +"FORMAT:"+super.getFormat()+"\n" + "RELEASE DATE:" + super.getReleaseDate() + "\n" + "TRACKCOUNT:"
                + super.getTrackCount()+"\n";
    }

}
