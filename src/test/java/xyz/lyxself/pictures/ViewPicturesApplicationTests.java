package xyz.lyxself.pictures;

import com.alibaba.fastjson.JSONReader;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.lyxself.pictures.dao.OnewordDao;
import xyz.lyxself.pictures.entity.Oneword;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ViewPicturesApplicationTests {

	@Autowired
	OnewordDao dao;
	@Test
	public  void gson( ){
		String jsonPath = "G:/weixin/test.json";
		//	String jsonPath = "G:/weixin/demo.json";
		File file = new File(jsonPath);
		InputStream inputStream = null;
		InputStreamReader inputStreamReader= null;
		try {
			
			inputStream = new FileInputStream(file);
			inputStreamReader = new InputStreamReader(inputStream);
			JsonReader jsonReader = new JsonReader(inputStreamReader);
			
			Gson gson = new Gson();
			Type type = new TypeToken<List<Oneword>>(){}.getType();
			
			List<Oneword> mstus=gson.fromJson(jsonReader,   type);
		 dao.saveAll(mstus);
		}  catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally{
			try {
				if(null != inputStream){
					inputStream.close();
				}
				if(null != inputStreamReader){
					inputStreamReader.close();
				}
			} catch (Exception e2) {
			}
		}
	}
	
	@Test
	public  void getOrderObjectsByClass( ){
		 String jsonPath = "G:/weixin/test.json";
	//	String jsonPath = "G:/weixin/demo.json";
		File file = new File(jsonPath);
		InputStreamReader isr = null;
		BufferedReader bufferedReader = null;
		try {
			isr = new InputStreamReader(new FileInputStream(file), "utf-8");
			bufferedReader = new BufferedReader(isr);

			JSONReader reader = new JSONReader(bufferedReader);
			reader.startArray();
		//	reader.startObject();
			while (reader.hasNext()) {
			String str = 	reader.readString();
			if(str.indexOf("+Infinity")<0){
				Oneword oneword=null;
				oneword = reader.readObject(Oneword.class);
				dao.save(oneword);
			}
			}
			reader.endArray();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally{
			try {
				if(null != isr){
					isr.close();
				}
				if(null != bufferedReader){
					bufferedReader.close();
				}
			} catch (Exception e2) {
			}
		}
	}

	/**
	 * 通过输入的路径originPath，读取originPath下的所有json文件；
	 * 在格式化之后，在另一个路径orderPath下生成同名的json文件名称；
	 *eg:C:\\Users\\Administrator\\Desktop\\readJson\\right\\User.json
	 */
	@Test
	public   void genetateJsonFormatFile(){
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
			int test1=0;
			int test2 =0 ;
			while(reader.hasNext()) {
 				dao.save(reader.readObject(Oneword.class));
			}
			//   }
//			if(list.size()>0){
//				dao.saveAll(list);
//			}

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
	}
	
}
