package org.melkweg.handler.async.condition;

import org.melkweg.annotation.MelkwegHandler;
import org.melkweg.handle.async.AsyncConditionFncHandlerWrapper;
import org.melkweg.param.ParamWrapper;
import org.melkweg.test.syncBaseTest.ConditionTest;

@MelkwegHandler(name = "async_condition_handle_3")
public class AsyncConditionHandler3 extends AsyncConditionFncHandlerWrapper.ConditionHandler {

    public AsyncConditionHandler3(String name) {
        super(name);
    }

    @Override
    public boolean condition(ParamWrapper params) {
        String testOne = params.getContextParam("condition_3");
        if(ConditionTest.CAN_GO.equals(testOne)){
            return true;
        }else{
            return false;
        }
    }
}
