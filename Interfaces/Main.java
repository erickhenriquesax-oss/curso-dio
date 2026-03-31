public class Main {
    public static void main(String[] args) {
        
        var musicPlayer = new MusicPlayer() {

            @Override
            public void pauseMusic() {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void playMusic() {
                System.out.println("Tocando a musica");
                
            }

            @Override
            public void stopMusic() {
                // TODO Auto-generated method stub
                
            }
        
        };

        var musicPlayer2 = new MusicPlayer() {

            @Override
            public void pauseMusic() {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void playMusic() {
                System.out.println("Tocando a musica");
                
            }

            @Override
            public void stopMusic() {
                // TODO Auto-generated method stub
                
            }
        
        };

        musicPlayer.playMusic();
        System.out.println("1".getClass());
        System.out.println(musicPlayer.getClass());
        System.out.println(musicPlayer2.getClass());
        

    }
}
