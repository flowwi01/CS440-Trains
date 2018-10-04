
public class trainPtr{

	// below variables come from locomotive data found on LCS PDI Command Ref.pdf page 17 ________________
	
	static String locoTyp; // 0 - 15, see page 13 of LCS PDI Command Ref.pdf
	static String conTyp; // Cab1, TMCC, R100, Legacy
	static String sndSysTyp; // NONE, RS, RSS, RSL
	static String clsSpec; // Engine Class Specification
	static String TSDBLeft; //Cab-2 ICONS on lower left soft key
	static String TSDBRight; //Cab-2 ICONS on lower right soft key
	static String runLvl; //Diesel Run Level
	static String lbrBias; // Loco Labor Adjustment Bias
	static String spdLim; // Speed limit setting
	static String mxSpd; // Max speed setting
	static String smkLvl; // Smoke level, Off, L, M, H
	static String ditLit; // Ditch Light operation control
	static String trnBrk; // Train break setting

	// ___________________________________________________________________________________________________
	
	static String name;
	static String location;
	static String direction;
	static int size;


	public trainPtr(String Name, int Size, String Location, String Direction) { //direction will be either right or left
		this.name = Name;
		this.location = Location;
		this.direction = Direction;
		this.size = Size;
	}

	public static String getName() {
		return name;
	}

	public static void location() {
		//TODO 
		//this method will be updated later once the map has been built
	}

	public static String getDirection() {
		return direction;
	}

	public static int getSize() {
		return size;
	}
	
	/**
	 * @return the locoTyp
	 */
	public static String getLocoTyp() {
		return locoTyp;
	}

	/**
	 * @param locoTyp the locoTyp to set
	 */
	public static void setLocoTyp(String locoTyp) {
		trainPtr.locoTyp = locoTyp;
	}

	/**
	 * @return the conTyp
	 */
	public static String getConTyp() {
		return conTyp;
	}

	/**
	 * @param conTyp the conTyp to set
	 */
	public static void setConTyp(String conTyp) {
		trainPtr.conTyp = conTyp;
	}

	/**
	 * @return the sndSysTyp
	 */
	public static String getSndSysTyp() {
		return sndSysTyp;
	}

	/**
	 * @param sndSysTyp the sndSysTyp to set
	 */
	public static void setSndSysTyp(String sndSysTyp) {
		trainPtr.sndSysTyp = sndSysTyp;
	}

	/**
	 * @return the clsSpec
	 */
	public static String getClsSpec() {
		return clsSpec;
	}

	/**
	 * @param clsSpec the clsSpec to set
	 */
	public static void setClsSpec(String clsSpec) {
		trainPtr.clsSpec = clsSpec;
	}

	/**
	 * @return the tSDBLeft
	 */
	public static String getTSDBLeft() {
		return TSDBLeft;
	}

	/**
	 * @param tSDBLeft the tSDBLeft to set
	 */
	public static void setTSDBLeft(String tSDBLeft) {
		TSDBLeft = tSDBLeft;
	}

	/**
	 * @return the tSDBRight
	 */
	public static String getTSDBRight() {
		return TSDBRight;
	}

	/**
	 * @param tSDBRight the tSDBRight to set
	 */
	public static void setTSDBRight(String tSDBRight) {
		TSDBRight = tSDBRight;
	}

	/**
	 * @return the runLvl
	 */
	public static String getRunLvl() {
		return runLvl;
	}

	/**
	 * @param runLvl the runLvl to set
	 */
	public static void setRunLvl(String runLvl) {
		trainPtr.runLvl = runLvl;
	}

	/**
	 * @return the lbrBias
	 */
	public static String getLbrBias() {
		return lbrBias;
	}

	/**
	 * @param lbrBias the lbrBias to set
	 */
	public static void setLbrBias(String lbrBias) {
		trainPtr.lbrBias = lbrBias;
	}

	/**
	 * @return the spdLim
	 */
	public static String getSpdLim() {
		return spdLim;
	}

	/**
	 * @param spdLim the spdLim to set
	 */
	public static void setSpdLim(String spdLim) {
		trainPtr.spdLim = spdLim;
	}

	/**
	 * @return the mxSpd
	 */
	public static String getMxSpd() {
		return mxSpd;
	}

	/**
	 * @param mxSpd the mxSpd to set
	 */
	public static void setMxSpd(String mxSpd) {
		trainPtr.mxSpd = mxSpd;
	}

	/**
	 * @return the smkLvl
	 */
	public static String getSmkLvl() {
		return smkLvl;
	}

	/**
	 * @param smkLvl the smkLvl to set
	 */
	public static void setSmkLvl(String smkLvl) {
		trainPtr.smkLvl = smkLvl;
	}

	/**
	 * @return the ditLit
	 */
	public static String getDitLit() {
		return ditLit;
	}

	/**
	 * @param ditLit the ditLit to set
	 */
	public static void setDitLit(String ditLit) {
		trainPtr.ditLit = ditLit;
	}

	/**
	 * @return the trnBrk
	 */
	public static String getTrnBrk() {
		return trnBrk;
	}

	/**
	 * @param trnBrk the trnBrk to set
	 */
	public static void setTrnBrk(String trnBrk) {
		trainPtr.trnBrk = trnBrk;
	}
}
