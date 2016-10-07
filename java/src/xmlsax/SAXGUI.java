package xmlsax;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class SAXGUI extends Frame implements ActionListener{
   
    private static final long serialVersionUID = 1L;
    public  Panel p1;
    public   Button button1;
    public   Button button2;
    public   Button button3;
    public   Button button4;
    public   Button button5;
    public   Button button6;
    public   TextArea text;
    public   int count=1;

 private void generateFlowLayoutPanel() {
       Color color1 = new Color(240,250,240);
       p1 = new Panel();
       p1.setLayout(null);
       p1.setBackground(color1);
       
       button1 = new Button("�����ִӸߵ���");
       button2 = new Button("��ʱ��Ӷ̵���");
       button3 = new Button("�������ڴ��絽��");
       button4 = new Button("2010�Ժ󷢲��ĸ����������ֽ���");
       button5 = new Button("��ѯʱ������4���ӵ�ǰ���׹����");
       button6 = new Button("ʱ��С��5���ӵ�������ߵ�ǰ������ҥ��");
       text=new TextArea();
       //layout      
       button1.setBounds(10, 10, 200, 30);
       button2.setBounds(10, 50, 200, 30);
       button3.setBounds(10, 90, 200, 30);
       button4.setBounds(10, 130, 200, 30);
       button5.setBounds(10, 170, 200, 30);
       button6.setBounds(10, 210, 200, 30);
       text.setBounds(240, 10, 500, 700);
       
       
       //add components
       
       p1.add(button1);
       p1.add(button2);
       p1.add(button3);
       p1.add(button4);
       p1.add(button5);
       p1.add(button6);
       p1.add(text);
   
       
    }
 
public SAXGUI(String panelName) {
       super("JAVA_SAX");
       generateFlowLayoutPanel(); 
       add(p1);
       setSize(800, 1000);   
       setLocation(100,100);
//��ť������Ӧ

       button1.addActionListener(this);  
       button2.addActionListener(this);  
       button3.addActionListener(this);  
       button4.addActionListener(this);  
       button5.addActionListener(this);  
       button6.addActionListener(this);  
      
//������Ӧ
addWindowListener(new WindowAdapter(){
           public void windowClosing(WindowEvent arg0) {
        	   System.exit(0);
           }
       });
    }

public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource().equals(button1)){
	  	String filename="output_3a_1_1.xml";
		    if ( filename.length() == 1 ) {
		      System.out.println("input: java MySAXApp ");
		      System.exit(0);
		    }
		    try {
		        // ��ʼ��reader
		        XMLReader reader = XMLReaderFactory.createXMLReader
		                          ("org.apache.xerces.parsers.SAXParser") ;
		        // ����ContentHandler��ʵ��
		        ContentHandler contentHandler = new MyContentHandler();
		        // ��reader��ע��ʵ������ContentHandler
		        reader.setContentHandler( contentHandler );
		        // ��ʼ�����ĵ�
		        reader.parse(filename);
		    } catch ( IOException e1 ) {
		        System.out.println("error in reading xmldocument: " + e1.getMessage());
		    } catch ( SAXException e1 ) {
		        System.out.println("error in parsing xmldocument: " + e1.getMessage());
		    }
		    
		    count=1;
		  text.setText(output(new File ("output_1.txt")));
	}
	if(e.getSource().equals(button2)){
	  	String filename="output_3a_1_2.xml";
		    if ( filename.length() == 1 ) {
		      System.out.println("input: java MySAXApp ");
		      System.exit(0);
		    }
		    try {
		        // ��ʼ��reader
		        XMLReader reader = XMLReaderFactory.createXMLReader
		                          ("org.apache.xerces.parsers.SAXParser") ;
		        // ����ContentHandler��ʵ��
		        ContentHandler contentHandler = new MyContentHandler();
		        // ��reader��ע��ʵ������ContentHandler
		        reader.setContentHandler( contentHandler );
		        // ��ʼ�����ĵ�
		        reader.parse(filename);
		    } catch ( IOException e1 ) {
		        System.out.println("error in reading xmldocument: " + e1.getMessage());
		    } catch ( SAXException e1 ) {
		        System.out.println("error in parsing xmldocument: " + e1.getMessage());
		    }
	
		    count=2;
		   text.setText(output(new File ("output_2.txt")));
	}
	if(e.getSource().equals(button3)){
	  	String filename="output_3a_1_3.xml";
		    if ( filename.length() == 1 ) {
		      System.out.println("input: java MySAXApp ");
		      System.exit(0);
		    }
		    try {
		        // ��ʼ��reader
		        XMLReader reader = XMLReaderFactory.createXMLReader
		                          ("org.apache.xerces.parsers.SAXParser") ;
		        // ����ContentHandler��ʵ��
		        ContentHandler contentHandler = new MyContentHandler();
		        // ��reader��ע��ʵ������ContentHandler
		        reader.setContentHandler( contentHandler );
		        // ��ʼ�����ĵ�
		        reader.parse(filename);
		    } catch ( IOException e1 ) {
		        System.out.println("error in reading xmldocument: " + e1.getMessage());
		    } catch ( SAXException e1 ) {
		        System.out.println("error in parsing xmldocument: " + e1.getMessage());
		    }
		    
		    count=3;
		    text.setText(output(new File ("output_3.txt")));
	}
	if(e.getSource().equals(button4)){
	  	String filename="output_3a_2_1.xml";
		    if ( filename.length() == 1 ) {
		      System.out.println("input: java MySAXApp ");
		      System.exit(0);
		    }
		    try {
		        // ��ʼ��reader
		        XMLReader reader = XMLReaderFactory.createXMLReader
		                          ("org.apache.xerces.parsers.SAXParser") ;
		        // ����ContentHandler��ʵ��
		        ContentHandler contentHandler = new MyContentHandler();
		        // ��reader��ע��ʵ������ContentHandler
		        reader.setContentHandler( contentHandler );
		        // ��ʼ�����ĵ�
		        reader.parse(filename);
		    } catch ( IOException e1 ) {
		        System.out.println("error in reading xmldocument: " + e1.getMessage());
		    } catch ( SAXException e1 ) {
		        System.out.println("error in parsing xmldocument: " + e1.getMessage());
		    }
		    
		    count=4;
		   text.setText(output(new File ("output_4.txt")));
	}
	if(e.getSource().equals(button5)){
	  	String filename="output_3a_2_2.xml";
		    if ( filename.length() == 1 ) {
		      System.out.println("input: java MySAXApp ");
		      System.exit(0);
		    }
		    try {
		        // ��ʼ��reader
		        XMLReader reader = XMLReaderFactory.createXMLReader
		                          ("org.apache.xerces.parsers.SAXParser") ;
		        // ����ContentHandler��ʵ��
		        ContentHandler contentHandler = new MyContentHandler();
		        // ��reader��ע��ʵ������ContentHandler
		        reader.setContentHandler( contentHandler );
		        // ��ʼ�����ĵ�
		        reader.parse(filename);
		    } catch ( IOException e1 ) {
		        System.out.println("error in reading xmldocument: " + e1.getMessage());
		    } catch ( SAXException e1 ) {
		        System.out.println("error in parsing xmldocument: " + e1.getMessage());
		    }
		    
		    count=5;
		    text.setText(output(new File ("output_5.txt")));
	}
	if(e.getSource().equals(button6)){
	  	String filename="output_3a_2_3.xml";
		    if ( filename.length() == 1 ) {
		      System.out.println("input: java MySAXApp ");
		      System.exit(0);
		    }
		    try {
		        // ��ʼ��reader
		        XMLReader reader = XMLReaderFactory.createXMLReader
		                          ("org.apache.xerces.parsers.SAXParser") ;
		        // ����ContentHandler��ʵ��
		        ContentHandler contentHandler = new MyContentHandler();
		        // ��reader��ע��ʵ������ContentHandler
		        reader.setContentHandler( contentHandler );
		        // ��ʼ�����ĵ�
		        reader.parse(filename);
		    } catch ( IOException e1 ) {
		        System.out.println("error in reading xmldocument: " + e1.getMessage());
		    } catch ( SAXException e1 ) {
		        System.out.println("error in parsing xmldocument: " + e1.getMessage());
		    }
		    
		    count=6;
		   text.setText(output(new File ("output_6.txt")));
	}
		  }



