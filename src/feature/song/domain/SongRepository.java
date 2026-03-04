package feature.song.domain;

import java.util.ArrayList;

public interface SongRepository {

    ArrayList <Song> getSong();

    void saveSong (Song song);

    void deleteSong (String idSong);
}
