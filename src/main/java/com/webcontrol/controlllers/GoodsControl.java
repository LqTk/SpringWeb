package com.webcontrol.controlllers;

import com.alibaba.fastjson.JSON;
import com.webcontrol.entities.GoodsInfoEntity;
import com.webcontrol.network.BaseInfo;
import com.webcontrol.network.NetworkApi;
import com.webcontrol.network.RetrofitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

@Controller
public class GoodsControl {
    @RequestMapping(value = "/getGoods",method = RequestMethod.POST)
    public String getGoods(int page, ModelMap modelMap){
        try {
            Response<BaseInfo> goodsInfo = getGoodsInfo(1);
            if (goodsInfo.isSuccessful()) {
                System.out.println("goodsInfoList=" + goodsInfo.body().getData().toString());
                List<GoodsInfoEntity> infoEntityList = JSON.parseArray(JSON.toJSONString(goodsInfo.body().getData()), GoodsInfoEntity.class);
                GoodsInfoEntity goodsInfoEntity = infoEntityList.get(0);
                modelMap.addAttribute("goodsInfoList", infoEntityList);
                return "goodsInfo";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    private Response<BaseInfo> getGoodsInfo(int page) throws IOException {
        NetworkApi networkApi = RetrofitService.getInstance().create(NetworkApi.class);
        HashMap map = new HashMap();
        map.put("page",page);
        return networkApi.getGoodsInfo(map).execute();
    }
}
