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
public abstract class Release implements Serializable {
     private String title;
    private String status;
    private String language;
    private String releaseDate;
    private String format;
    private int trackCount;

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    public String getLanguage() {
        return language;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getFormat() {
        return format;
    }

    public int getTrackCount() {
        return trackCount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setTrackCount(int trackCount) {
        this.trackCount = trackCount;
    }

    public Release(String title, String status, String language, String releaseDate, String format, int trackCount) {
        this.title = title;
        this.status = status;
        this.language = language;
        this.releaseDate = releaseDate;
        this.format = format;
        this.trackCount = trackCount;
    }

    public abstract String toString();
}
