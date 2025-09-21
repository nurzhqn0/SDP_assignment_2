package AbstractFactory.environments;

import AbstractFactory.interfaces.GameEnvironment;

public class SciFiSpaceStation implements GameEnvironment {
    @Override
    public void render() {
        System.out.println("Rendering futuristic space station with holographic displays");
    }

    @Override
    public void playBackgroundMusic() {
        System.out.println("Playing electronic ambient space music with synthesizers");
    }

    @Override
    public void setWeatherEffect() {
        System.out.println("Setting artificial gravity and neon lighting effects");
    }

    @Override
    public String getEnvironmentType() {
        return "Advanced Space Station";
    }
}