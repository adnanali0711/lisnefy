package listenify;

import java.util.*;
import java.util.LinkedList;

public class Main {

    public static List<Album> albums = new ArrayList<>();


    public static void main(String[] args) {

        Album album = new Album("Old Hindi Song","Arjit Singh");
        album.addSongToAlbum("channa",4.3);
        album.addSongToAlbum("dil lagya",2.5);
        album.addSongToAlbum("heeriye",4.0);

        albums.add(album);

        LinkedList<Song> playList1 = new LinkedList<>();

        album.play();




    }
}