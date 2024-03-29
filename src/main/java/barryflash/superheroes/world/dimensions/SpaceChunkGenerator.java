package barryflash.superheroes.world.dimensions;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldEntitySpawner;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.MapGenCaves;
import net.minecraftforge.event.terraingen.InitMapGenEvent.EventType;
import net.minecraftforge.event.terraingen.TerrainGen;

public class SpaceChunkGenerator implements net.minecraft.world.gen.IChunkGenerator {
	
	private final World worldObj;
	private Random random;
	private Biome[] biomesForGeneration;
	
	private MapGenBase caveGenerator = new MapGenCaves();
	private SpaceTerrainGenerator terraingen = new SpaceTerrainGenerator();
	 public SpaceChunkGenerator(World worldObj) {
	        this.worldObj = worldObj;
	        long seed = worldObj.getSeed();
	        this.random = new Random((seed + 516) * 314);
	        terraingen.setup(worldObj, random);
	        caveGenerator = TerrainGen.getModdedMapGen(caveGenerator, EventType.CAVE);
	    }
	@Override
	public Chunk generateChunk(int x, int z) {
		 ChunkPrimer chunkprimer = new ChunkPrimer();

	        // Setup biomes for terraingen
	        this.biomesForGeneration = this.worldObj.getBiomeProvider().getBiomesForGeneration(this.biomesForGeneration, x * 4 - 2, z * 4 - 2, 10, 10);
	        terraingen.setBiomesForGeneration(biomesForGeneration);
	        terraingen.generate(x, z, chunkprimer);

	        // Setup biomes again for actual biome decoration
	        this.biomesForGeneration = this.worldObj.getBiomeProvider().getBiomes(this.biomesForGeneration, x * 16, z * 16, 16, 16);
	        // This will replace stone with the biome specific stones
	        

	        // Generate caves
	        this.caveGenerator.generate(this.worldObj, x, z, chunkprimer);

	        Chunk chunk = new Chunk(this.worldObj, chunkprimer, x, z);

	        byte[] biomeArray = chunk.getBiomeArray();
	        for (int i = 0; i < biomeArray.length; ++i) {
	            biomeArray[i] = (byte)Biome.getIdForBiome(this.biomesForGeneration[i]);
	        }

	        chunk.generateSkylightMap();
	        return chunk;
	    }


	@Override
	public void populate(int x, int z) {
		// TODO Auto-generated method stub
		 int i = x * 16;
	        int j = z * 16;
	        BlockPos blockpos = new BlockPos(i, 0, j);
	        Biome biome = this.worldObj.getBiome(blockpos.add(16, 0, 16));

	        // Add biome decorations (like flowers, grass, trees, ...)
	        biome.decorate(this.worldObj, this.random, blockpos);

	        // Make sure animals appropriate to the biome spawn here when the chunk is generated
	        WorldEntitySpawner.performWorldGenSpawning(this.worldObj, biome, i + 8, j + 8, 16, 16, this.random);

	}

	@Override
	public boolean generateStructures(Chunk chunkIn, int x, int z) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<SpawnListEntry> getPossibleCreatures(EnumCreatureType creatureType, BlockPos pos) {
		 // If you want normal creatures appropriate for this biome then uncomment the
        // following two lines:
       Biome biome = this.worldObj.getBiome(pos);
    return biome.getSpawnableList(creatureType);

	}

	@Override
	public void recreateStructures(Chunk chunkIn, int x, int z) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public BlockPos getNearestStructurePos(World worldIn, String structureName, BlockPos position,
			boolean findUnexplored) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isInsideStructure(World worldIn, String structureName, BlockPos pos) {
		// TODO Auto-generated method stub
		return false;
	}

}
