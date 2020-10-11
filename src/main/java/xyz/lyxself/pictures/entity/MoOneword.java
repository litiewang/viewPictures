package xyz.lyxself.pictures.entity;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "d_oneword")
public class MoOneword {
  
  @Id
  String _id;
  String danci;
  String ciyi;
  String uk;
  String gaokao;
  String kaoyan;
  String liuji;
  String siji;
  String liju;
  String lijufanyi;
  @Transient
  String zhangwo;
  
  @Field("zhangwo")
  JSONObject zhangwoJson;
  @Transient
  String readdc;
  
  @Field("readdc")
  JSONObject readdcJson;
  
  String cipin;
  String ljcipin;
  String xuhao;
  String zhuji;
  String shucibj;
  JSONArray jinyicibx;
  JSONArray tonggenci;
  JSONArray cizu;
  JSONArray zhentiliju;
  String tongyici;
  String kygpc2000sc;
  Integer kygpc2000xh;
  String kygpc3000xh;
  String kygpc600xh;
  
  String kydgzimuxh;
  String kygpc2000;
  String kygpc3000;
  String kygpc600;
  String kygpc600sc;
  String undefined;
  String kygpc3000sc;
  
  String kydgzimusc;
  String kydgcipinsc;
  String kydgcipinxh;
  
}
