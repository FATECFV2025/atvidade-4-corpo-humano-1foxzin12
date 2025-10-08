package main.java;

public class CorpoHumano {
    // Atributos
    private float massa;
    private float volume;
    private float densidade;

    // Construtor
    public CorpoHumano(float massa, float volume, float densidade) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = densidade;
    }

    // Métodos Getters
    public float getMassa() {
        return massa;
    }

    public float getVolume() {
        return volume;
    }

    public float getDensidade() {
        return densidade;
    }

    // Métodos Setters
    public void setMassa(float massa) {
        this.massa = massa;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public void setDensidade(float densidade) {
        this.densidade = densidade;
    }
}
