public class CVT extends Automatic {
    public CVT(String transmissionType, String modelNo, int noOfGears) {
        super(transmissionType, modelNo, noOfGears);
    }
    @Override
    public void setGearRatio(double[] gearRatio) {
        super.setGearRatio(gearRatio);
    }

    @Override
    public double[] getGearRatio() {
        return super.getGearRatio();
    }

    @Override
    public void showSpecs() {
        super.showSpecs();
    }
}