package Beta;

public class XMLToJSONDataAdapter implements JSONData{
    private XMLData xmlData;

    public XMLToJSONDataAdapter(XMLData xmlData){
        this.xmlData = xmlData;
    }

    @Override
    public void readJSONData() {
        System.out.println("Converting XML data to JOSN data ");
    }
}
