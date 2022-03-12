/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.albumsartists;

/**
 *
 * @author k00266683
 */
public class Album {

    private int albumID;
    private int artistID;
    private String albumName;

    public Album() {
    }

    public Album(int albumID, int artistID, String albumName) {
        this.albumID = albumID;
        this.artistID = artistID;
        this.albumName = albumName;
    }

    public Album(String albumName) {
        this.albumName = albumName;
    }

    public int getAlbumID() {
        return albumID;
    }

    public void setAlbumID(int albumID) {
        this.albumID = albumID;
    }

    public int getArtistID() {
        return artistID;
    }

    public void setArtistID(int artistID) {
        this.artistID = artistID;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    @Override
    public String toString() {
        return "Album{" + "albumID=" + albumID + ", artistID=" + artistID + ", albumName=" + albumName + '}';
    }

}
