import com.fasterxml.jackson.core.JsonParseException;

import com.fasterxml.jackson.databind.JsonMappingException;

import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;

import java.util.Collection;
import java.util.HashMap;


public class JSONBuilder implements Builder {
public String fileName;
 public JSONBuilder(String fileName) {
	 this.fileName=fileName;
	 
 }
public JSONBuilder() {
	// TODO Auto-generated constructor stub
}
public Element document;
    
public final String bookJSONPath = "../book.json";

 
 public Element GetResult() {
  
 return document;
    }

 
   public void Build() {
  
      try {
         
   ObjectMapper mapper = new ObjectMapper();
  
         @SuppressWarnings("unchecked")
		HashMap<String, Object> map = mapper.readValue(new File(bookJSONPath),
  
                  HashMap.class);
            document = processMap(map);
       
 } catch (JsonParseException e) {
           
 e.printStackTrace();
      
  } catch (JsonMappingException e) {
     
       e.printStackTrace();
       
 } catch (IOException e) {
         
   e.printStackTrace();
        }
    }

  
  public Element BuildSection(HashMap<String, Object> map) {
    
    Section section = new Section((String)map.get("title"));
       
 @SuppressWarnings("unchecked")
Collection<HashMap<String, Object>> collection = (Collection<HashMap<String, Object>>)map.get("children");
Collection<HashMap<String, Object>> collection2 = collection;
Collection<HashMap<String, Object>> collection1 = collection2;
Collection<HashMap<String, Object>> collection21 = collection1;
Collection<HashMap<String, Object>> collection11 = collection21;
Collection<HashMap<String, Object>> children = collection11;
		Object e;
		HashMap<String, Object> childMap = null;
		

          
  Element e1 = this.processMap(childMap);
          
  if (e1 != null) {
             
   try {
                  
  section.addElm(e1);
           
     } catch (Exception var5) {
         
           var5.printStackTrace();
           
     }

  }
  
      return section;
 
   }


 public Element BuildParagraph(HashMap<String, Object> map) {
   
     return new Paragraf((String)map.get("text"));
    }

  
  public Element BuildImage(HashMap<String, Object> map) {
     
   return new Imagine((String)map.get("url"));
    }

   

    public Element BuildImageProxy(HashMap<String, Object> map) {
     
   return new ImageProxy((String)map.get("url"));
    }

   
    public Element BuildTable(HashMap<String, Object> map) {
       
 return new Tabel((String)map.get("text"));
    }

    
private Element processMap(HashMap<String, Object> map) {
      
  String classElement = (String)map.get("class");

       
 if("Section".equals(classElement))
            
return this.BuildSection(map);
       
 else if("Paragraph".equals(classElement))
    
        return this.BuildParagraph(map);
     
   else if("Image".equals(classElement))
           
 return this.BuildImage(map);
       
 else if("ImageProxy".equals(classElement))
       
     return this.BuildImageProxy(map);
     
   return null;
    }

}