package acptTests;
import Fsen.Real;
import bridgeProject.BridgeProject;
import bridgeProject.BridgeProxy;
public abstract class Driver {

	public static BridgeProject getBridge() {
		BridgeProxy bridge = new BridgeProxy();
		bridge.setRealBridge(new Real()); // add real bridge here
		return bridge;
	}	
}