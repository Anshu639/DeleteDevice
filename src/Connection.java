public class Connection {
    private Device sourceDevice;
    private Device targetDevice;
    private int connectionID;
    private static int count = 0;

    public Connection(Device sourceDevice, Device targetDevice){
        this.sourceDevice = sourceDevice;
        this.targetDevice = targetDevice;
        count++;
        connectionID = count;
    }
    @Override
    public String toString() {
        return "Connection{" +
                "sourceDevice=" + sourceDevice +
                ", targetDevice=" + targetDevice +
                ", connectionID=" + connectionID +
                '}';
    }
    public int compareTo(Connection other){
        if(this.sourceDevice == other.sourceDevice &&
                this.targetDevice == other.targetDevice &&
                this.connectionID == other.connectionID) return 1;
        else return 0;
    }
    public Device getSourceDevice() {
        return sourceDevice;
    }
    public Device getTargetDevice() {
        return targetDevice;
    }
}

