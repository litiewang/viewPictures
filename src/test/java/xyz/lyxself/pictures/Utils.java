package xyz.lyxself.pictures;


import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;

import com.tencentcloudapi.cdb.v20170320.CdbClient;

import com.tencentcloudapi.cdb.v20170320.models.DescribeTablesRequest;
import com.tencentcloudapi.cdb.v20170320.models.DescribeTablesResponse;

public class Utils
{
  public static void main(String [] args) {
    try{
      
      Credential cred = new Credential("AKIDSfbGvJlGsEJp5fCLM6wVmmZ5KnzmmgnI", "C7boLbaMqwmnX0EDqF1Zz1m7C0XtRijq");
      
      HttpProfile httpProfile = new HttpProfile();
      httpProfile.setEndpoint("cdb.tencentcloudapi.com");
      
      ClientProfile clientProfile = new ClientProfile();
      clientProfile.setHttpProfile(httpProfile);
      
      CdbClient client = new CdbClient(cred, "ap-guangzhou", clientProfile);
      
      String params = "{\"InstanceId\":\"cdb-lwwl78gb\",\"Database\":\"kyoneword\"}";
      DescribeTablesRequest req = DescribeTablesRequest.fromJsonString(params, DescribeTablesRequest.class);
      
      DescribeTablesResponse resp = client.DescribeTables(req);
      
      System.out.println(DescribeTablesResponse.toJsonString(resp));
    } catch (TencentCloudSDKException e) {
      System.out.println(e.toString());
    }
    
  }
  
}
