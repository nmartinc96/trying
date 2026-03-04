package feature.song.data;

import feature.song.domain.Song;
import feature.song.domain.SongRepository;

import java.util.ArrayList;

public class SongDataRepository implements SongRepository {

    private SongMemLocalDataSource songMemLocalDataSource;

    public SongDataRepository(SongMemLocalDataSource songMemLocalDataSource) {
        this.songMemLocalDataSource = songMemLocalDataSource;
    }


    @Override
    public ArrayList<Song> getSong() {
        return songMemLocalDataSource.findAll();
    }

    @Override
    public void saveSong(Song song) {
        songMemLocalDataSource.save(song);
    }

    @Override
    public void deleteSong(String idSong) {
        songMemLocalDataSource.delete(idSong);
    }
}
