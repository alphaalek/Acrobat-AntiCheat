package me.alek.honey.checks;

import me.alek.honey.player.AcrobatPlayer;
import me.alek.honey.checks.impl.flight.FlightA;
import me.alek.honey.netty.packet.type.PacketType;
import me.alek.honey.netty.packet.type.PacketTypeEnum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckRegistry {

    public enum CheckRegistryLibrary {

        FLIGHT(Flight.class);

        private final Class<? extends CheckRegistryDelegate> clazz;

        CheckRegistryLibrary(Class<? extends CheckRegistryDelegate> clazz) {
            this.clazz = clazz;
        }

        public Class<? extends CheckRegistryDelegate> getClazz() {
            return clazz;
        }
    }

    public interface CheckRegistryDelegate {

        Class<? extends ACCheck> getCheck();

        List<PacketTypeEnum> getPacketTypes();

    }

    public static Map<ACCheck, List<PacketTypeEnum>> createChecks(AcrobatPlayer player) {
        Map<ACCheck, List<PacketTypeEnum>> checks = new HashMap<>();

        for (Map.Entry<Class<? extends ACCheck>, List<PacketTypeEnum>> checkEntry : getChecks().entrySet()) {

            try {
                ACCheck check = checkEntry.getKey().getDeclaredConstructor(AcrobatPlayer.class).newInstance(player);

                checks.put(check, checkEntry.getValue());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return checks;
    }

    public static Map<Class<? extends ACCheck>, List<PacketTypeEnum>> getChecks() {
        Map<Class<? extends ACCheck>, List<PacketTypeEnum>> checks = new HashMap<>();

        for (CheckRegistryLibrary librarySection : CheckRegistryLibrary.values()) {

            Class<? extends CheckRegistryDelegate> clazz = librarySection.getClazz();

            for (CheckRegistryDelegate delegate : clazz.getEnumConstants()) {
                checks.put(delegate.getCheck(), delegate.getPacketTypes());
            }
        }
        return checks;
    }

    public enum Flight implements CheckRegistryDelegate {

        A(FlightA.class);

        private final Class<? extends ACCheck> check;

        Flight(Class<? extends ACCheck> check) {
            this.check = check;
        }

        @Override
        public Class<? extends ACCheck> getCheck() {
            return check;
        }

        @Override
        public List<PacketTypeEnum> getPacketTypes() {
            return Arrays.asList(
                    PacketType.Play.Client.POSITION,
                    PacketType.Play.Client.POSITION_LOOK,
                    PacketType.Play.Client.GROUND,
                    PacketType.Play.Client.FLYING
            );
        }
    }
}
