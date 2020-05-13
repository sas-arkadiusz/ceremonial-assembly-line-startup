package plc;

public class PLC {
	private PLCMode plcMode = PLCMode.DISABLED;

	public PLCMode getPlcMode() {
		return plcMode;
	}

	public void setPlcMode(PLCMode plcMode) {
		this.plcMode = plcMode;
	}
}
