package com.webcontrol.controlllers;

import com.alibaba.fastjson.JSON;
import com.webcontrol.entities.LoginEntity;
import com.webcontrol.entities.UserEntity;
import com.webcontrol.network.BaseInfo;
import com.webcontrol.network.NetworkApi;
import com.webcontrol.network.RetrofitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class Login {
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView login(){
        return new ModelAndView("login","command",new UserEntity());
    }

    @RequestMapping(value = "/welcome",method = RequestMethod.POST)
    public String welcome2(UserEntity userEntity, final ModelMap modelMap){
        System.out.println("name="+ userEntity.getName());
        System.out.println("password="+ userEntity.getPassword());
        try {
            Response<BaseInfo> baseInfoResponse = doPost(userEntity.getName(), userEntity.getPassword());
            BaseInfo reslut = baseInfoResponse.body();
            Object data = reslut.getData();
            String string = JSON.toJSONString(data);
            LoginEntity loginEntity = JSON.parseObject(string,LoginEntity.class);
            System.out.println("stringObj==="+string);
            System.out.println("objectString==="+loginEntity.toString());
            modelMap.addAttribute("message",loginEntity);
            return "welcome";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public Response<BaseInfo> doPost(String name, String password) throws IOException {

        NetworkApi networkApi = RetrofitService.getInstance().create(NetworkApi.class);

        Map<String,String> params = new HashMap<>();
        params.put("name",name);
        params.put("password",password);
        return networkApi.login(params).execute();
    }

}
