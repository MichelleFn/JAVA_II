/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import basics.*;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author it21771-it21794
 */
public class APIWrapper {

    

    public static ArrayList<Artist> getArtistsFromCountry(String artistname, String country) throws MalformedURLException, IOException, ParseException {
        URL url;
        if(country==""){
            
        
            url = new URL("http://musicbrainz.org/ws/2/artist/?query=artist:" + artistname +"%20AND%20type:Person&fmt=json");
        }else{
          url = new URL("http://musicbrainz.org/ws/2/artist/?query=artist:" + artistname + "%20AND%20country:" + country + "%20AND%20type:Person&fmt=json");
        }
//connecting to host MusicBrainz
        
        JSONObject jsonObject = ParseUrlToJson(url); //parsing url to json object using ParseUrlToJson method
        JSONArray Array = (JSONArray) jsonObject.get("artists"); //creating array to only scan through the the artists

        ArrayList<Artist> ArrayOfArtists = new ArrayList<Artist>();

        for (Object a : Array) { //looping through arraylist 

            JSONObject artist = (JSONObject) a;
            //extracting the values 
            jsonObject.put("name", artist.get("name"));
            jsonObject.put("id", artist.get("id"));
            jsonObject.put("country", artist.get("country"));
            jsonObject.put("type", artist.get("type"));
            jsonObject.put("gender", artist.get("gender"));

            JSONObject life_span = (JSONObject) artist.get("life-span"); //creating a second object to get the nested values
            jsonObject.put("birthdate", life_span.get("begin"));
            jsonObject.put("deathdate", life_span.get("end"));

            try {
                //extracting nested fields from a jsonArray list that is inside the outer arraylist
                ArrayList<String> ArrayOfAliases = new ArrayList<String>();
                JSONArray aliases = (JSONArray) artist.get("aliases");
                for (Object b : aliases) {
                    JSONObject jaliase = (JSONObject) b;
                    String sort_name = (String) jaliase.get("sort-name");
                    ArrayOfAliases.add(sort_name);
                    /*not all jsonObjects have an aliase field (arraylist) in that 
                     case it copies the value of the previous object,we don't know hpw to fix that */
                }
                jsonObject.put("aliases", ArrayOfAliases);
            } catch (Exception e) {
                System.err.append("");
            }

            Gson gson = new Gson();
            //using gson library to convert jsonObject to class SoloArtist object
            SoloArtist artist1 = gson.fromJson(jsonObject.toJSONString(), SoloArtist.class);
            //System.out.println(artist1.toString());
            ArrayOfArtists.add(artist1);

        }
        return ArrayOfArtists;
    }

    public static ArrayList<Artist> getGroupFromCountry(String groupname, String country) throws MalformedURLException, IOException, ParseException {
        URL url;
        if(country==""){
            
        
          url = new URL("http://musicbrainz.org/ws/2/artist/?query=artist:" + groupname +"%20AND%20type:Group&fmt=json");
        }else{
           url = new URL("http://musicbrainz.org/ws/2/artist/?query=artist:" + groupname + "%20AND%20country:" + country + "%20AND%20type:Group&fmt=json");
       }
//connecting to host MusicBrainz
        
        JSONObject jsonObject = ParseUrlToJson(url); 
        JSONArray Array = (JSONArray) jsonObject.get("artists");

        ArrayList<Artist> ArrayOfArtists = new ArrayList<Artist>();

        for (Object a : Array) {
            JSONObject group = (JSONObject) a;
            jsonObject.put("name", group.get("name"));
            jsonObject.put("id", group.get("id"));
            jsonObject.put("country", group.get("country"));
            jsonObject.put("type", group.get("type"));

            JSONObject lifeSpan = (JSONObject) group.get("life-span");
            jsonObject.put("begindate", lifeSpan.get("begin"));
            jsonObject.put("enddate", lifeSpan.get("end"));

            try {
                ArrayList<String> ArrayOfAliases = new ArrayList<String>();
                JSONArray aliases = (JSONArray) group.get("aliases");
                for (Object b : aliases) {
                    JSONObject jaliase = (JSONObject) b;
                    String sortName = (String) jaliase.get("sort-name");
                    ArrayOfAliases.add(sortName);
                }
                jsonObject.put("aliases", ArrayOfAliases);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            try {
                ArrayList<String> ArrayOfTags = new ArrayList<String>();
                JSONArray tags = (JSONArray) group.get("tags");
                for (Object c : tags) {
                    JSONObject jtag = (JSONObject) c;
                    String name = (String) jtag.get("name");
                    ArrayOfTags.add(name);
                }
                jsonObject.put("tags", ArrayOfTags);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            Gson gson = new Gson();
            Group group1 = gson.fromJson(jsonObject.toJSONString(), Group.class);
            //System.out.println(group1.toString());
            ArrayOfArtists.add(group1);

        }
        return ArrayOfArtists;

    }

    public static ArrayList<Release> GetRealeseByName(String name) throws MalformedURLException, IOException, ParseException {

        URL url = new URL("http://musicbrainz.org/ws/2/release/?query=release:" + name + "%20AND%20&fmt=json");
        JSONObject jsonObject = ParseUrlToJson(url);
        JSONArray Array = (JSONArray) jsonObject.get("releases");

        ArrayList<Release> ArrayOfReleases = new ArrayList<Release>();

        for (Object a : Array) {
            JSONObject release = (JSONObject) a;
            jsonObject.put("title", release.get("title"));
            jsonObject.put("status", release.get("status"));
            jsonObject.put("releaseDate", release.get("date"));
            jsonObject.put("country", release.get("country"));
            jsonObject.put("trackCount", release.get("track-count"));

            try {
                JSONObject language = (JSONObject) release.get("text-representation");
                jsonObject.put("language", language.get("language"));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            JSONArray ArtistCredit = (JSONArray) release.get("artist-credit");
            for (Object b : ArtistCredit) {
                JSONObject nameArtist = (JSONObject) b;

                try {
                    JSONObject name2 = (JSONObject) nameArtist.get("artist");
                    jsonObject.put("artist", name2.get("name"));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }
            JSONArray media = (JSONArray) release.get("media");
            for (Object c : media) {
                JSONObject format = (JSONObject) c;

                try {

                    jsonObject.put("format", format.get("format"));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }
            Gson gson = new Gson();
            Album album1 = gson.fromJson(jsonObject.toJSONString(), Album.class);
            //System.out.println(album1.toString());
            ArrayOfReleases.add(album1);

        }
        return ArrayOfReleases;
    }

    public static JSONObject ParseUrlToJson(URL url) throws IOException, ParseException {

        JSONParser parser = new JSONParser();
        InputStream input = url.openStream();
        Object obj = parser.parse(new InputStreamReader(input));

        JSONObject jsonObject = (JSONObject) obj;
        return jsonObject;

    }

    public static ArrayList<Release> GetCompilation() {
        Album album1 = new Album("Queen", "Night at the Opera", "official", "English", "31-10-1975", "CD", 12); // creating instance of class Album
        Album album2 = new Album("Queen", "Innuendo", "official", "english", "05-02-1991", "LP", 12);

        ArrayList<Release> compilation = new ArrayList<Release>(); //creating a list that contains album1 and album2
        compilation.add(album1); //adding both albums
        compilation.add(album2);

        System.out.println("COMPILATION:\n" + compilation);
        return compilation;
    }
}
