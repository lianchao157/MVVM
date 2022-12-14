package com.meituan.demo.server.impl;

import com.meituan.demo.bean.MeiTuan_ShopCar_Bean;
import com.meituan.demo.mapper.MeiTuan_ShopCarMapepr;
import com.meituan.demo.server.MeiTuanShopCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class MeiTuan_ShopCarServiceImpl implements MeiTuanShopCarService {
    @Autowired
    private MeiTuan_ShopCarMapepr shopCarMapepr;


    @Override
    public List<MeiTuan_ShopCar_Bean> shopCar_beanList() {
        List<MeiTuan_ShopCar_Bean> list = new ArrayList<>();
        list = shopCarMapepr.selectallshopcar();
        if (null != list) {
            return list;
        } else {
            return null;
        }
    }

    @Override
    public List<MeiTuan_ShopCar_Bean> shopCar_beanListbyid(String userid) {
        List<MeiTuan_ShopCar_Bean> list = new ArrayList<>();
        System.out.println("userno!!!!!===" + userid);
        list = shopCarMapepr.selectbyid(Integer.parseInt(userid));
        if (null != list) {
            return list;
        } else {
            return null;
        }
    }

    @Override
    public boolean insertshopcar(int shopcar_id, int user_carid, String shopcardingdan, String shopcarname, int shopcarcounts, double shopcarprice,
                                 String shopcarimage, String shopcaryuliu, double shopcar_money, int shopcaryuliu0, int column_11) {
        System.out.println("!!!!!!!!!!" + shopcar_id);
        System.out.println("!!!!!!!!!!" + user_carid);
        System.out.println("!!!!!!!!!!" + shopcardingdan);
        System.out.println("!!!!!!!!!!" + shopcarname);
        System.out.println("!!!!!!!!!!" + shopcarcounts);
        System.out.println("!!!!!!!!!!" + shopcarprice);
        System.out.println("!!!!!!!!!!" + shopcarimage);
        System.out.println("!!!!!!!!!!" + shopcaryuliu);
        System.out.println("!!!!!!!!!!" + shopcar_money);
        System.out.println("!!!!!!!!!!" + shopcaryuliu0);
        System.out.println("!!!!!!!!!!" + column_11);

        List<MeiTuan_ShopCar_Bean> list = shopCarMapepr.selectbyid(Integer.parseInt(shopcar_id + ""));
        System.out.println(list + "=======================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getShopcar_id() + "==========did");
        }
//        if (list.size() > 0 || list != null || (!list.equals("")) || (!list.equals("[]")) ){


            if(!list.isEmpty()){
            System.out.println("????????????" + "?????????????????????");
            return false;
        } else if (list.size() == 0) {
            boolean resultnet = shopCarMapepr.Insertshopcar(shopcar_id, user_carid
                    , shopcardingdan, shopcarname, shopcarcounts, shopcarprice, shopcarimage, shopcaryuliu, shopcar_money, shopcaryuliu0, column_11);

            System.out.println("????????????");
            return true;
        } else {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
            return false;
        }

    }

    /***
     * ????????????
     * @param departments
     * @return
     * ??????????????????????????????????????????list
     * ???mabytis  foreach  ????????????
     */
    @Override
    public int inserlist(List<MeiTuan_ShopCar_Bean> departments) {

        System.out.println("!!!!!!!!!!" + departments.size());
        int resultcoutn = shopCarMapepr.insershopcarlist(departments);
        System.out.println("?????????????????????"+resultcoutn);
        if(resultcoutn>1){
            System.out.println(">"+"===="+resultcoutn);
        }
        else{
            System.out.println("<"+"===="+resultcoutn);
        }
        return 0;
    }

    /****
     * ????????????
     * @param
     * @return
     */
    public int deleteUserAllById(List<String> departments) {

        int resultcoutn = shopCarMapepr.deleteUserAllById(departments);
        return resultcoutn;
    }


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int deleteUserAllById(Map<String, List<String>> maps) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insertUserListPo(ArrayList<MeiTuan_ShopCar_Bean> userListPo) {
        return 0;
    }

    /***
     * ????????????
     * @param s
     * @return
     */
    @Override
    public int deleteUserAllByIdjjjj(String s) {

        List idList = new ArrayList();
        String[] strs = s.split(",");
        for (String str : strs) {
            idList.add(str);
        }
//        for (int  i=0; i<s.size(); i++){
//
//            System.out.println(s.get(i)+"???i???????????????");
//        }
        int resultcoutn = shopCarMapepr.deleteMeituanshopcarAll(idList);
        if(resultcoutn==0){
            System.out.println("?????????");
            return 1;
        }
        return 0;
    }


}
