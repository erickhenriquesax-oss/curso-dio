
public class App {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new Smartphone();
        runMusic(musicPlayer);
        runVideo((VideoPlayer) musicPlayer);

    }


    public static void runVideo(VideoPlayer videoPlayer){
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer){
        musicPlayer.playMusic();
    }
}

