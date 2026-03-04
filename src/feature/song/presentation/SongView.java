package feature.song.presentation;

import feature.song.data.SongDataRepository;
import feature.song.data.SongMemLocalDataSource;
import feature.song.domain.*;

import java.util.ArrayList;

public class SongView {

    public static void printSong (){

        GetSongUseCase getSongUseCase = new GetSongUseCase(new SongDataRepository(SongMemLocalDataSource.newInstance()));

        ArrayList <Song> songs = getSongUseCase.execute();

        System.out.println(songs);
    }


    public static void saveSong () {

        Song s1 = new Song("123", "AAA", "1254");

        SaveSongUseCase saveSongUseCase = new SaveSongUseCase(new SongDataRepository (SongMemLocalDataSource.newInstance()));

        saveSongUseCase.execute(s1);

        printSong();

    }

    public void deleteSong (){

        printSong();

        DeleteSongUseCase deleteSongUseCase = new DeleteSongUseCase(new SongDataRepository(SongMemLocalDataSource.newInstance()));

        deleteSongUseCase.execute("123");

        printSong();
    }
}
