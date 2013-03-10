
package fisherman77.glacierice.common; //The package your mod is in

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.SidedProxy;
import fisherman77.glacierice.client.GlacierIceClientProxy;
import fisherman77.glacierice.common.blocks.BlockBlueGlacierIce;
import fisherman77.glacierice.common.blocks.BlockGreenGlacierIce;
import fisherman77.glacierice.common.gen.BiomeGenGlacier;
import fisherman77.glacierice.common.handlers.*;
import fisherman77.glacierice.common.tabs.TabGlacierIce;

@NetworkMod(clientSideRequired=true,serverSideRequired=true, //Whether client side and server side are needed
clientPacketHandlerSpec = @SidedPacketHandler(channels = {"GlacierIce" }, packetHandler = GlacierIceClientPacketHandler.class), //For clientside packet handling
serverPacketHandlerSpec = @SidedPacketHandler(channels = {}, packetHandler = GlacierIceServerPacketHandler.class)) //For serverside packet handling

//==========
//Mod Basics
//==========
@Mod(modid="GlacierIce",name="Glacier Ice",version="5.5")

public class GlacierIce {

@Instance("GlacierIce") //The instance, this is very important later on
public static GlacierIce instance = new GlacierIce();

@SidedProxy(clientSide = "fisherman77.glacierice.client.GlacierIceClientProxy", serverSide = "fisherman77.glacierice.common.GlacierIceCommonProxy") //Tells Forge the location of your proxies
public static GlacierIceCommonProxy proxy;

//BIOME
	//public static final BiomeGenBase GlacierBiome = new BiomeGenGlacier(24).setColor(0xb8fffc).setMinMaxHeight(0.0F,0.6F).setEnableSnow().setBiomeName("GlacierBiome");

//ZEUSCRAFT CREATIVE TAB
	public static CreativeTabs tabGlacierIce = new TabGlacierIce(CreativeTabs.getNextID(),"GlacierIce"); //Our custom creative tab's object

//BLOCKS (LIST)
	public static Block BlueGlacierIce = new BlockBlueGlacierIce(160);
	public static Block GreenGlacierIce = new BlockGreenGlacierIce(161);

	
@Init
public void InitGlacierIce(FMLInitializationEvent event){ //Your main initialization method
	
//MULTIPLAYER ABILITY
	NetworkRegistry.instance().registerGuiHandler(this, proxy); //Registers the class that deals with GUI data

//BLOCKS (METHOD)
	proxy.registerBlocks(); //Calls the registerBlocks method
	
//BIOME
	//GameRegistry.addBiome(GlacierBiome);
}
}