package xyz.lyxself.pictures;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class SaveDB<T> {
  
  
  public   void gson(JpaRepository<T,String> jpaRepository,Class cla , String jsonPath) {
    //	String jsonPath = "G:/weixin/demo.json";
    File file = new File(jsonPath);
    InputStream inputStream = null;
    InputStreamReader inputStreamReader = null;
    try {
    new ArrayList<>();
      inputStream = new FileInputStream(file);
      inputStreamReader = new InputStreamReader(inputStream);
      JsonReader jsonReader = new JsonReader(inputStreamReader);
      
      Gson gson = new Gson();
      
      Type type =   cla.getGenericSuperclass();
      List<T> mstus = gson.fromJson(jsonReader, type);
      jpaRepository.saveAll(mstus);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } finally {
      try {
        if (null != inputStream) {
          inputStream.close();
        }
        if (null != inputStreamReader) {
          inputStreamReader.close();
        }
      } catch (Exception e) {
      }
    }
  }
  
}
