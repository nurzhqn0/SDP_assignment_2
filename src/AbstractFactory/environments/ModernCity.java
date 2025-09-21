package AbstractFactory.environments;

import AbstractFactory.interfaces.GameEnvironment;

public class ModernCity implements GameEnvironment {
    @Override
    public void render() {
        System.out.println("Rendering modern urban cityscape with skyscrapers");
    }

    @Override
    public void playBackgroundMusic() {
        System.out.println("Playing urban soundtrack with rock and electronic beats");
    }

    @Override
    public void setWeatherEffect() {
        System.out.println("Setting dynamic weather: rain, fog, and city lights");
    }

    @Override
    public String getEnvironmentType() {
        return "Modern Urban City";
    }
}