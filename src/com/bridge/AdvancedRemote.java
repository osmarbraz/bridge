package com.bridge;

/**
 * Controle remoto avançado.
 */
public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remoto: mutar");
        device.setVolume(0);
    }
}
