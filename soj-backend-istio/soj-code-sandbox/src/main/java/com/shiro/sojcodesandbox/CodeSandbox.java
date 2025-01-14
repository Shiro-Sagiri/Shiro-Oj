package com.shiro.sojcodesandbox;


import com.shiro.sojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.shiro.sojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
