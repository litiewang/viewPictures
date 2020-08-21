package xyz.lyxself.pictures;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GenetateJson {
  @Test
  public   void genetateJsonFormatFileBacth(){
    String originPath= "G:/weixin/basedata/source/";
    String orderPath= "G:/weixin/basedata/json/";
    File originFile = new File(originPath);
    File[] files = originFile.listFiles();
    
    if(files.length>0){
      for(int i=0;i<files.length;i++){
        File file = files[i];
        String str=	file.getName().substring(0,file.getName().indexOf('.'));
        System.out.print(captureName(str)+",");
        //	String filePath =  originPath+file.getName();
        //	String jsonPath  = orderPath+file.getName();
        //	genetateJsonFormatFile1(filePath,jsonPath);
      }
    }
  }
  public static String captureName(String name) {
    name = name.substring(0, 1).toUpperCase() + name.substring(1);
    return  name;
    
  }
  public   void genetateJsonFormatFile1(String originPath,String orderPath){
    File file = new File(originPath);
    
    BufferedReader br = null;
    BufferedWriter out = null;
    try {
      long position = 1;
      File fileCreate = new File(orderPath);
      if(!fileCreate.exists()){
        fileCreate.createNewFile();
      }
      out = new BufferedWriter(
          new OutputStreamWriter(new FileOutputStream(fileCreate,true),"utf-8"));
      out.write("[" + "\r\n");
      
      InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
      br = new BufferedReader(isr);
      String line = null;
      
      while((line = br.readLine())!=null){
        
        // 过滤第一个{，剩下的按照要求在{下追加“,”
        if((position == 0 && line.indexOf("{") > -1)){
          out.write(",");
          //position = 0;
        }else if((position !=0 && line.indexOf("{") > -1)){
          position = 0;
        }
        
        System.out.println(line);
        String filterLine = null;
        if(line.indexOf("ObjectId(") > 0){
          filterLine = line.replace("ObjectId(", "");
          if(filterLine.indexOf(")") > 0){
            filterLine = filterLine.replace(")", "");
          }
        }
        
        if(line.indexOf("NumberInt(") > 0){
          filterLine = line.replace("NumberInt(", "");
          if(filterLine.indexOf(")") > 0){
            filterLine = filterLine.replace(")", "");
          }
        }
        
        if(null != filterLine){
          out.write(filterLine + "\r\n");
        }else{
          out.write(line + "\r\n");
        }
        
      }
      
      
      out.write("]" + "\r\n");
    } catch (Exception e) {
      e.printStackTrace();
    }finally{
      try {
        if(br!=null){
          br.close();
        }
        if(out != null){
          out.close();
        }
      } catch (Exception e2) {
        e2.printStackTrace();
      }
    }
    
  }
}
