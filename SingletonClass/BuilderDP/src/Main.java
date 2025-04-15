public class Main {
    public static void main(String[] args) {
        Vehicle b = new VehicleBuilder()
                .getId(1)
                .getWheels(4)
                .getColor("Blue")
                .getName("audi")
                .getCarType("sedan")
                .getCarStorageType("HatchBack")
                .build();

        System.out.println(b.getName());
    }
}