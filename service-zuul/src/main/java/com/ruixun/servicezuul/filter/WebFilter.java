package com.ruixun.servicezuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class WebFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";//配置前置过滤
    }

    @Override
    public int filterOrder() {
        return 0;//优先级，数字越大，优先级越低
    }

    @Override
    public boolean shouldFilter() {
        return true;//是否执行该过滤器
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        Object accessToken = request.getParameter("token");
        if (accessToken != null) {
            return null;
        }
        ctx.setSendZuulResponse(false);
        ctx.setResponseStatusCode(401);
        try {
            ctx.getResponse().getWriter().write("token is empty");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