public void input(File f) throws IOException{
	f.createNewFile();
    FileOutputStream fileOutputStream = new FileOutputStream(f);
    PrintStream printStream = new PrintStream(fileOutputStream);
    System.setOut(printStream);
   
}
public String output(File f){
	 StringBuffer contents = new StringBuffer();//StringBuffer�� �ַ�������
     BufferedReader reader = null;//BufferedReader�ַ���  BufferedInputStream�ֽ���  
     try {
         reader = new BufferedReader(new FileReader(f));
         String text = null;
         
         //repeat until all lines is read
         while ((text = reader.readLine()) != null) {
             contents.append(text);
             contents.append(System.getProperty("line.separator"));//����һ������һ�����з�
         }
     } catch (FileNotFoundException e) {
         e.printStackTrace();
     } catch (IOException e) {
         e.printStackTrace();
     } finally {
         try {
             if (reader != null) {
                 reader.close();
             }
         }catch (IOException e) {
             e.printStackTrace();
         }
     } 
     return contents.toString();
   
  }

public static void main(String[] args) throws IOException, InterruptedException {
	SAXGUI yourFrame = new SAXGUI("sax of xml");
    yourFrame.setVisible(true);
    String filename ="out_1.txt";
    File file=new File(filename);
	yourFrame.input(file);
	Thread.currentThread().sleep(1500);
	yourFrame.text.setText(yourFrame.output(file));

  
}


}






































































































