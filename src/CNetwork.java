import java.util.ArrayList;
import java.util.List;

public class CNetwork implements ANetwork {
    List<Device> deviceList;
    List<Connection> connectionList;
    List<Device> connectedDeviceList = new ArrayList<>();

    public CNetwork() {
        deviceList = new ArrayList<>();
        connectionList = new ArrayList<>();
    }
    public void setDeviceList(Device device) {
        deviceList.add(device);
    }
    public void setConnectionList(Connection connection) {
        connectionList.add(connection);
    }
    @Override
    public String toString() {
        return "CNetwork{" +
                "connectionList=" + connectionList +
                '}';
    }
    @Override
    public Device getSource(Connection con) {
        return con.getSourceDevice();
    }
    @Override
    public Device getTarget(Connection con) {
        return con.getTargetDevice();
    }
    public void connetedDevice(Connection con){
        Device s =getSource(con);
        Device t = getTarget(con);
        connectedDeviceList.add(s);
        connectedDeviceList.add(t);
    }
    public int checkDevice(Device device){
        int count =0;
        for (Device div: deviceList) {
            if(div.compareTo(device) == 1){
                count ++;
            }
        }
        if(count > 0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public boolean checkDeviceInNetwork(Device device) {
        for (Device d : deviceList) {
            for (Device n : connectedDeviceList) {
                if (d.compareTo(device) == 1 && n.compareTo(device) == 1) {
                    count++;
                }
            }
        }
        if (count > 0) {
            return true;
        }
        return false;
    }
    int count=0;
    public Connection searchConnection(Device device){
        for(Connection con: connectionList){
            if(getSource(con).compareTo(device) ==1  || getTarget(con).compareTo(device)==1){
                count++;
                return con;
            }
        }
        return null;
    }

    public void deleteDevice(Device device){
        if(checkDevice(device)==1){
            if(checkDeviceInNetwork(device)==true) {
                if (searchConnection(device) != null) {
                    deviceList.remove(device);
                    for(int i=1;i<=count;i++) {
                        connectionList.remove(searchConnection(device));
                    }
                    connectedDeviceList.remove(device);
                }
            }
            else{
                deviceList.remove(device);
            }
        }else {
            System.out.println("The device does not exits in network");
        }
    }

//    public void dataTransfer(Device source,Device target) {
//        if(checkDeviceInNetwork(source) == true && checkDeviceInNetwork(target) == true){
//            for(Connection con: connectionList){
//                if(getSource(con).compareTo(source) ==1) {
//                    if(getTarget(con).compareTo(target) ==1) {
//                        getTarget(con).setData(source.getData());
//                        break;
//                    } else{
//                        getTarget(con).setData(source.getData());
//                        dataTransfer(getTarget(con),target);
//                    }
//                }
//            }
//        }
//        else{
//            System.out.println("Cannot transfer data because device did not exist");
//        }
//    }
}
