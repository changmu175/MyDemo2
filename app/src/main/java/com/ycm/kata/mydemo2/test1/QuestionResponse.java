package com.ycm.kata.mydemo2.test1;

import com.ycm.kata.mydemo2.bean.Question;
import com.ycm.kata.networkmodule.model.ApiResult;

/**
 * Created by changmuyu on 2017/11/15.
 * Description:
 */

public class QuestionResponse extends ApiResult<Question> {
    Question questions;
    long curServerTimestamp;

    @Override
    public Question getData() {
        return super.getData();
    }
}
