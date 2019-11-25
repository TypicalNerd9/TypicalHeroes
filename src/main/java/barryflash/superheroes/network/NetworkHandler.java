package barryflash.superheroes.network;

import barryflash.superheroes.Reference;
import barryflash.superheroes.network.Capabilities.MessageCapFloatToServer;
import barryflash.superheroes.network.Capabilities.MessageCapIntToServer;
import barryflash.superheroes.network.Capabilities.Antman.MessageAntmanGrow;
import barryflash.superheroes.network.Capabilities.Antman.MessageAntmanHelmetToTracking;
import barryflash.superheroes.network.Capabilities.Antman.MessageAntmanShrink;
import barryflash.superheroes.network.Capabilities.Batman.MessageBatmanGlideTickToTracking;
import barryflash.superheroes.network.Capabilities.Batman.MessageBatmanGlideToTracking;
import barryflash.superheroes.network.Capabilities.BlackWidow.MessageWidowBiteToTracking;
import barryflash.superheroes.network.Capabilities.Cyborg.MessageCyborgFlightToTracking;
import barryflash.superheroes.network.Capabilities.Cyborg.MessageCyborgLaserToTracking;
import barryflash.superheroes.network.Capabilities.Cyborg.MessageCyborgSonicCannonToTracking;
import barryflash.superheroes.network.Capabilities.Flash.MessagePhaseToTracking;
import barryflash.superheroes.network.Capabilities.Flash.MessageSuperSpeedToTracking;
import barryflash.superheroes.network.Capabilities.Flash.MessageTrailToTracking;
import barryflash.superheroes.network.Capabilities.Hawkeye.MessageHawkeyeClearGrappleEntitiesToTracking;
import barryflash.superheroes.network.Capabilities.Hawkeye.MessageHawkeyeGrappleEntitiesToTracking;
import barryflash.superheroes.network.Capabilities.Hawkeye.MessageHawkeyeRemoveGrappleEntitiesToTracking;
import barryflash.superheroes.network.Capabilities.Hulk.MessageHulkAlphaToTracking;
import barryflash.superheroes.network.Capabilities.Hulk.MessageHulkDetransformToTracking;
import barryflash.superheroes.network.Capabilities.Hulk.MessageHulkHAlphaToTracking;
import barryflash.superheroes.network.Capabilities.Hulk.MessageHulkHTransformToTracking;
import barryflash.superheroes.network.Capabilities.Hulk.MessageHulkSizeToTracking;
import barryflash.superheroes.network.Capabilities.Hulk.MessageHulkToTracking;
import barryflash.superheroes.network.Capabilities.Hulk.MessageHulkTransformToTracking;
import barryflash.superheroes.network.Capabilities.Ironman.MessageCannonLaserToTracking;
import barryflash.superheroes.network.Capabilities.Ironman.MessageIronmanCannonsToTracking;
import barryflash.superheroes.network.Capabilities.Ironman.MessageIronmanDaggerToTracking;
import barryflash.superheroes.network.Capabilities.Ironman.MessageIronmanFlight2ToTracking;
import barryflash.superheroes.network.Capabilities.Ironman.MessageIronmanFlight3ToTracking;
import barryflash.superheroes.network.Capabilities.Ironman.MessageIronmanFlightToTracking;
import barryflash.superheroes.network.Capabilities.Ironman.MessageIronmanFlyTickToTracking;
import barryflash.superheroes.network.Capabilities.Ironman.MessageIronmanKnockbackToTracking;
import barryflash.superheroes.network.Capabilities.Ironman.MessageIronmanLeftRepulsorToTracking;
import barryflash.superheroes.network.Capabilities.Ironman.MessageIronmanMissileToTracking;
import barryflash.superheroes.network.Capabilities.Ironman.MessageIronmanRepulsorsToTracking;
import barryflash.superheroes.network.Capabilities.Ironman.MessageIronmanRightRepulsorToTracking;
import barryflash.superheroes.network.Capabilities.Ironman.MessageIronmanShieldToTracking;
import barryflash.superheroes.network.Capabilities.Ironman.MessageIronmanSuitOffToTracking;
import barryflash.superheroes.network.Capabilities.Ironman.MessageIronmanSuitUpToTracking;
import barryflash.superheroes.network.Capabilities.Ironman.MessageIronmanUnibeamToTracking;
import barryflash.superheroes.network.Capabilities.Ironman.MessageLeftLaserToTracking;
import barryflash.superheroes.network.Capabilities.Ironman.MessageRightLaserToTracking;
import barryflash.superheroes.network.Capabilities.Ironman.MessageUnibeamLaserToTracking;
import barryflash.superheroes.network.Capabilities.Shazam.MessageShazamLightningToTracking;
import barryflash.superheroes.network.Capabilities.Shazam.MessageShazamShootBeamToTracking;
import barryflash.superheroes.network.Capabilities.Shazam.MessageShazamTransformToTracking;
import barryflash.superheroes.network.Capabilities.Superman.MessageSupermanFlightToTracking;
import barryflash.superheroes.network.Capabilities.Superman.MessageSupermanFlyTickToTracking;
import barryflash.superheroes.network.Capabilities.Superman.MessageSupermanHeatVisionToTracking;
import barryflash.superheroes.network.Capabilities.Superman.MessageSupermanLaserHeatVisionToTracking;
import barryflash.superheroes.network.Capabilities.Superman.MessageZodHeatVisionToTracking;
import barryflash.superheroes.network.Capabilities.Thor.MessageThorFlightToTracking;
import barryflash.superheroes.network.Capabilities.Thor.MessageThorLightningToTracking;
import barryflash.superheroes.network.Capabilities.Wasp.MessageWaspFlightToTracking;
import barryflash.superheroes.network.Capabilities.Wasp.MessageWaspFlyTickToTracking;
import barryflash.superheroes.network.Capabilities.Wasp.MessageWaspHelmetToTracking;
import barryflash.superheroes.network.Capabilities.Wasp.MessageWaspLeftBlastToTracking;
import barryflash.superheroes.network.Capabilities.Wasp.MessageWaspRightBlastToTracking;
import barryflash.superheroes.network.Capabilities.Wasp.MessageWaspShrink;
import barryflash.superheroes.network.Capabilities.WonderWoman.MessageWonderWomanBlastToTracking;
import barryflash.superheroes.network.Capabilities.WonderWoman.MessageWonderwomanBraceletsToTracking;
import barryflash.superheroes.network.Capabilities.WonderWoman.MessageWonderwomanTiaraToTracking;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.NetworkRegistry.TargetPoint;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class NetworkHandler {

	private static SimpleNetworkWrapper INSTANCE;
	
	public static void init() {
		INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MODID);
	
		INSTANCE.registerMessage(MessageExplode.class, MessageExplode.class, 0, Side.SERVER);
		INSTANCE.registerMessage(MessageThrowTiara.class, MessageThrowTiara.class, 1, Side.SERVER);
		INSTANCE.registerMessage(MessageLassoTrap.class, MessageLassoTrap.class, 2, Side.SERVER);
		INSTANCE.registerMessage(MessageBlock.class, MessageBlock.class, 3, Side.SERVER);
		INSTANCE.registerMessage(MessageLassoWhip.class, MessageLassoWhip.class, 4, Side.SERVER);
		INSTANCE.registerMessage(MessageCapeSpawn.class, MessageCapeSpawn.class, 5, Side.SERVER);
		INSTANCE.registerMessage(MessageRepulsor.class, MessageRepulsor.class, 6, Side.SERVER);
		INSTANCE.registerMessage(MessageIronManSuitUp.class, MessageIronManSuitUp.class, 7, Side.SERVER);
		INSTANCE.registerMessage(MessageRepulsorsActivate.class, MessageRepulsorsActivate.class, 8, Side.SERVER);
		INSTANCE.registerMessage(MessageSpawnCannonBlast.class, MessageSpawnCannonBlast.class, 9, Side.SERVER);
		INSTANCE.registerMessage(MessageKnockBackFists.class, MessageKnockBackFists.class, 10, Side.SERVER);
		INSTANCE.registerMessage(MessageSpawnMissiles.class, MessageSpawnMissiles.class, 11, Side.SERVER);
		INSTANCE.registerMessage(MessageUnibeam.class, MessageUnibeam.class, 12, Side.SERVER);
		INSTANCE.registerMessage(MessageLightning.class, MessageLightning.class, 13, Side.SERVER);
		INSTANCE.registerMessage(MessageSpacePortal.class, MessageSpacePortal.class, 14, Side.SERVER);
		INSTANCE.registerMessage(MessageDoctorStrangeBeam.class, MessageDoctorStrangeBeam.class, 15, Side.SERVER);
		INSTANCE.registerMessage(MessageIronmanSuitOff.class, MessageIronmanSuitOff.class, 16, Side.SERVER);
		INSTANCE.registerMessage(MessageShrink.class, MessageShrink.class, 17, Side.SERVER);
		INSTANCE.registerMessage(MessageWaspBlast.class, MessageWaspBlast.class, 18, Side.SERVER);
		INSTANCE.registerMessage(MessageWaspBlastSmall.class, MessageWaspBlastSmall.class, 19, Side.SERVER);
		INSTANCE.registerMessage(MessageGrow.class, MessageGrow.class, 20, Side.SERVER);
		INSTANCE.registerMessage(MessageGroundPound.class, MessageGroundPound.class, 21, Side.SERVER);
		INSTANCE.registerMessage(MessageBatarangSpawn.class, MessageBatarangSpawn.class, 22, Side.SERVER);
		INSTANCE.registerMessage(MessageRaytraceDamage.class, MessageRaytraceDamage.class, 23, Side.SERVER);
		INSTANCE.registerMessage(MessageLeap.class, MessageLeap.class, 24, Side.SERVER);
		INSTANCE.registerMessage(MessageGiantPunch.class, MessageGiantPunch.class, 25, Side.SERVER);
		INSTANCE.registerMessage(MessageGiantBreakBlock.class, MessageGiantBreakBlock.class, 26, Side.SERVER);
		INSTANCE.registerMessage(MessageCapToServer.class, MessageCapToServer.class, 27, Side.SERVER);
		INSTANCE.registerMessage(MessageIronmanCannonsToTracking.class, MessageIronmanCannonsToTracking.class, 28, Side.CLIENT);
		INSTANCE.registerMessage(MessageIronmanDaggerToTracking.class, MessageIronmanDaggerToTracking.class, 29, Side.CLIENT);
		INSTANCE.registerMessage(MessageIronmanFlightToTracking.class, MessageIronmanFlightToTracking.class, 30, Side.CLIENT);
		INSTANCE.registerMessage(MessageIronmanFlight2ToTracking.class, MessageIronmanFlight2ToTracking.class, 31, Side.CLIENT);
		INSTANCE.registerMessage(MessageIronmanFlight3ToTracking.class, MessageIronmanFlight3ToTracking.class, 32, Side.CLIENT);
		INSTANCE.registerMessage(MessageIronmanKnockbackToTracking.class, MessageIronmanKnockbackToTracking.class, 33, Side.CLIENT);
		INSTANCE.registerMessage(MessageIronmanLeftRepulsorToTracking.class, MessageIronmanLeftRepulsorToTracking.class, 34, Side.CLIENT);
		INSTANCE.registerMessage(MessageIronmanRightRepulsorToTracking.class, MessageIronmanRightRepulsorToTracking.class, 35, Side.CLIENT);
		INSTANCE.registerMessage(MessageIronmanMissileToTracking.class, MessageIronmanMissileToTracking.class, 36, Side.CLIENT);
		INSTANCE.registerMessage(MessageIronmanShieldToTracking.class, MessageIronmanShieldToTracking.class, 37, Side.CLIENT);
		INSTANCE.registerMessage(MessageIronmanSuitUpToTracking.class, MessageIronmanSuitUpToTracking.class, 38, Side.CLIENT);
		INSTANCE.registerMessage(MessageIronmanSuitOffToTracking.class, MessageIronmanSuitOffToTracking.class, 39, Side.CLIENT);
		INSTANCE.registerMessage(MessageIronmanUnibeamToTracking.class, MessageIronmanUnibeamToTracking.class, 40, Side.CLIENT);
		INSTANCE.registerMessage(MessageWaspFlightToTracking.class, MessageWaspFlightToTracking.class, 41, Side.CLIENT);
		INSTANCE.registerMessage(MessageWaspHelmetToTracking.class, MessageWaspHelmetToTracking.class, 42, Side.CLIENT);
		INSTANCE.registerMessage(MessageWaspLeftBlastToTracking.class, MessageWaspLeftBlastToTracking.class, 43, Side.CLIENT);
		INSTANCE.registerMessage(MessageWaspRightBlastToTracking.class, MessageWaspRightBlastToTracking.class, 44, Side.CLIENT);
		INSTANCE.registerMessage(MessageWaspShrink.class, MessageWaspShrink.class, 45, Side.CLIENT);
		INSTANCE.registerMessage(MessageAntmanGrow.class, MessageAntmanGrow.class, 46, Side.CLIENT);
		INSTANCE.registerMessage(MessageAntmanHelmetToTracking.class, MessageAntmanHelmetToTracking.class, 47, Side.CLIENT);
		INSTANCE.registerMessage(MessageAntmanShrink.class, MessageAntmanShrink.class, 48, Side.CLIENT);
		INSTANCE.registerMessage(MessageSupermanHeatVisionToTracking.class, MessageSupermanHeatVisionToTracking.class, 49, Side.CLIENT);
		INSTANCE.registerMessage(MessageSupermanFlightToTracking.class, MessageSupermanFlightToTracking.class, 50, Side.CLIENT);
		INSTANCE.registerMessage(MessageBatmanGlideToTracking.class, MessageBatmanGlideToTracking.class, 51, Side.CLIENT);
		INSTANCE.registerMessage(MessageWonderwomanBraceletsToTracking.class, MessageWonderwomanBraceletsToTracking.class, 52, Side.CLIENT);
		INSTANCE.registerMessage(MessageWonderwomanTiaraToTracking.class, MessageWonderwomanTiaraToTracking.class, 53, Side.CLIENT);
		INSTANCE.registerMessage(MessageBatmanGlideTickToTracking.class, MessageBatmanGlideTickToTracking.class, 54, Side.CLIENT);
		INSTANCE.registerMessage(MessageWaspFlyTickToTracking.class, MessageWaspFlyTickToTracking.class, 55, Side.CLIENT);
		INSTANCE.registerMessage(MessageSupermanFlyTickToTracking.class, MessageSupermanFlyTickToTracking.class, 56, Side.CLIENT);
		INSTANCE.registerMessage(MessageIronmanFlyTickToTracking.class, MessageIronmanFlyTickToTracking.class, 57, Side.CLIENT);
		INSTANCE.registerMessage(MessageCapIntToServer.class, MessageCapIntToServer.class, 58, Side.SERVER);
		INSTANCE.registerMessage(MessageIronmanRepulsorsToTracking.class, MessageIronmanRepulsorsToTracking.class, 59, Side.CLIENT);
		INSTANCE.registerMessage(MessageRightLaserToTracking.class, MessageRightLaserToTracking.class, 60, Side.CLIENT);
		INSTANCE.registerMessage(MessageLeftLaserToTracking.class, MessageLeftLaserToTracking.class, 61, Side.CLIENT);
		INSTANCE.registerMessage(MessageUnibeamLaserToTracking.class, MessageUnibeamLaserToTracking.class, 62, Side.CLIENT);
		INSTANCE.registerMessage(MessageCannonLaserToTracking.class, MessageCannonLaserToTracking.class, 63, Side.CLIENT);
		INSTANCE.registerMessage(MessageWonderWomanBlastToTracking.class, MessageWonderWomanBlastToTracking.class, 64, Side.CLIENT);
		INSTANCE.registerMessage(MessageSupermanLaserHeatVisionToTracking.class, MessageSupermanLaserHeatVisionToTracking.class, 65, Side.CLIENT);
		INSTANCE.registerMessage(MessageUpdateSmeltingCrucible.class, MessageUpdateSmeltingCrucible.class, 66, Side.CLIENT);
		INSTANCE.registerMessage(MessageRequestUpdateSmeltingCrucible.class, MessageRequestUpdateSmeltingCrucible.class, 67, Side.SERVER);
		INSTANCE.registerMessage(MessageSuitMakerCraft.class, MessageSuitMakerCraft.class, 68, Side.SERVER);
		INSTANCE.registerMessage(MessageZeusAltar.class, MessageZeusAltar.class, 69, Side.SERVER);
		INSTANCE.registerMessage(MessageUpdateZeusAltarCap.class, MessageUpdateZeusAltarCap.class, 70, Side.CLIENT);
		INSTANCE.registerMessage(MessageUpdateDnaExtractor.class, MessageUpdateDnaExtractor.class, 71, Side.CLIENT);
		INSTANCE.registerMessage(MessageRequestUpdateDnaExtractor.class, MessageRequestUpdateDnaExtractor.class, 72, Side.SERVER);
		INSTANCE.registerMessage(MessageFuelGeneratorAddConnection.class, MessageFuelGeneratorAddConnection.class, 73, Side.SERVER);
		INSTANCE.registerMessage(MessageFuelGeneratorAddConnectionClient.class, MessageFuelGeneratorAddConnectionClient.class, 74, Side.CLIENT);
		INSTANCE.registerMessage(MessageFuelGeneratorPlayer.class, MessageFuelGeneratorPlayer.class, 75, Side.SERVER);
		INSTANCE.registerMessage(MessageFuelGeneratorRemoveConnection.class, MessageFuelGeneratorRemoveConnection.class, 76, Side.CLIENT);
		INSTANCE.registerMessage(MessageFuelGeneratorRemoveConnectionServer.class, MessageFuelGeneratorRemoveConnectionServer.class, 77, Side.SERVER);
		INSTANCE.registerMessage(MessageHulkTransformToTracking.class, MessageHulkTransformToTracking.class, 78, Side.CLIENT);
		INSTANCE.registerMessage(MessageHulkDetransformToTracking.class, MessageHulkDetransformToTracking.class, 79, Side.CLIENT);
		INSTANCE.registerMessage(MessageHulkHTransformToTracking.class, MessageHulkHTransformToTracking.class, 80, Side.CLIENT);
		INSTANCE.registerMessage(MessageHulkToTracking.class, MessageHulkToTracking.class, 81, Side.CLIENT);
		INSTANCE.registerMessage(MessageShazamLightningToTracking.class, MessageShazamLightningToTracking.class, 82, Side.CLIENT);
		INSTANCE.registerMessage(MessageShazamShootBeamToTracking.class, MessageShazamShootBeamToTracking.class, 83, Side.CLIENT);
		INSTANCE.registerMessage(MessageShazamTransformToTracking.class, MessageShazamTransformToTracking.class, 84, Side.CLIENT);
		INSTANCE.registerMessage(MessageHulkAlphaToTracking.class, MessageHulkAlphaToTracking.class, 85, Side.CLIENT);
		INSTANCE.registerMessage(MessageHulkSizeToTracking.class, MessageHulkSizeToTracking.class, 86, Side.CLIENT);
		INSTANCE.registerMessage(MessageHulkHAlphaToTracking.class, MessageHulkHAlphaToTracking.class, 87, Side.CLIENT);
		INSTANCE.registerMessage(MessageCapFloatToServer.class, MessageCapFloatToServer.class, 88, Side.SERVER);
		INSTANCE.registerMessage(MessageExplosion.class, MessageExplosion.class, 89, Side.SERVER);
		INSTANCE.registerMessage(MessageCapToClient.class, MessageCapToClient.class, 90, Side.CLIENT);
		INSTANCE.registerMessage(MessageSetBoundingBox.class, MessageSetBoundingBox.class, 91, Side.SERVER);
		INSTANCE.registerMessage(MessageShootingPlayerToClient.class, MessageShootingPlayerToClient.class, 92, Side.CLIENT);
		INSTANCE.registerMessage(MessageSpeedAttribute.class, MessageSpeedAttribute.class, 93, Side.SERVER);
		INSTANCE.registerMessage(MessageRemoveSpeedAttribute.class, MessageRemoveSpeedAttribute.class, 94, Side.SERVER);
		INSTANCE.registerMessage(MessageSlowMo.class, MessageSlowMo.class, 95, Side.SERVER);
		INSTANCE.registerMessage(MessageUpdateBullet.class, MessageUpdateBullet.class, 96, Side.CLIENT);
		INSTANCE.registerMessage(MessageUpdateFusionChamber.class, MessageUpdateFusionChamber.class, 97, Side.CLIENT);
		INSTANCE.registerMessage(MessageRequestUpdateFusionChamber.class, MessageRequestUpdateFusionChamber.class, 98, Side.SERVER);
		INSTANCE.registerMessage(MessageSpawnBlackWidowBite.class, MessageSpawnBlackWidowBite.class, 99, Side.SERVER);
		INSTANCE.registerMessage(MessageSetAttributes.class, MessageSetAttributes.class, 100, Side.SERVER);
		INSTANCE.registerMessage(MessageReflect.class, MessageReflect.class, 101, Side.SERVER);
		INSTANCE.registerMessage(MessageSuperSpeedToTracking.class, MessageSuperSpeedToTracking.class, 106, Side.CLIENT);
		INSTANCE.registerMessage(MessagePhaseToTracking.class, MessagePhaseToTracking.class, 103, Side.CLIENT);
		INSTANCE.registerMessage(MessageWidowBiteToTracking.class, MessageWidowBiteToTracking.class, 104, Side.CLIENT);
		INSTANCE.registerMessage(MessageTrailToTracking.class, MessageTrailToTracking.class, 105, Side.CLIENT);
		INSTANCE.registerMessage(MessageSetPosition.class, MessageSetPosition.class, 107, Side.SERVER);
		INSTANCE.registerMessage(MessageShooterToClient.class, MessageShooterToClient.class, 108, Side.CLIENT);
		INSTANCE.registerMessage(MessageGrappleContactToClient.class, MessageGrappleContactToClient.class, 109, Side.CLIENT);
		INSTANCE.registerMessage(MessageCutGrappleArrows.class, MessageCutGrappleArrows.class, 110, Side.SERVER);
		INSTANCE.registerMessage(MessageZodHeatVisionToTracking.class, MessageZodHeatVisionToTracking.class, 111, Side.CLIENT);
		INSTANCE.registerMessage(MessageCyborgLaserToTracking.class, MessageCyborgLaserToTracking.class, 112, Side.CLIENT);
		INSTANCE.registerMessage(MessageCyborgFlightToTracking.class, MessageCyborgFlightToTracking.class, 113, Side.CLIENT);
		INSTANCE.registerMessage(MessageThorLightningToTracking.class, MessageThorLightningToTracking.class, 114, Side.CLIENT);
		INSTANCE.registerMessage(MessageThorFlightToTracking.class, MessageThorFlightToTracking.class, 115, Side.CLIENT);
		INSTANCE.registerMessage(MessageCyborgSonicCannonToTracking.class, MessageCyborgSonicCannonToTracking.class, 116, Side.CLIENT);
		INSTANCE.registerMessage(MessageHawkeyeGrappleEntitiesToTracking.class, MessageHawkeyeGrappleEntitiesToTracking.class, 117, Side.CLIENT);
		INSTANCE.registerMessage(MessageHawkeyeRemoveGrappleEntitiesToTracking.class, MessageHawkeyeRemoveGrappleEntitiesToTracking.class, 118, Side.CLIENT);
		INSTANCE.registerMessage(MessageHawkeyeClearGrappleEntitiesToTracking.class, MessageHawkeyeClearGrappleEntitiesToTracking.class, 119, Side.CLIENT);
		INSTANCE.registerMessage(MessageFusionChamberUpdateGas.class, MessageFusionChamberUpdateGas.class, 120, Side.SERVER);
		INSTANCE.registerMessage(MessageFusionChamberEnergyUpdate.class, MessageFusionChamberEnergyUpdate.class, 121, Side.SERVER);
		INSTANCE.registerMessage(MessageQuiverToServer.class, MessageQuiverToServer.class, 122, Side.SERVER);
		INSTANCE.registerMessage(MessageQuiverSendToClient.class, MessageQuiverSendToClient.class, 123, Side.CLIENT);
		INSTANCE.registerMessage(MessageAddItemStackToInventoryServer.class, MessageAddItemStackToInventoryServer.class, 124, Side.SERVER);
		INSTANCE.registerMessage(MessageAddSuitToInventoryServer.class, MessageAddSuitToInventoryServer.class, 125, Side.SERVER);
		INSTANCE.registerMessage(MessageUpdateLightningExtractor.class, MessageUpdateLightningExtractor.class, 126, Side.CLIENT);
		INSTANCE.registerMessage(MessageRequestUpdateLightningExtractor.class, MessageRequestUpdateLightningExtractor.class, 127, Side.SERVER);
	}
	
	public static void sendToServer(IMessage message) {
		INSTANCE.sendToServer(message);
	}
	public static void sendTo(IMessage message, EntityPlayerMP player){
        INSTANCE.sendTo(message, player);
    }
	public static void sendToTracking(IMessage message, EntityPlayer player){
        INSTANCE.sendToAllTracking(message, player);
    }
	public static void sendToAllAround(IMessage message, TargetPoint point){
        INSTANCE.sendToAllAround(message, point);
    }
}
	