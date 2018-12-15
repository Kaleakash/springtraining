package com;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerExecutionChain;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

public class MyClass  extends DispatcherServlet{

	@Override
	public void setDetectAllHandlerMappings(boolean detectAllHandlerMappings) {
		// TODO Auto-generated method stub
		super.setDetectAllHandlerMappings(detectAllHandlerMappings);
	}

	@Override
	public void setDetectAllHandlerAdapters(boolean detectAllHandlerAdapters) {
		// TODO Auto-generated method stub
		super.setDetectAllHandlerAdapters(detectAllHandlerAdapters);
	}

	@Override
	public void setDetectAllHandlerExceptionResolvers(boolean detectAllHandlerExceptionResolvers) {
		// TODO Auto-generated method stub
		super.setDetectAllHandlerExceptionResolvers(detectAllHandlerExceptionResolvers);
		System.out.println("------------Set Detect All Handler ----");
	}

	@Override
	public void setDetectAllViewResolvers(boolean detectAllViewResolvers) {
		// TODO Auto-generated method stub
		super.setDetectAllViewResolvers(detectAllViewResolvers);
	}

	@Override
	public void setThrowExceptionIfNoHandlerFound(boolean throwExceptionIfNoHandlerFound) {
		// TODO Auto-generated method stub
		super.setThrowExceptionIfNoHandlerFound(throwExceptionIfNoHandlerFound);
	}

	@Override
	public void setCleanupAfterInclude(boolean cleanupAfterInclude) {
		// TODO Auto-generated method stub
		super.setCleanupAfterInclude(cleanupAfterInclude);
		System.out.println("------------Set Clean up ----");
	}

	@Override
	protected void onRefresh(ApplicationContext context) {
		// TODO Auto-generated method stub
		super.onRefresh(context);
	}

	@Override
	protected void initStrategies(ApplicationContext context) {
		// TODO Auto-generated method stub
		super.initStrategies(context);
	}

	@Override
	protected <T> T getDefaultStrategy(ApplicationContext context, Class<T> strategyInterface) {
		// TODO Auto-generated method stub
		return super.getDefaultStrategy(context, strategyInterface);
	}

	@Override
	protected <T> List<T> getDefaultStrategies(ApplicationContext context, Class<T> strategyInterface) {
		// TODO Auto-generated method stub
		return super.getDefaultStrategies(context, strategyInterface);
	}

	@Override
	protected Object createDefaultStrategy(ApplicationContext context, Class<?> clazz) {
		// TODO Auto-generated method stub
		return super.createDefaultStrategy(context, clazz);
	}

	@Override
	protected void doService(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		super.doService(request, response);
	}

	@Override
	protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		super.doDispatch(request, response);
	}

	@Override
	protected LocaleContext buildLocaleContext(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return super.buildLocaleContext(request);
	}

	@Override
	protected HttpServletRequest checkMultipart(HttpServletRequest request) throws MultipartException {
		// TODO Auto-generated method stub
		return super.checkMultipart(request);
	}

	@Override
	protected void cleanupMultipart(HttpServletRequest servletRequest) {
		// TODO Auto-generated method stub
		super.cleanupMultipart(servletRequest);
	}

	@Override
	protected HandlerExecutionChain getHandler(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		return super.getHandler(request);
	}

	@Override
	protected void noHandlerFound(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		super.noHandlerFound(request, response);
	}

	@Override
	protected HandlerAdapter getHandlerAdapter(Object handler) throws ServletException {
		// TODO Auto-generated method stub
		return super.getHandlerAdapter(handler);
	}

	@Override
	protected ModelAndView processHandlerException(HttpServletRequest request, HttpServletResponse response,
			Object handler, Exception ex) throws Exception {
		// TODO Auto-generated method stub
		return super.processHandlerException(request, response, handler, ex);
	}

	@Override
	protected void render(ModelAndView mv, HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		super.render(mv, request, response);
	}

	@Override
	protected String getDefaultViewName(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		return super.getDefaultViewName(request);
	}

	@Override
	protected View resolveViewName(String viewName, Map<String, Object> model, Locale locale,
			HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		return super.resolveViewName(viewName, model, locale, request);
	}

	
}
