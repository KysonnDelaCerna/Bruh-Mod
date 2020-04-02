package com.KysonnDelaCerna.Bruh.world;

import java.util.Random;
import com.KysonnDelaCerna.Bruh.init.ModBlocks;
import net.minecraft.block.BlockFlower.EnumFlowerType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.biome.BiomeHills;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator {
	public static WorldGenTrees CHANN_TREE = new WorldGenTrees(false, 4, ModBlocks.CHANN_LOG.getDefaultState(), ModBlocks.CHANN_LEAVES.getDefaultState(), false);
	public static WorldGenFlowers RY_FLOWER = new WorldGenFlowers(ModBlocks.RY_FLOWER, EnumFlowerType.DANDELION);
	
	@Override
	public void generate (Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		if (world.provider.getDimension() == 0) {
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
			if (world.getBiomeForCoordsBody(new BlockPos(chunkX * 16, 70, chunkZ * 16)) instanceof BiomeHills) {
				generatePlant(CHANN_TREE, world, random, chunkX, chunkZ, 2);
			}
			if (world.getBiomeForCoordsBody(new BlockPos(chunkX * 16, 70, chunkZ * 16)) instanceof BiomeForest) {
				generatePlant(RY_FLOWER, world, random, chunkX, chunkZ, 1);
			}
		}
	}
	
	private void generateOverworld (Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		generateOre(ModBlocks.DEANIUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 10, 11, random.nextInt(4) + 1, 24);
	}
	
	private void generateOre (IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;
		
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}
	
	private void generatePlant (WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int amountPerChunk) {
		for (int i = 0; i < amountPerChunk; i++) {
			int x = chunkX * 16 + random.nextInt(16);
			int z = chunkZ * 16 + random.nextInt(16);
			int y = world.getChunkFromChunkCoords(x >> 4, z >> 4).getHeight(new BlockPos(x & 15, 0, z & 15));
			generator.generate(world, random, new BlockPos(x, y, z));
		}
	}
}
