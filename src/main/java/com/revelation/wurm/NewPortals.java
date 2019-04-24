package com.revelation.wurm;

import org.gotti.wurmunlimited.modloader.interfaces.*;
import com.wurmonline.server.items.*;
import com.wurmonline.server.*;
import org.gotti.wurmunlimited.modsupport.actions.*;

public class NewPortals implements WurmServerMod, PreInitable, ServerStartedListener, ItemTemplatesCreatedListener, ItemTypes, MiscConstants
{
	public void onItemTemplatesCreated() {
		new PortalItems();
	}

	public void onServerStarted() {
		ModActions.registerAction((ModAction)new SameServerPortalAction());
	}

	public void preInit() {
		ModActions.init();
	}
}
