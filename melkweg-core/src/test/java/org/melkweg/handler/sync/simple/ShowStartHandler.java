package org.melkweg.handler.sync.simple;

import org.melkweg.annotation.MelkwegHandler;
import org.melkweg.handle.sync.SyncSampleFnHandler;
import org.melkweg.param.ParamWrapper;

@MelkwegHandler(name = "show_start_handle")
public class ShowStartHandler extends SyncSampleFnHandler {
    public ShowStartHandler(String name) {
        super(name);
    }

    @Override
    public ParamWrapper handle(ParamWrapper params) {
        params.setContextParam("show_start",true);
        return params;
    }
}
