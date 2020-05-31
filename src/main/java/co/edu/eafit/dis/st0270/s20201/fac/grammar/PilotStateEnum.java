package co.edu.eafit.dis.st0270.dyckcompiler.grammar;

public enum PilotStateEnum {

    I0(true),
    I1(true),
    I2(),
    I3(),
    I4(true),
    I5(true),
    I6(true),
    I7(true),
    I8(),
    I9(true),
    I10(true),
    I11(true),
    I12(true),
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
