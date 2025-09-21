package AbstractFactory.interfaces;

public interface GameEnvironment {
    void render();
    void playBackgroundMusic();
    void setWeatherEffect();
    String getEnvironmentType();
}
