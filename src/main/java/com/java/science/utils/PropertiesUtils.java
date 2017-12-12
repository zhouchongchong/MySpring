package com.java.science.utils;

import java.util.Date;
import java.util.HashMap;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * @Author: aiying014
 * Created by zcc on 18:33 2017/11/23.
 * @Description:
 */
public class PropertiesUtils {

	private static HashMap<String,PropertiesUtils> configMap = new HashMap<String, PropertiesUtils>();

	private Date loadTime = null;

	private static final String CFGNAME = "config";

	private static final Integer TIME_OUT = 60 *1000;

	private ResourceBundle resourceBundle = null;

	/**
	 * @Describe private method create singleton
	 * @param name
	 */
	private PropertiesUtils(String name) {
		this.loadTime = new Date();
		this.resourceBundle = ResourceBundle.getBundle(name);
	}
	/*
	get def config
	 */
	public static synchronized PropertiesUtils getInstance(){
		return getInstance(CFGNAME);
	}

	/**
	 * get config use name
	 *
	 * @param name
	 * @return
	 */
	public static synchronized PropertiesUtils getInstance(String name){
		PropertiesUtils conf =  configMap.get(name);
		if (conf == null){
			conf = new PropertiesUtils(name);
			configMap.put(name,conf);
		}
		// 对当前配置进行超时计算 若超时 重新加载
		if (System.currentTimeMillis() - conf.getLoadTime().getTime() > TIME_OUT){
			conf = new PropertiesUtils(name);
			configMap.put(name,conf);
		}
		return conf;
	}

	/**
	 * get string value
	 *
	 * @param key the key
	 * @return the string
	 */
	public String get(String key){
		try {
			return resourceBundle.getString(key);
		} catch (MissingResourceException e) {
			e.printStackTrace();
			return "";
		}
		}

	/**
	 * get value if value nil return default value
	 * @param key this key
	 * @param defaaltValue def value
	 * @return get value or def value
	 */
	public String get(String key,String defaultValue) {
		try {
			return this.get(key);
		} catch (Exception e) {
			e.printStackTrace();
			return defaultValue;
		}
	}

	/**
	 * get values by split with key-value nil def value
	 * @param key this key
	 * @param defaultValue def value
	 * @return key-value nil def value
	 */
	public String[] get(String key,String[] defaultValue){
		try {
			return this.get(key).split(",");
		} catch (Exception e) {
			e.printStackTrace();
			return defaultValue;
		}
	}

	/**
	 * get key-value parse integer
	 * @param key this key
	 * @return key-value nil null
	 */
	public Integer getInt(String key){
		try {
			return Integer.parseInt(this.get(key));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * get key-value nil def value
	 * @param key this key
	 * @param defaultValue this value
	 * @return kv or def
	 */
	public Integer getInt(String key,Integer defaultValue){
		try {
			return this.getInt(key);
		} catch (Exception e) {
			e.printStackTrace();
			return defaultValue;
		}
	}

	/**
	 * get kv if false rt def value
	 *
	 * @param key this key
	 * @param defaultValue def value
	 * @return true or def value
	 */
	public boolean getBool(String key,boolean defaultValue){
		try {
			String value = this.get(key);
			if (value.equals("true")){
				return true;
			}
			return defaultValue;
		} catch (Exception e) {
			e.printStackTrace();
			return defaultValue;
		}
	}

//	public String getPath(String key, String defaltValue){
//		String value = resourceBundle.getString(key)
//	}
	public Date getLoadTime(){
		return loadTime;
	}
}
