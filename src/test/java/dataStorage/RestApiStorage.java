package dataStorage;

import org.json.JSONObject;

import java.util.HashMap;

public class RestApiStorage {
    public JSONObject createBody(){
        /*
         {
                    "status":"success",
                    "data":{
                            "id":3,
                            "employee_name":"Ashton Cox",
                            "employee_salary":86000,
                            "employee_age":66,
                            "profile_image":""
                            },
                   "message":"Successfully! Record has been fetched."
               }
         */
        JSONObject js=new JSONObject();
        JSONObject inner=new JSONObject();
        inner.put("id",3);
        inner.put("employee_name","Ashton Cox");
        inner.put("employee_salary",86000);
        inner.put("employee_age",66);
        inner.put("profile_image","");
        js.put("status","success");
        js.put("data",inner);
        js.put("message","Successfully! Record has been fetched.");
        return js;

    }
    public HashMap createNewMap(){
        HashMap<String,Object> map=new HashMap<>();
        HashMap<String,Object> inner=new HashMap<>();
        inner.put("id",3.0);
        inner.put("employee_name","Ashton Cox");
        inner.put("employee_salary",86000.0);
        inner.put("employee_age",66.0);
        inner.put("profile_image","");
        map.put("status","success");
        map.put("data",inner);
        map.put("message","Successfully! Record has been fetched.");
        return map;

    }
    public  HashMap createBodyMap(Object title,Object body,Object userId,Object id){
        HashMap<String,Object> map=new HashMap<>();
        /*
         {
            "title":"Hasan",
            "body":"Hoscakal",
            "userId":10.0,
            "id":70.0
            }
         */
        map.put("title","Hasan");
        map.put("body","Hoscakal");
        map.put("userId",10.0);
        map.put("id",70.0);
        return map;
    }
    public HashMap createBodyMap(){
        /*
         {
            "status":"success",
            "data":{
                    "id":3,
                    "employee_name":"Ashton Cox",
                    "employee_salary":86000,
                    "employee_age":66,
                    "profile_image":""
                    },
            "message":"Successfully! Record has been fetched."
        }
         */
        HashMap<String,Object> mapinner=new HashMap<>();
        HashMap<String,Object> mapouter=new HashMap<>();
        mapinner.put("id",3.0);
        mapinner.put("employee_name","Ashton Cox");
        mapinner.put("employee_salary",86000.0);
        mapinner.put("employee_age",66.0);
        mapinner.put("profile_image","");
        mapouter.put("data",mapinner);
        mapouter.put("status","success");
        mapouter.put("message","Successfully! Record has been fetched.");
        return  mapouter;
    }
}
