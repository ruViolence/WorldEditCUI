package org.enginehub.worldeditcui.fabric;

import com.viaversion.viaversion.protocols.protocol1_13to1_12_2.Protocol1_13To1_12_2;

public class ViaFabricPlusHook {
    public static void enable() {
        Protocol1_13To1_12_2.MAPPINGS.getChannelMappings().put("WECUI", "worldedit:cui");
    }
}
