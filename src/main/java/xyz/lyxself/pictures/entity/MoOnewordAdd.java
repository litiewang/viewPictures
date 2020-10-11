package xyz.lyxself.pictures.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "d_oneword_add")
public class MoOnewordAdd {
  @Id
  String _id;
  String us;
  String danci;
  String fushu;
  String gkcipin;
  String lwdanci;
  String sjcipin;
  String tgc;
  String tgci;
  String tonggen;
  @Field("wdreaddc")
  JSONObject wdreaddcJson;
  @Transient
  String wdreaddc;
  String xzjxs;
  String xzwcs;
  String ybgqs;
}
