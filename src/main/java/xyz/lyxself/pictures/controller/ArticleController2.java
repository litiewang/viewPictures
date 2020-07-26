package xyz.lyxself.pictures.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.lyxself.pictures.dao.OnewordDao;
import xyz.lyxself.pictures.entity.Article;
import xyz.lyxself.pictures.entity.Oneword;
import xyz.lyxself.pictures.service.ArticleService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("oneword")
@CrossOrigin(value = "*", allowCredentials = "true")
public class ArticleController2 {
    @Autowired
    OnewordDao dao;

           @GetMapping("/test")
            public boolean findById(){
            String jsonPath="G:/weixin/test.json";
            File file=new File(jsonPath);
            InputStreamReader isr=null;
            BufferedReader bufferedReader=null;
            try{
            isr=new InputStreamReader(new FileInputStream(file), "utf-8");
            bufferedReader = new BufferedReader(isr);

            JSONReader reader=new JSONReader(bufferedReader);
            reader.startArray();
            //	reader.startObject();
                List<Oneword> list = new ArrayList<>();
            while(reader.hasNext()) {
              //  String str = ;
                //   if(str.indexOf("Infinit") < 0){
                 //  Oneword oneword= ;
                  list.add(JSONObject.parseObject(reader.readString(), Oneword.class));
                if (list.size() > 1000) {
                    dao.saveAll(list);
                    list.clear();
                }
            }
         //   }
                if(list.size()>0)
                dao.saveAll(list);
            reader.endArray();
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
	return true;
}
}
