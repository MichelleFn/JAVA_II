/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basics;

import java.io.Serializable;

/**
 *
 * @author it21771-it21794
 */
public class Album extends Release implements Serializable {
    public Album(String artist, String title, String status, String language, String releaseDate, String format, int trackCount) {
        super(title, status, language, releaseDate, format, trackCount);
        this.artist = artist;
    }

    private String artist;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "ARTIST:" + artist + "\n" +"STATUS:"+this.getStatus()+"\n" +"TITLE:" + this.getTitle() + "\n" + "LANGUAGE:" + this.getLanguage()+"\n" +"FORMAT:"+this.getFormat()+"\n" + "RELEASE DATE:" + this.getReleaseDate() + "\n" + "TRACKCOUNT:"
                + this.getTrackCount()+"\n";
    }

}
