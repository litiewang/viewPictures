package xyz.lyxself.pictures;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import org.json.JSONException;
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
import java.util.UUID;

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

	@Test
	public   void genetateJsonFormatFile1(){
		String originPath= "G:/weixin/database_export-5mrfm6xN7NwI.json";
		String orderPath= "G:/weixin/test.json";
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
