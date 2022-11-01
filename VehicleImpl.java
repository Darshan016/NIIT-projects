public class VehicleImpl {
    public static void main(String[] args) {
        Manual manual = new Manual("Manual","MP6",6);
        manual.setGearRatio(new double[]{3.010,2.070,1.430,1.000,0.710,0.510});
        manual.showSpecs();
        System.out.println();

        Automatic automatic = new Automatic("Automatic Manual","AMTD5",5);
        automatic.setGearRatio(new double[]{2.950,1.940,1.340,1.000,0.630});
        automatic.showSpecs();
    }
}