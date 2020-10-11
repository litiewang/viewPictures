package xyz.lyxself.pictures;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.lyxself.pictures.entity.MoOneword;

import javax.annotation.Resource;
import java.io.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SaveMongoDB {
  
  
  @Resource
  private MongoTemplate mongoTemplate;
  @Test
  public void saveMongoDB() {
    String originPath = "G:/weixin/basedata/json/";
    File originFile = new File(originPath);
    File[] files = originFile.listFiles();
  
    if (files.length > 0) {
      for (int i = 17; i < files.length; i++) {
        File file1 = files[i];
        String jsonPath = originPath + file1.getName();
        File file = new File(jsonPath);
        InputStreamReader isr=null;
        BufferedReader bufferedReader=null;
        try{
          isr=new InputStreamReader(new FileInputStream(file), "utf-8");
          bufferedReader = new BufferedReader(isr);
          JSONReader reader=new JSONReader(bufferedReader);
           save(reader);
          break;
        }catch(UnsupportedEncodingException e) {
          e.printStackTrace();
        } catch(
            FileNotFoundException e)
      
        {
          e.printStackTrace();
        } finally
      
        {
          try {
            if (null != isr) {
              isr.close();
            }
            if (null != bufferedReader) {
              bufferedReader.close();
            }
          } catch (Exception e2) {
          }
        }
      
      }
    
    }
    
  }
  private void save(JSONReader reader){
    reader.startArray();
    while(reader.hasNext()) {
      String str = reader.readString();
      JSONObject jsonObject = JSON.parseObject(str);
      mongoTemplate.save(jsonObject.toJavaObject(MoOneword.class));
    }
  }
  
}
