package net.ds.musicdiscs.sound;

import net.ds.musicdiscs.MusicDiscs;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.client.sound.Sound;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent SICK_OF_IT = registerSoundEvent("sick_of_it");
    public static final RegistryKey<JukeboxSong> SICK_OF_IT_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MusicDiscs.MOD_ID, "sick_of_it"));

    public static final SoundEvent SPOOKY_SCARY_SKELETON = registerSoundEvent("spooky_scary_skeleton");
    public static final RegistryKey<JukeboxSong> SPOOKY_SCARY_SKELETON_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MusicDiscs.MOD_ID, "spooky_scary_skeleton"));

    public static final SoundEvent COVER_ME = registerSoundEvent("cover_me");
    public static final RegistryKey<JukeboxSong> COVER_ME_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MusicDiscs.MOD_ID, "cover_me"));

    public static final SoundEvent POODLES = registerSoundEvent("poodles");
    public static final RegistryKey<JukeboxSong> POODLES_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MusicDiscs.MOD_ID, "poodles"));

    public static final SoundEvent NEVER_GONNA_GIVE = registerSoundEvent("never_gonna_give");
    public static final RegistryKey<JukeboxSong> NEVER_GONNA_GIVE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(MusicDiscs.MOD_ID, "never_gonna_give"));

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(MusicDiscs.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void initialize() {
        MusicDiscs.LOGGER.info("Registering Custom Sounds");
    }
}