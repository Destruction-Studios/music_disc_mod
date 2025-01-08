package net.ds.musicdiscs.item;

import net.ds.musicdiscs.MusicDiscs;
import net.ds.musicdiscs.sound.ModSounds;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item SICK_OF_IT_MUSIC_DISC = register(
            "sick_of_it_music_disc",
            ModSounds.SICK_OF_IT_KEY
    );

    public static final Item SPOOKY_SCARY_SKELETON_MUSIC_DISC = register(
            "spooky_scary_skeleton_music_disc",
            ModSounds.SPOOKY_SCARY_SKELETON_KEY
    );

    public static final Item COVER_ME_MUSIC_DISC = register(
            "cover_me_music_disc",
            ModSounds.COVER_ME_KEY
    );
    public static final Item POODLES_MUSIC_DISC = register(
            "poodles_music_disc",
            ModSounds.POODLES_KEY
    );


    public static Item register(String id, RegistryKey<JukeboxSong> songKey) {
        Identifier itemId = Identifier.of(MusicDiscs.MOD_ID, id);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, itemId);

        Item.Settings settings = new Item.Settings()
                .registryKey(key)
                .maxCount(1)
                .jukeboxPlayable(songKey)
                .rarity(Rarity.UNCOMMON);

        return Registry.register(Registries.ITEM, key, new Item(settings));
    }

    public static void initialize() {
        MusicDiscs.LOGGER.info("Registering Custom Items");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(SICK_OF_IT_MUSIC_DISC);
            fabricItemGroupEntries.add(SPOOKY_SCARY_SKELETON_MUSIC_DISC);
            fabricItemGroupEntries.add(POODLES_MUSIC_DISC);
            fabricItemGroupEntries.add(COVER_ME_MUSIC_DISC);
        });
    }
}