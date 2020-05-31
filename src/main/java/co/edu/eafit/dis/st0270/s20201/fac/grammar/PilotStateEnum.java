package co.edu.eafit.dis.st0270.dyckcompiler.grammar;

public enum PilotStateEnum {

    I0(),
    I1(true),
    I2(),
    I3(),
    I4(true),
    I5(),
    I6(),
    I7(),
    I8(),
    I9(true),
    I10(true),
    I11(),
    I12(),
    I13(true),
    I14(true),
    I15(true),
    I16(true);

    private boolean reduction = false;

    PilotStateEnum(boolean reduction) {
	this.reduction = reduction;
    }

    PilotStateEnum() {
    }

    public boolean isAReductionState() {
	return reduction;
    }
}
