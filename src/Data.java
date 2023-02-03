public class Data {
    private  int dataId;
    private String value;
    private static int count=0;

    public Data(String value) {
        this.value=value;
        count++;
        dataId=count;
    }
    @Override
    public String toString() {
        return "Data{" +
                "dataId=" + dataId +
                ", value='" + value + '\'' +
                '}';
    }
}
