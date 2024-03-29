package barryflash.superheroes.world.commands;

import java.util.Collections;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.google.common.collect.Lists;

import barryflash.superheroes.Reference;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

public class DimensionTeleportCommand extends CommandBase {



	
	 public DimensionTeleportCommand(){
	        aliases = Lists.newArrayList(Reference.MODID, "TP", "tpd");
	    }

	    private final List<String> aliases;

	    @Override
	    @Nonnull
	    public String getName() {
	        return "tpd";
	    }

	    @Override
	    @Nonnull
	    public String getUsage(@Nonnull ICommandSender sender) {
	        return "tpd <id>";
	    }
	    
	    @Override
	    @Nonnull
	    public List<String> getAliases() {
	        return aliases;
	    }

	    @Override
	    public void execute(@Nonnull MinecraftServer server, @Nonnull ICommandSender sender, @Nonnull String[] args) throws CommandException {
	        if (args.length < 1) {
	            return;
	        }
	        String s = args[0];
	        int dim;
	        try {
	            dim = Integer.parseInt(s);
	        } catch (NumberFormatException e) {
	            sender.sendMessage(new TextComponentString(TextFormatting.RED + "Error parsing dimension!"));
	            return;
	        }

	        if (sender instanceof EntityPlayer) {
	            DimensionTeleporter.teleportToDimension((EntityPlayer) sender, dim, 0, 100, 0);
	        }
	    }

	    @Override
	    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
	        return true;
	    }
	    @Override
	    @Nonnull
	    public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, @Nullable BlockPos targetPos) {
	        return Collections.emptyList();
	    }
	

}