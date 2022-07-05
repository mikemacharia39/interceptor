package com.mikehenry.interceptor.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingResponseWrapper;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Slf4j
public class RequestFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest servletRequest, HttpServletResponse servletResponse, FilterChain filterChain) throws ServletException, IOException {
        ContentCachingResponseWrapper responseCacheWrapperObject = new ContentCachingResponseWrapper(servletResponse);
        filterChain.doFilter(servletRequest, responseCacheWrapperObject);

        byte[] responseArray = responseCacheWrapperObject.getContentAsByteArray();
        String responseStr = new String(responseArray, responseCacheWrapperObject.getCharacterEncoding());

        log.info("RequestURI: {}", servletRequest.getRequestURI());
        log.info("Response to caller: {}", responseStr);

        responseCacheWrapperObject.copyBodyToResponse();
    }
}
