package org.melkweg.handler.sync.simple;

import org.melkweg.annotation.MelkwegHandler;
import org.melkweg.handle.sync.SyncSampleFnHandler;
import org.melkweg.param.ParamWrapper;

@MelkwegHandler(name = "base_test_handle1")
public class BaseTestHandler1 extends SyncSampleFnHandler {
    public BaseTestHandler1(String name) {
        super(name);
    }

    @Override
    public ParamWrapper handle(ParamWrapper params) {
        Integer item = params.getParam(Integer.class);
        params.setParam(item+1);
        return params;
    }
}
