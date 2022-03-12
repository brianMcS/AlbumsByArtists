/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.albumsartists;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author k00266683
 */
public class MusicDB {

    private static Connection getConnection() throws SQLException {
        String dbUrl = "jdbc:mysql://localhost:3306/music_artists";
        String username = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(dbUrl, username, password);
        return connection;
    }

    public static ArrayList<Artist> getArtist() {
        String sql = "SELECT ArtistID, ArtistName FROM artists  ORDER BY artistName ASC";

        var artists = new ArrayList<Artist>();
        try ( Connection connection = getConnection();  PreparedStatement ps = connection.prepareStatement(sql);  ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int artistID = rs.getInt("ArtistID");
                String artistName = rs.getString("artistName");
                Artist a = new Artist(artistID, artistName);
                artists.add(a);
            }
            return artists;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }

    public static ArrayList<Album> getAlbum() {
        String sql = "SELECT AlbumName FROM albums ORDER BY albumName ASC";
        var albums = new ArrayList<Album>();
        try ( Connection connection = getConnection();  PreparedStatement ps = connection.prepareStatement(sql);  ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                String albumName = rs.getString("albumName");
                Album a = new Album(albumName);
                albums.add(a);
            }
            return albums;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }

    public static ArrayList<Album> getAlbum1(int x) {
        String sql = "SELECT AlbumName FROM albums where artistID = ? ORDER BY albumName ASC";
       
        var albums = new ArrayList<Album>();
        try ( Connection connection = getConnection();  
                PreparedStatement ps = connection.prepareStatement(sql)){
                ps.setInt(1, x);
                ResultSet rs = ps.executeQuery(); 
            while (rs.next()) {
                String albumName = rs.getString("albumName");
                Album a = new Album(albumName);
                albums.add(a);
            }
            return albums;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }

    }

}
