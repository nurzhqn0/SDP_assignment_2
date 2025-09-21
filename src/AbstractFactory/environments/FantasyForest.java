package AbstractFactory.environments;

import AbstractFactory.interfaces.GameEnvironment;

public class FantasyForest implements GameEnvironment {
    @Override
    public void render() {
        System.out.println("Rendering mystical forest with ancient trees and floating magic particles");
    }

    @Override
    public void playBackgroundMusic() {
        System.out.println("Playing ethereal fantasy music with harps and flutes");
    }

    @Override
    public void setWeatherEffect() {
        System.out.println("Setting magical mist and glowing fireflies");
    }

    @Override
    public String getEnvironmentType() {
        return "Mystical Fantasy Forest";
    }
}
