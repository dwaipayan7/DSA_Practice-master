package com.company;

import java.util.ArrayList;
import java.util.List;

    // Song class representing a single song
    class Song {
        private String title;
        private String artist;
        private String album;
        private int duration; // in seconds
        private String filePath;

        public Song(String title, String artist, String album, int duration, String filePath) {
            this.title = title;
            this.artist = artist;
            this.album = album;
            this.duration = duration;
            this.filePath = filePath;
        }

        public String getTitle() {
            return title;
        }

        public String getArtist() {
            return artist;
        }

        public String getAlbum() {
            return album;
        }

        public int getDuration() {
            return duration;
        }

        public String getFilePath() {
            return filePath;
        }

        @Override
        public String toString() {
            return title + " by " + artist + " (" + album + ")";
        }
    }

    // Playlist class representing a collection of songs
    class Playlist {
        private String name;
        private List<Song> songs;

        public Playlist(String name) {
            this.name = name;
            this.songs = new ArrayList<>();
        }

        public void addSong(Song song) {
            songs.add(song);
        }

        public void removeSong(Song song) {
            songs.remove(song);
        }

        public List<Song> getSongs() {
            return songs;
        }

        @Override
        public String toString() {
            return name + " [" + songs.size() + " songs]";
        }
    }

    // Player class handling playback functionalities
    class Player {
        private Song currentSong;
        private boolean isPlaying;

        public void play(Song song) {
            currentSong = song;
            isPlaying = true;
            System.out.println("Playing: " + song);
            // Code to actually play the song file using audio libraries would go here
        }

        public void pause() {
            if (isPlaying) {
                isPlaying = false;
                System.out.println("Paused: " + currentSong);
            }
        }

        public void stop() {
            if (isPlaying) {
                isPlaying = false;
                System.out.println("Stopped: " + currentSong);
                currentSong = null;
            }
        }

        public void next(Playlist playlist) {
            if (currentSong != null) {
                List<Song> songs = playlist.getSongs();
                int currentIndex = songs.indexOf(currentSong);
                if (currentIndex < songs.size() - 1) {
                    play(songs.get(currentIndex + 1));
                }
            }
        }

        public void previous(Playlist playlist) {
            if (currentSong != null) {
                List<Song> songs = playlist.getSongs();
                int currentIndex = songs.indexOf(currentSong);
                if (currentIndex > 0) {
                    play(songs.get(currentIndex - 1));
                }
            }
        }
    }

    // Library class managing the collection of songs and playlists
    class Library {
        private List<Song> songs;
        private List<Playlist> playlists;

        public Library() {
            songs = new ArrayList<>();
            playlists = new ArrayList<>();
        }

        public void addSong(Song song) {
            songs.add(song);
        }

        public void removeSong(Song song) {
            songs.remove(song);
        }

        public void createPlaylist(String name) {
            playlists.add(new Playlist(name));
        }

        public void addSongToPlaylist(Song song, Playlist playlist) {
            playlist.addSong(song);
        }

        public void removeSongFromPlaylist(Song song, Playlist playlist) {
            playlist.removeSong(song);
        }

        public List<Song> getAllSongs() {
            return songs;
        }

        public List<Playlist> getAllPlaylists() {
            return playlists;
        }
    }

    // Main class representing the user interface
    public class SongPlayerApp {
        public void main(String[] args) {
            Library library = new Library();
            Player player = new Player();

            // Create some songs
            Song song1 = new Song("Song One", "Artist A", "Album X", 210, "/path/to/song1.mp3");
            Song song2 = new Song("Song Two", "Artist B", "Album Y", 180, "/path/to/song2.mp3");
            Song song3 = new Song("Song Three", "Artist A", "Album X", 240, "/path/to/song3.mp3");

            // Add songs to library
            library.addSong(song1);
            library.addSong(song2);
            library.addSong(song3);

            // Create a playlist and add songs to it
            library.createPlaylist("My Playlist");
            Playlist myPlaylist = library.getAllPlaylists().get(0);
            library.addSongToPlaylist(song1, myPlaylist);
            library.addSongToPlaylist(song2, myPlaylist);

            // Play songs from the playlist
            player.play(song1);
            player.next(myPlaylist);
            player.previous(myPlaylist);
            player.pause();
            player.stop();

            // Print library contents
            System.out.println("Library songs:");
            for (Song song : library.getAllSongs()) {
                System.out.println(song);
            }

            System.out.println("Playlists:");
            for (Playlist playlist : library.getAllPlaylists()) {
                System.out.println(playlist);
            }
        }
    }


