package com.gitlab.lianadalia.task4.controllers;


import no.noroff.sean.fakeapi.models.Artist;
import no.noroff.sean.fakeapi.models.Customer;
import no.noroff.sean.fakeapi.models.fakedb.Database;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        System.out.println("/ was accessed");
        return "<h1>This is the root page</h1>";

    }
    @GetMapping("/hello")
    public String greetGuest() {
        return "Hello, guest!";
    }

    //Read all the customers in the “database”,
    @GetMapping("/customer")
    public String customer() {
       // Customer.getId();
        //Customer.getLastName();

        return "index";
    }

    // searching for artists matching a specific search term.
    @GetMapping("/search")
    public String simpleSearch(@RequestParam(name = "search") String search, Model model) {
      //  model.addAttribute("artistList", Database.getArtists(search));
        //model.addAttribute("genre", Database.getGenre(search));
        return "search";
    }

    // returning five random artists ->not sure
    // @GetMapping("/returnartist")
    // public String getArtistName(Model model) {
    // model.addAttribute("artists", Artist.getArtistName());
    //return "artist";

    // This function returns all the artist in the database ->not sure
    // @RequestMapping(value="/artist", method = RequestMethod.GET)
    //public ArrayList<artist> getArtistName(){
    //  return getArtistName();
    //}
    //}


}
