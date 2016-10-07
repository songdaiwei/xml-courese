package xmlsax;

import java.awt.TextArea;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
public class MyContentHandler implements ContentHandler {
	public TextArea text;
    private StringBuffer buf;
    public void setDocumentLocator( Locator locator ) {
    }
    public void startDocument() throws SAXException {
        buf=new StringBuffer();
        System.out.println("*******start parsing the xml document*******");
       
    }
    public void endDocument() throws SAXException {
        System.out.println("*******end parsing the xml document*******");
    }
    public void processingInstruction( String target, String instruction )
        throws SAXException {
    }
    public void startPrefixMapping( String prefix, String uri ) {
          System.out.println("\nǰ׺ӳ��: " + prefix +" ��ʼ!"+ "  ����URI��:" + uri);
    }
    public void endPrefixMapping( String prefix ) {
          System.out.println("\nǰ׺ӳ��: "+prefix+" ����!");
    }

public void startElement( String namespaceURI, String localName,String fullName, Attributes attributes )throws SAXException {
    System.out.println("element: " + "["+fullName+"]" +" start parsing!");
    // ��ӡ��������Ϣ
    for ( int i = 0; i < attributes.getLength(); i++ ) {
      System.out.println("attribute_name:" + attributes.getLocalName(i)+ " attribute_value:" + attributes.getValue(i));
}
}
public void endElement( String namespaceURI, String localName,String fullName )throws SAXException {
  //��ӡ���ǿյ�Ԫ�����ݲ���StringBuffer���                  
  String nullStr="";
  if (!buf.toString().trim().equals(nullStr)){
    System.out.println("element_value: " + buf.toString().trim());
 }
  buf.setLength(0);
  //��ӡԪ�ؽ���������Ϣ
  //System.out.println("element: "+"["+fullName+"]"+" end parsing!");              
}
    public void characters( char[] chars, int start, int length )
                                throws SAXException {
          //��Ԫ�������ۼӵ�StringBuffer��                
          buf.append(chars,start,length);
    }
    public void ignorableWhitespace( char[] chars, int start, int length )
                                  throws SAXException {
    }
    public void skippedEntity( String name ) throws SAXException {
    }
}