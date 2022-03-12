/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.albumsartists;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author k00266683
 */
public class Artist {

    private int artistID;
    private String artistName;
    private List<Album> albums;

    public Artist() {
    }

    public Artist(int artistID, String artistName, String albums) {
        this.artistID = artistID;
        this.artistName = artistName;
        this.albums = new ArrayList<>();
    }

    public Artist(int artistID, String artistName) {
        this.artistName = artistName;
        this.artistID = artistID;
    }

    public Artist(String artistName) {
        this.artistName = artistName;
    }

    public int getArtistID() {
        return artistID;
    }

    public void setArtistID(int artistID) {
        this.artistID = artistID;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public List<Album> getAlbums() {
        return this.albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    @Override
    public String toString() {
        return "Artist{" + "ArtistID=" + artistID + ", artistName=" + artistName + '}';
    }

}
