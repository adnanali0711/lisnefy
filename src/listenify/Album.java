package listenify;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {

    public String albumName;

    public String artistName;

    public List<Song> songList;

    public Album(String albumName, String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.songList = new ArrayList<>();
    }

    boolean findSongInAlbum(String title){
        for(Song song:songList){
            if((song.title).compareTo(title)==0) return true;
        }
        return false;
    }

    String addSongToAlbum(String title,double duration){
        // first check if song is already present in the playlist or not
        if(findSongInAlbum(title)){
            return "Song is already present";
        }
        Song newSong = new Song(title,duration);
        songList.add(newSong);
        return "Song is successfully added";
    }

    public String addSongToPlayList(int trackNumber, LinkedList<Song> songList){
        int index = trackNumber-1;
        if(index>=0 && index<this.songList.size()){
            Song song = this.songList.get(index);
            songList.add(song);
            return "Your song sucessfully added";

        }
        return "Your song is not added because of invalid track number";
    }

    public String addSOngToPlayList(String title,LinkedList playList){
        if(findSongInAlbum(title)){
            for(Song song:this.songList){
                if(song.title.equals(title)){
                    playList.add(song);
                    return "Song is sucessfully addes";
                }
            }

        }
    return "incorrect title";
    }

    public void play(){
        for(Song song : songList){
            System.out.println(toString(song));
        }
        return;
    }
    public String toString(Song song) {
        return "Song{" +
                "title='" + song.title + '\'' +
                ", duration=" + song.duration +
                '}';
    }

}
