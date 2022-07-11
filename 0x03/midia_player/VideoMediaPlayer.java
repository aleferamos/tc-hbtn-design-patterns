public class VideoMediaPlayer implements AdvancedMediaPlayer {

    @Override
    public void reproduzirVlc(String nomeVideoVlc) {
        System.out.println("Reproduzindo VLC: " + nomeVideoVlc);
    }

    @Override
    public void reproduzirMp4(String nomeVideoMP4) {
        System.out.println("Reproduzindo MP4: " + nomeVideoMP4);
    }
}
