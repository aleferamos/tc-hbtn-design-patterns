public class AudioPlayer implements MediaPlayer {

    MediaPlayerAdapter mediaPlayerAdapter;

    @Override
    public void reproduzir(String nomeArquivo, TipoMedia tipoMedia) {
        if(tipoMedia.equals(TipoMedia.MP3)){
            System.out.printf("Reproduzindo MP3: %s \n", nomeArquivo);
        } else {
          this.mediaPlayerAdapter = new MediaPlayerAdapter(tipoMedia);
          mediaPlayerAdapter.reproduzir(nomeArquivo, tipoMedia);
        }

    }
}
