package net.xyp.wurmunlimited.mods;

import org.gotti.wurmunlimited.modloader.interfaces.*;
import com.wurmonline.server.*;
import org.gotti.wurmunlimited.modsupport.actions.*;
import com.wurmonline.server.creatures.*;
import com.wurmonline.server.items.*;
import com.wurmonline.server.players.*;
import java.util.*;
import com.wurmonline.server.behaviours.*;

public class SameServerPortalAction implements WurmServerMod, ItemTypes, MiscConstants, ModAction, BehaviourProvider, ActionPerformer
{
	static short actionId;
	static ActionEntry actionEntry;

	public SameServerPortalAction() {
		SameServerPortalAction.actionId = (short)ModActions.getNextActionId();
		ModActions.registerAction(SameServerPortalAction.actionEntry = ActionEntry.createEntry(SameServerPortalAction.actionId, "Port", "Porting", new int[0]));
	}

	public BehaviourProvider getBehaviourProvider() {
		return (BehaviourProvider)this;
	}

	public ActionPerformer getActionPerformer() {
		return (ActionPerformer)this;
	}

	public short getActionId() {
		return SameServerPortalAction.actionId;
	}

	public List<ActionEntry> getBehavioursFor(final Creature performer, final Item source, final Item target) {
		return this.getBehavioursFor(performer, target);
	}

	public List<ActionEntry> getBehavioursFor(final Creature performer, final Item target) {
		final int clicked = target.getTemplateId();
		final int altData = target.getAuxData();
		if (!(performer instanceof Player)) {
			return null;
		}
		if (clicked != 4002 && clicked != 4003 && clicked != 4004 && clicked != 4010 && clicked != 4011 && clicked != 4016 && clicked != 4015) {
			return null;
		}
		if (altData == 1) {
			return Arrays.asList(SameServerPortalAction.actionEntry);
		}
		return null;
	}

	public boolean action(final Action act, final Creature performer, final Item source, final Item target, final short action, final float counter) {
		return this.action(act, performer, target, action, counter);
	}

	public boolean action(final Action act, final Creature performer, final Item target, final short action, final float counter) {
		try {
			final float tx = (float)(target.getData1() * 4);
			final float ty = (float)(target.getData2() * 4);
			final float tx2 = tx + 2.0f;
			final float ty2 = ty + 2.0f;
			final int layer = 0;
			final int floorLevel = performer.getFloorLevel();
			performer.setTeleportPoints(tx2, ty2, layer, floorLevel);
			performer.startTeleporting();
			performer.getCommunicator().sendNormalServerMessage("You feel a slight tingle in your spine.");
			performer.getCommunicator().sendTeleport(false, false, (byte)0);
			performer.teleport(true);
			performer.stopTeleporting();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
}
