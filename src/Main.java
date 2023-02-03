public class Main {
    public static void main(String[] args) {
        Device d1=new Device();
//        System.out.println(d1);
        Device d2=new Device();
        Device d3=new Device();
        Device d4=new Device();
        Device d5=new Device();
        Device d6=new Device();
        Device d7=new Device();

//        Data data=new Data("Confusing");
//        d1.setData(data);

        Connection c1=new Connection(d1,d2);
        Connection c2=new Connection(d2,d3);
        Connection c3=new Connection(d3,d4);
        Connection c4=new Connection(d4,d5);

        CNetwork c= new CNetwork();
        c.setConnectionList(c1);
        c.setConnectionList(c2);
        c.setConnectionList(c3);
        c.setConnectionList(c4);
//
        c.connetedDevice(c1);
        c.connetedDevice(c2);
        c.connetedDevice(c3);
        c.connetedDevice(c4);
//
        c.setDeviceList(d1);
        c.setDeviceList(d2);
        c.setDeviceList(d3);
        c.setDeviceList(d4);
        c.setDeviceList(d5);
        c.setDeviceList(d6);
        c.setDeviceList(d7);


//        c.dataTransfer(d1,d3);
//        System.out.println(d3.getData());


        for(Device div : c.deviceList){
            System.out.println(div+" , ");
        }
//        c.deleteDevice(d1);
        c.deleteDevice(d4);
        System.out.println("After delete a device");
        for(Device div : c.deviceList){
            System.out.print(div+" , ");
        }
        System.out.println();
        for(Connection con : c.connectionList){
            System.out.print(con+" , ");
        }

//
//


    }
}
