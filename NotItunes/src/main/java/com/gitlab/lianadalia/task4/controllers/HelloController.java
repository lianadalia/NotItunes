package com.gitlab.lianadalia.task4.controllers;


import java.util.Random;
import no.noroff.sean.fakeapi.models.Artist;
import no.noroff.sean.fakeapi.models.fakedb.Database;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    private Database database = new Database();
    Random random = new Random();

    @GetMapping("/")
    public String index() { //displays root page works
        System.out.println("/ was accessed");
        //return "<h1>This is the root page</h1>";
        return "index"; //<-trying to match template html file

    }

    @GetMapping("/hello") //displays hello works
    public String greetGuest() {
        return "Hello, guest!";
    }

    //search for artist // works and shows
    @GetMapping("/search")
    public Artist simpleSearch(@RequestParam(name = "searchterm") String artistName) {
        List<Artist> artists = database.getArtists();
        int x =-1;
        for(int i =0; i < artists.size(); i++) {    //loops through artist
            if (artists.get(i).getArtistName().equals(artistName)) { //if artist name is equal it stops
                x =i;
                break;
            }
        }
        Artist artist = null;
        if (x!=-1){
            artist=artists.get(x);

        }
        return artist;
    }

    // returning five random artists
    @GetMapping("/returnartist")
    public List<Artist> getRandomArtists() {
        // need to get list size
        List<Artist> random_artists = new ArrayList<>();
        while(true) { //loop to go through the artist arraylist
            int artistindex = random.nextInt((database.getArtists().size()));//trying to get random artist
            if(!random_artists.contains(database.getArtists().get(artistindex))){ //checking for duplicates
                random_artists.add(database.getArtists().get(artistindex));
            }
            if(random_artists.size()==5) {
                break;
            }

        }
        return random_artists;
    }

}
