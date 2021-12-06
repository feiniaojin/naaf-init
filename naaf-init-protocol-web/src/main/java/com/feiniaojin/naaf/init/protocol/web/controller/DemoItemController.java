package com.feiniaojin.naaf.init.protocol.web.controller;

import com.feiniaojin.naaf.init.biz.service.DemoItemService;
import com.feiniaojin.naaf.init.biz.service.dto.DemoItemQuery;
import com.feiniaojin.naaf.init.biz.service.dto.DemoItemView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author <a href="mailto:qinyujie@gingo.cn">Yujie</a>
 * @version 0.1
 */
@RestController
@RequestMapping("/demo")
public class DemoItemController {

    @Resource
    private DemoItemService demoItemService;

    @RequestMapping("/get")
    public DemoItemView getById(DemoItemQuery query) {

        return demoItemService.query(query);
    }

}
