package com.dj.advice;

import com.alibaba.fastjson.JSON;
import com.dj.dto.ResultDTO;
import com.dj.exception.CustomizeErrorCode;
import com.dj.exception.CustomizeException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@ControllerAdvice
public class CustomizeExceptionHandler {
    @ExceptionHandler(Exception.class)
    ModelAndView handle(HttpServletRequest request, HttpServletResponse response,Throwable e, Model model) {

        String contentType = request.getContentType();
        if("application/json".equals(contentType)){
            ResultDTO resultDTO;
            //返回json
            if(e instanceof CustomizeException){
                resultDTO= ResultDTO.errorOf((CustomizeException) e);
            }else {
                resultDTO= ResultDTO.errorOf(CustomizeErrorCode.FATAL);
            }

            try {
                response.setContentType("application/json");
                response.setStatus(200);
                response.setCharacterEncoding("utf-8");
                PrintWriter writer = response.getWriter();
                writer.write(JSON.toJSONString(resultDTO));
                writer.close();
            } catch (IOException ioe) {

            }
            return null;
        }else {
            //错误页面跳转
            if(e instanceof CustomizeException){
                model.addAttribute("message",e.getMessage());
            }else {
                //model.addAttribute("message",CustomizeErrorCode.SYS_ERROR.getMessage());
                model.addAttribute("message",e.getMessage());
            }
            return new ModelAndView("error");
        }

    }
}
