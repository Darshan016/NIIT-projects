public class Transmission {
    private String transmissionType;
    private String modelNo;
    private int noOfGears;

    public Transmission(String transmissionType, String modelNo, int noOfGears) {
        this.transmissionType = transmissionType;
        this.modelNo = modelNo;
        this.noOfGears = noOfGears;
    }

    public String getTransmissionType() {
        return transmissionType;
    }
    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }
    public String getModelNo() {
        return modelNo;
    }
    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }
    public int getNoOfGears() {
        return noOfGears;
    }
    public void setNoOfGears(int noOfGears) {
        this.noOfGears = noOfGears;
    }

    double[] gearRatio = new double[noOfGears];

    public double[] getGearRatio() {
        return gearRatio;
    }
    public void setGearRatio(double[] gearRatio) {
        this.gearRatio = gearRatio;
    }
    public void showSpecs(){
        System.out.println("Transmission Type = " + transmissionType);
        System.out.println("Transmission model No = " + modelNo);
        System.out.println();
        System.out.println("Key Specifications :");
        System.out.println("Forward Gears = " + noOfGears);
        for (int i = 0; i < noOfGears; i++) {
            System.out.println((i+1)+" Gear Ratio : "+ gearRatio[i]);
        }
    }
}