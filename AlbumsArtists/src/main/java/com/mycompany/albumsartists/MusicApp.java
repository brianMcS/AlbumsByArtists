/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.albumsartists;

import java.util.ArrayList;

/**
 *
 * @author k00266683
 */
public class MusicApp {

    public static void main(String args[]) {
        System.out.println("Artist and Album Listing\n");
        System.out.println("Artists");
        System.out.println("---------------");

        displayArtists();

        System.out.println("Albums");
        System.out.println("---------------");

        displayAlbums();

        System.out.println("Albums by Artist");
        System.out.println("---------------");

        displayAlbumsByArtists();

    }

    public static void displayArtists() {

        ArrayList<Artist> artists = MusicDB.getArtist();
        for (Artist a : artists) {
            System.out.println(a.getArtistName());
        }
        System.out.println();
    }

    public static void displayAlbums() {
        ArrayList<Album> albums = MusicDB.getAlbum();
        for (Album a : albums) {
            System.out.println(a.getAlbumName());
        }
        System.out.println();
    }

    public static void displayAlbumsByArtists() {
        ArrayList<Artist> artists = MusicDB.getArtist();
        int x = 1;
        for (Artist a : artists) {
            
            System.out.println(a.getArtistName());
            x = a.getArtistID();
            ArrayList<Album> albs = MusicDB.getAlbum1(x);
            for (Album ab : albs) {
                //System.out.println(x);
                System.out.println("\t" + ab.getAlbumName());
            }

        }

    }

}
