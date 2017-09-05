/*
=======================================================================
======*--------------*=======/-----\=====/-----\===/--------------\====
=====/                \======|     |=====|     |===|               \===
====/                  \=====|     |=====|     |===|     /---------/===
===/                    \====|     |=====|     |===|     |=============
==/                      \===|     \-----/     |===|     |=============
=/                        \==|                 |===|     |=============
=\                        /==|                 |===|     |=============
==\                      /===|     /-----\     |===|     |=============
===\                    /====|     |=====|     |===|     |=============
====\                  /=====|     |=====|     |===|     \---------\===
=====\                /======|     |=====|     |===|               /===
======*--------------*=======\-----/=====\-----/===\--------------/====
=======================================================================
*/

package misterpemodder.hc;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;

@Mod(
		modid = HCRefs.MOD_ID,
		name = HCRefs.MOD_NAME,
		version = HCRefs.MOD_VERSION,
		acceptedMinecraftVersions = HCRefs.ACCEPTED_MC_VERSIONS,
		acceptableRemoteVersions = "*"
	)
public class HexianCore {
	
	@Instance(HCRefs.MOD_ID)
	public static HexianCore instance;

}
