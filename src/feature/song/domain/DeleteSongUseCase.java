package feature.song.domain;

public class DeleteSongUseCase {

    private SongRepository songRepository;

    public DeleteSongUseCase(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public void execute (String idSong){
        songRepository.deleteSong(idSong);
    }
}
