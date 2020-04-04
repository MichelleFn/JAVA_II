/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.io.IOException;
import org.json.simple.parser.ParseException;
import db.*;
import java.net.MalformedURLException;
import java.sql.SQLException;

/**
 *
 * @author it21771-it21794
 */
public class DemoFilesAPI implements java.io.Serializable {

    public static void main(String[] args) throws IOException, ParseException, MalformedURLException, SQLException {
        
        /*it's better to run a few commands at a time*/
        //we have already created the tables through SQLDeveloper not through java but they are empty
//        Database.InsertArtistsIntoDatabase("fred", "FR");
//        Database.InsertArtistsIntoDatabase("myles", "US");
//        Database.InsertArtistsIntoDatabase("beyonce", "US");
//        Database.InsertArtistsIntoDatabase("cher", "US");
//        Database.InsertArtistsIntoDatabase("prince", "US");

//        Database.InsertGroupsIntoDatabase("nirvana", "US");
//        Database.InsertGroupsIntoDatabase("twenty+one+pilots", "us");
//        Database.InsertGroupsIntoDatabase("soilwork", "SE");
//        Database.InsertGroupsIntoDatabase("planet+of+zeus", "GR");
//        Database.InsertGroupsIntoDatabase("muse", "GB");
//        Database.InsertGroupsIntoDatabase("queen", "GB");
//        Database.InsertGroupsIntoDatabase("spice+girls", "US");
   
//        Database.InsertCompilationIntoDatabase();
//        
//        Database.InsertAlbumIntoDatabase("innuendo");
//        Database.InsertAlbumIntoDatabase("fred");
//        Database.InsertAlbumIntoDatabase("the+dark+side+of+the+moon");
//        Database.InsertAlbumIntoDatabase("in+the+passing+light+of+day");
//        Database.InsertAlbumIntoDatabase("thriller");
//        

        Database.ReturnAlbumsFromDatabase("select * from JAVA_II_RELEASE where TRACK_COUNT<10");
//        Database.ReturnGroupsFromDatabase("SELECT * FROM JAVA_II_ARTISTS WHERE country='US'");
//        Database.ReturnSoloArtistsFromDatabase("SELECT * FROM JAVA_II_ARTISTS WHERE GENDER='female'");
//        Database.ReturnAlbumsFromDatabase("SELECT * FROM JAVA_II_RELEASE WHERE FORMAT='CD'");
//        Database.ReturnAlbumsFromDatabase("SELECT * FROM JAVA_II_RELEASE");
//        Database.ReturnSoloArtistsFromDatabase("SELECT * FROM JAVA_II_ARTISTS");
//        Database.ReturnGroupsFromDatabase("SELECT * FROM JAVA_II_ARTISTS");
//        
//        
//        Database.ReturnCompilationsFromDatabase();
        
        


    }

}
