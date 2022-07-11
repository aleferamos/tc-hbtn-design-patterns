public class MediaPlayerAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter() {
    }

    public MediaPlayerAdapter(TipoMedia tipoMedia) {
        if(!tipoMedia.equals(TipoMedia.MP3)){
            this.advancedMediaPlayer = new VideoMediaPlayer();
        }
    }

    @Override
    public void reproduzir(String nomeArquivo, TipoMedia tipoMedia) {
        System.out.println("Reproduzindo " + tipoMedia + ": " + nomeArquivo);
    }
}
