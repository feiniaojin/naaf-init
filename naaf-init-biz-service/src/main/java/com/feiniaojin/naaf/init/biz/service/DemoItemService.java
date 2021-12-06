package com.feiniaojin.naaf.init.biz.service;

import com.feiniaojin.naaf.init.biz.service.dto.DemoItemQuery;
import com.feiniaojin.naaf.init.biz.service.dto.DemoItemView;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:qinyujie@gingo.cn">Yujie</a>
 * @version 0.1
 */
@Service
public class DemoItemService {

    public DemoItemView query(DemoItemQuery query) {
        DemoItemView demoItemView = new DemoItemView();
        demoItemView.setId(query.getId());
        demoItemView.setName("demoItemView" + query.getId());
        return demoItemView;
    }
}
