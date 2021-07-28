package com.tian.cloudconsulpayment8002.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 拦截器
 *
 * @author 29216
 */
@Slf4j
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //登录成功之后，应该有用户的session
        Object loginuser = request.getSession().getAttribute("loginuser");

        if (loginuser == null) {
            //没有登录，而是直接进入的首页，肯定是不让进的
            request.setAttribute("msg", "没有权限，请先登录");
            request.getRequestDispatcher("/index.html").forward(request, response);
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        List<Object> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.forEach(System.out::println);
        System.out.println(list);
        log.error("许哦是！");
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.poll();
        System.out.println(queue);
        queue.peek();
        queue.add(1);
        System.out.println(queue);

    }
}
