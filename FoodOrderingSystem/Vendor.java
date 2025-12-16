public class Vendor {

    public Integer vendorId;
    public String name;
    public Vendor(Integer vendorId, String name) {
        this.vendorId = vendorId;
        this.name = name;
    }

    public Integer getVendorId() {
        return this.vendorId;
    }

    public String getName() {
        return this.name;
    }


}
