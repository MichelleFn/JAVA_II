/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import basics.*;
import java.sql.Connection;
import java.sql.DriverManager;
import files.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.json.simple.parser.ParseException;

/**
 *
 * @author it21771-it21794
 */
public class Database {

    public static Connection Connection() { //creating a method to connect with Oracle database
        Connection conn = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception e) {
            System.out.println("driver not found");
            System.out.println(e.getMessage());
        }
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle12c.hua.gr:1521:orcl", "it21771", "it21771");
        } catch (Exception ex) {
            System.out.println("no connection ");
            System.out.println(ex.getMessage());

        }
        return conn;

    }
    /* we created one table for the abstract class Artist that contains soloArtists and groups 
     so we need two methods to insert into  the database because each sub-class has some extra fields*/

    public static int InsertArtistsIntoDatabase(ArrayList<Artist> result) throws IOException, MalformedURLException, ParseException, SQLException {
        Connection conn = Database.Connection(); //creating connection
        //returning ArrayList of artists using APIWrapper's method
        int i=0;
        for (Artist a : result) { //looping through ArrayList to extract data
            SoloArtist b = (SoloArtist) a;
            //extracting fields to make an sql query 
            String name = a.getName();
            String id = a.getId();
            String gender = b.getGender();
            String country = b.getCountry();
            String type = a.getType();
            ArrayList<String> tags = a.getTags();
            String birthdate = b.getBirthdate();
            String deathdate = b.getDeathdate();
            try {
                String sql = "insert into JAVA_II_ARTISTS values ('" + id + "','" + name + "','" + country + "','" + type + "','" + gender + "','" + birthdate + "','" + deathdate + "','NULL','NULL','" + tags + "')";
                //using preparedStatement because the String query has parameters
                PreparedStatement preparedStmt = conn.prepareStatement(sql);
                preparedStmt.executeQuery(sql);
                //calculating the rows that are inserted
                i++;

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            //it does not run
//            } finally {
//            
//            if (conn != null) {
//                conn.close();
//                System.out.println("Connection closed");
//                    
//            }

        }

        //printing how many rows have been inserted
        System.out.println(i + " Rows Inserted");
        return i;

    }

    public static int InsertGroupsIntoDatabase(ArrayList<Artist> result) throws IOException, MalformedURLException, ParseException {
        Connection conn = Database.Connection();

        int i = 0;
        for (Artist a : result) {
            Group b = (Group) a;

            String name = a.getName();
            String id = a.getId();
            String country = b.getCountry();
            String type = a.getType();
            ArrayList<String> tags = a.getTags();
            String begindate = b.getBegindate();
            String enddate = b.getEnddate();
            try {
                String sql = "insert into JAVA_II_ARTISTS values ('" + id + "','" + name + "','" + country + "','" + type + "','NULL','NULL','NULL','" + begindate + "','" + enddate + "','" + tags + "')";
                PreparedStatement preparedStmt = conn.prepareStatement(sql);
                preparedStmt.executeQuery(sql);
                i++;

            } catch (Exception e) {
                System.out.println("");
            }
            //it does not run
//            } finally {
//           
//            if (conn != null) {
//                try {
//                    conn.close();
//                    System.out.println("Connection closed");
//                } catch (Exception ex) {
//                    ex.getMessage();
//                }
        }

        System.out.println(i + " Row Inserted");
        return i;
    }
    /* we created one table for the abstract class Release that contains albums and compilations 
     so we need two methods to insert into  the database because each sub-class has some extra fields*/

    public static int InsertAlbumIntoDatabase(ArrayList<Release> result) throws IOException, MalformedURLException, ParseException {
        Connection conn = Database.Connection();

        int i = 0;
        for (Release a : result) {
            Album b = (Album) a;

            String name = b.getArtist();
            String status = b.getStatus();
            String title = b.getTitle();
            String language = b.getLanguage();
            String format = b.getFormat();
            String releaseDate = b.getReleaseDate();
            int trackCount = b.getTrackCount();

            try {
                String sql = "insert into JAVA_II_RELEASE values ('" + title + "','" + name + "','" + status + "','" + trackCount + "','" + format + "','" + releaseDate + "','" + language + "',null)";
                PreparedStatement preparedStmt = conn.prepareStatement(sql);
                preparedStmt.executeQuery(sql);
                i++;

            } catch (Exception e) {
                System.out.println("");
            } //it does not run
//            } finally {
//
//                if (conn != null) {
//                    try {
//                        conn.close();
//                        System.out.println("Connection closed");
//                    } catch (Exception ex) {
//                        ex.getMessage();
//                    }
//
//                    System.out.println(i + " Row Inserted");
//
//                }
//            }
        }
        return i;
    }

    /* we didn't extract the compilation data from a json but we added the fields ourselves
     so it only has an arrayList of albums */
    public static void InsertCompilationIntoDatabase() {
        Connection conn = Database.Connection();

        ArrayList<Release> result;
        result = APIWrapper.GetCompilation();
        int i = 0;
        for (Release a : result) {
            try {
                String sql = "insert into JAVA_II_RELEASE values (NULL,NULL,NULL,NULL,NULL,NULL,NULL,'" + result + "')";

                PreparedStatement preparedStmt = conn.prepareStatement(sql);
                preparedStmt.executeQuery(sql);
                i++;
            } catch (Exception e) {
                System.out.println("");
            }

        }
        System.out.println(i + " Row Inserted");
    }

    public static ArrayList<SoloArtist> ReturnSoloArtistsFromDatabase(String query) throws SQLException {
        ArrayList<String> aliases = null;
        ArrayList<String> tags = null;
        Connection conn = Database.Connection();
        Statement stmt = null;

        SoloArtist sa = null; //creating an object of SoloArtist
        ArrayList<SoloArtist> result = new ArrayList<SoloArtist>();
        try {

            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) { //extracting fields for the soloArtist object through the ResultSet
                String id = rs.getString("ID");
                String name = rs.getString("NAME");
                String country = rs.getString("COUNTRY");
                String type = rs.getString("TYPE");
                String gender = rs.getString("GENDER");
                String birthdate = rs.getString("BIRTH_DATE");
                String deathdate = rs.getString("DEATH_DATE");

                if ("Person".equals(type)) {
                    //initiating the object
                    sa = new SoloArtist(gender, birthdate, deathdate, name, country, id, aliases, tags, type);

                    //returning the object
                    System.out.println(sa.toString());
                    result.add(sa);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        } finally {
//            if (stmt != null) {
//                stmt.close();
//            }
//            if (conn != null) {
//                conn.close();
//                System.out.println("Connection closed");
//            }
//        }
        return result;

    }

    public static ArrayList<Group> ReturnGroupsFromDatabase(String query) throws SQLException {
        ArrayList<String> aliases = null;
        ArrayList<String> tags = null;
        ArrayList<SoloArtist> members = null;
        Connection conn = Database.Connection();
        Statement stmt = null;

        Group g = null;
        ArrayList<Group> result = new ArrayList<Group>();

        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String id = rs.getString("ID");
                String name = rs.getString("NAME");
                String country = rs.getString("COUNTRY");
                String type = rs.getString("TYPE");
                String begindate = rs.getString("BEGIN_DATE");
                String enddate = rs.getString("END_DATE");
                if ("Group".equals(type)) {
                    g = new Group(begindate, enddate, members, name, country, id, aliases, tags, type);

                    System.out.println(g.toString());
                    result.add(g);
                }

            }
        } catch (Exception e) {

        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
                System.out.println("Connection closed");
            }
        }
        return result;
    }

    public static ArrayList<Release> ReturnAlbumsFromDatabase(String query) throws SQLException {

        Connection conn = Database.Connection();
        Statement stmt = null;

        Album al = null;
        ArrayList<Release> result = new ArrayList<Release>();

        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String title = rs.getString("TITLE");
                String artist = rs.getString("ARTIST");
                String status = rs.getString("STATUS");
                int trackCount = rs.getInt("TRACK_COUNT");
                String format = rs.getString("FORMAT");
                String releaseDate = rs.getString("RELEASE_DATE");
                String language = rs.getString("LANGUAGE");

                al = new Album(artist, title, status, language, releaseDate, format, trackCount);

                System.out.println(al.toString());
                result.add(al);

            }
        } catch (Exception e) {

        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
                System.out.println("Connection closed");
            }
        }
        return result;
    }

    public static void ReturnCompilationsFromDatabase() throws SQLException {
        String query = ("SELECT ALBUMS FROM JAVA_II_RELEASE");
        String compilation = null;
        Connection conn = Database.Connection();
        Statement stmt = null;

        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                compilation = rs.getString("ALBUMS");
                System.out.println(compilation);

            }
        } catch (Exception e) {

        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
                System.out.println("Connection closed");
            }
        }

    }

}
