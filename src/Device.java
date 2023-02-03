public class Device  {
    private String name;
    private int deviceID;
    private static int count=0;
//    private Data data;
    public Device(){
        count++;
        deviceID = count;
    }
//    public void setData(Data data) {
//        this.data = data;
//    }
//    public Data getData() {
//        return data;
//    }
    @Override
    public String toString() {
        return "Device{" +
                "deviceID=" + deviceID +
                '}';
    }
    public int compareTo(Device other){
        if (this.deviceID == other.deviceID) return 1;
        else return 0;
    }
}
