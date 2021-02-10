package no.noroff.sean.fakeapi.models.fakedb;


import no.noroff.sean.fakeapi.models.Artist;
import no.noroff.sean.fakeapi.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private List<Customer> customers = new ArrayList<>();
    private List<Artist> artists = new ArrayList<>();

    public Database() {
        populateCustomerData();
        populateArtistData();
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    private void populateCustomerData() {
        customers.add(new Customer(1, "Sean", "Skinner", "Norway", "0001", "5551234", "Sean.Skinner@noroff.no"));
        customers.add(new Customer(2, "Greg", "Linklater", "Norway", "0002", "5554321", "Greg@noroff.no"));
        customers.add(new Customer(3, "Liana", "Hossain", "Finland", "0003", "5564232", "Liana@experis.fi"));
    }

    private void populateArtistData() {
        artists.add(new Artist("Grimes", "Synth Pop"));
        artists.add(new Artist("Slayer", "Thrash Metal"));
        artists.add(new Artist("Beethoven", "Classical"));
        artists.add(new Artist("Miles Davis", "Jazz"));
        artists.add(new Artist("Metallica", "Thrash Metal"));
        artists.add(new Artist("Mozart", "Classical"));
        artists.add(new Artist("Bach", "Classical"));
        artists.add(new Artist("Schubert", "Classical"));
        artists.add(new Artist("Vivaldi", "Classical"));
    }
}