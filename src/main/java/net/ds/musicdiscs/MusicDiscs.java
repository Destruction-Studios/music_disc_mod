package net.ds.musicdiscs;

import net.ds.musicdiscs.item.ModItems;
import net.ds.musicdiscs.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MusicDiscs implements ModInitializer {
	public static final String MOD_ID = "musicdiscs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		LOGGER.info("Loading Music Discs");
		ModItems.initialize();
		ModSounds.initialize();
		LOGGER.info("Music Discs Loaded!");
	}
}