public class AudioPlayer implements MediaPlayer {

    MediaPlayerAdapter mediaPlayerAdapter;

    public AudioPlayer() {
        this.mediaPlayerAdapter = new MediaPlayerAdapter();
    }

    @Override
    public void reproduzir(String nomeArquivo, TipoMedia tipoMedia) {
        if(tipoMedia.equals(TipoMedia.MP3)){
            System.out.println("Reproduzindo MP3: " + nomeArquivo);
        } else {
            mediaPlayerAdapter.reproduzir(nomeArquivo, tipoMedia);
        }

    }
}
