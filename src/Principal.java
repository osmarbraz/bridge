
import com.bridge.remotes.AdvancedRemote;
import com.bridge.remotes.BasicRemote;
import com.bridge.devices.Device;
import com.bridge.devices.Radio;
import com.bridge.devices.Tv;

public class Principal {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Testes com o controle remoto basico.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Testes como controle remoto avancado.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
