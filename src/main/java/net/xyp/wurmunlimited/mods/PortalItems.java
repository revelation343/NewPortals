package net.xyp.wurmunlimited.mods;

import org.gotti.wurmunlimited.modloader.interfaces.*;
import com.wurmonline.server.*;
import com.wurmonline.server.items.*;
import java.io.*;

public class PortalItems implements WurmServerMod, ItemTypes, MiscConstants
{
	public PortalItems() {
		try {
			ItemTemplateCreator.createItemTemplate(4002, "Server Portal", "portals", "almost full", "somewhat occupied", "half-full", "emptyish", "This rudimentary structure made from stone bricks and logs is rumoured to lead to far away lands.", new short[] { 108, 25, 49, 31, 52, 44, 48, 67, 51, 86, 178 }, (short)60, (short)1, 0, 2419200L, 500, 500, 1000, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.structure.portal.8.", 1.0f, 2000000, (byte)15, 100, false);
			ItemTemplateCreator.createItemTemplate(4003, "Huge Server Portal", "portals", "almost full", "somewhat occupied", "half-full", "emptyish", "This impressive structure made from both known and leads to far away lands.", new short[] { 108, 25, 49, 31, 52, 44, 48, 67, 51, 178 }, (short)60, (short)1, 0, Long.MAX_VALUE, 500, 500, 1000, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.structure.portal.7.", 1.0f, 2000000, (byte)15, 100, false);
			ItemTemplateCreator.createItemTemplate(4004, 3, "Steel Server Portal", "portals", "superb", "good", "ok", "poor", "", new short[] { 108, 25, 49, 31, 52, 44, 48, 67, 51, 178 }, (short)60, (short)1, 0, Long.MAX_VALUE, 100, 100, 100, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.structure.portal.9.", 30.0f, 240000, (byte)57, 10000, false, -1);
			ItemTemplateCreator.createItemTemplate(4010, 3, "Dark Crystal Server Portal", "portals", "superb", "good", "ok", "poor", "", new short[] { 108, 25, 49, 31, 52, 44, 48, 67, 51, 178 }, (short)60, (short)1, 0, Long.MAX_VALUE, 100, 100, 100, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.structure.portal.3.", 30.0f, 240000, (byte)57, 10000, false, -1);
			ItemTemplateCreator.createItemTemplate(4011, 3, "Crystal Server Portal", "portals", "superb", "good", "ok", "poor", "", new short[] { 108, 25, 49, 31, 52, 44, 48, 67, 51, 178 }, (short)60, (short)1, 0, Long.MAX_VALUE, 100, 100, 100, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.structure.portal.4.", 30.0f, 240000, (byte)57, 10000, false, -1);
			ItemTemplateCreator.createItemTemplate(4015, 3, "Rift Server Portal", "portals", "superb", "good", "ok", "poor", "", new short[] { 108, 25, 49, 31, 52, 44, 48, 67, 51, 178 }, (short)60, (short)1, 0, Long.MAX_VALUE, 100, 100, 100, -10, MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY, "model.structure.portal.4.", 30.0f, 240000, (byte)57, 10000, false, -1);
			ItemTemplateCreator.createItemTemplate(4016, "Portal ring", "portal rings", "new", "fancy", "ok", "old", "A ring to put on your finger and go somewhere.", new short[] { 108, 147, 22, 44, 48, 87, 153 }, (short)249, (short)1, 0, 2419200L, 1, 2, 2, -10, new byte[] { 40, 39 }, "model.decoration.ring.", 40.0f, 50, (byte)0, 5000, true);
		}
		catch (IOException ex) {}
	}
}
