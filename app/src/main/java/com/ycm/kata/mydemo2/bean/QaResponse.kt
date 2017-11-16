package com.ycm.kata.mydemo.bean

import com.ycm.kata.mydemo2.bean.BaseResponse
import com.ycm.kata.mydemo2.bean.Question

/**
 * Created by changmuyu on 2017/11/13.
 */
class QaResponse : BaseResponse() {
    var questions: List<Question>? = null
//    var curServerTimestamp: Long? = null
}