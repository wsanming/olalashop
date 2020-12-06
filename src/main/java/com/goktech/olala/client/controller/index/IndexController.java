package com.goktech.olala.client.controller.index;

import com.goktech.olala.core.resp.RespBrandVo;
import com.goktech.olala.core.resp.RespCategoryVo;
import com.goktech.olala.core.service.IActiveService;
import com.goktech.olala.core.service.IAdverService;
import com.goktech.olala.core.service.IArticleService;
import com.goktech.olala.core.service.IGoodCategory;
import com.goktech.olala.server.pojo.goods.Active;
import com.goktech.olala.server.pojo.goods.Adver;
import com.goktech.olala.server.pojo.goods.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author sanming
 * @Classname IndexController
 * @Description
 * @Date 2020/11/27 20:41
 */
@RestController
public class IndexController {

    @Autowired
    IArticleService articleService;

    @Autowired
    IActiveService activeService;

    @Autowired
    IAdverService adverService;


    @Autowired
    IGoodCategory goodCategory;


    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("redirect:index/init.do");
        return mav;
    }


    @RequestMapping("/index/init.do")
    public ModelAndView toIndex() {
        ModelAndView mav = new ModelAndView();
        List<Article> articles = articleService.selectAll();
        //将查询的热门头条list数据转发到首页
        mav.addObject("articleVoList", articles);

        List<Active> actives = activeService.selectAll();

        //将热门活动list数据转发
        mav.addObject("indexActivities", actives);


        List<Adver> advers = adverService.selectAll();

        mav.addObject("ctmAdvers", advers);


        List<RespCategoryVo> respCategoryVos = goodCategory.beTreeList();

        for (RespCategoryVo first:respCategoryVos) {
            List<RespBrandVo> brands = goodCategory.selectBrand();
            if(brands!=null){
                first.setBrandList(brands);
            }
        }

        mav.addObject("categoryList",respCategoryVos);

        mav.setViewName("home/index");
        return mav;
    }

}
