package xyz.lyxself.pictures;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ToJson {
  @Test
  public   void genetateJson(){
    String originPath= "E:/project/idea/kyoneword/data/source/";
    String orderPath= "E:/project/idea/kyoneword/data/jsonToDB/";
    File originFile = new File(originPath);
    File[] files = originFile.listFiles();
  
    if(files.length>0){
      for(int i=7;i<files.length;i++){
        File file = files[i];
        
        String filePath =  originPath+file.getName();
        String jsonPath  = orderPath+file.getName();
        genetateJsonFormatFile1(filePath,jsonPath);
        break;
      }
    }
    
  }
 
  public   void genetateJsonFormatFile1(String originPath,String orderPath){
    File file = new File(originPath);
    
    BufferedReader br = null;
    BufferedWriter out = null;
    try {
      File fileCreate = new File(orderPath);
      if(!fileCreate.exists()){
        fileCreate.createNewFile();
      }
      out = new BufferedWriter(
          new OutputStreamWriter(new FileOutputStream(fileCreate,true),"utf-8"));
     
      
      InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
      br = new BufferedReader(isr);
      String line = null;
      String filterLine = null;
      int i =0;
      while((line = br.readLine())!=null){
  
        i++;
        JSONObject jsonObject = JSON.parseObject(line);
        // 过滤第一个{，剩下的按照要求在{下追加“,”
        jsonObject.put("zhangwo",new JSONObject());
       // jsonObject.put("_id",i);
        jsonObject.remove("_id");
        line= jsonObject.toJSONString();
        if(null != filterLine){
          out.write(filterLine + "\r\n");
        }else{
          out.write(line + "\r\n");
        }
       
      }
      
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
  public static String captureName(String name) {
    name = name.substring(0, 1).toUpperCase() + name.substring(1);
    return  name;
    
  }
}
