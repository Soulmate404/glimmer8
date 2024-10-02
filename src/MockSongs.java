import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MockSongs {
    public class Song implements Comparable<Song> {
        private String title;
        private String artist;
        private int bpm;

        public Song(String title, String artist, int bpm) {
            this.title = title;
            this.artist = artist;
            this.bpm = bpm;
        }

        @Override
        public int compareTo(Song other) {
            return this.title.compareTo(other.title);
        }

        @Override
        public String toString() {
            return "Song{" + "title='" + title + '\'' + ", artist='" + artist + '\'' + ", bpm=" + bpm + '}';
        }

    }





        public List<Song> getSongStrings() {
            List<Song> songs = new ArrayList<>();
            //模拟将要处理的列表
            songs.add(new Song("a", "b", 12));
            songs.add(new Song("as", "ss", 55));
            songs.add(new Song("asd", "asdf", 16));
            return songs;


        }






        public static void main(String[] args) {
            MockSongs mockSongs=new MockSongs();
            List<Song>songList=mockSongs.getSongStrings();
            Collections.sort(songList);
            for (Song song : songList) {
                System.out.println(song);
            }



        }



}