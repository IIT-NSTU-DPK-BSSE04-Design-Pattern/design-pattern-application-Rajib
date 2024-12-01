package Beta;

public class Client {
    public static void main(String[] args) {
        XMLData xmlDataSoft = new XMLSoftware();

        JSONData xmlAdapter = new XMLToJSONDataAdapter(xmlDataSoft);

        xmlAdapter.readJSONData();
    }
}
