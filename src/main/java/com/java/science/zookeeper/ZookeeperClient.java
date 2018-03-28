package com.java.science.zookeeper;

import com.java.science.utils.PropertiesUtils;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;

/**
 * @Author: aiying014
 * Created by 76409 on 10:45 2018/3/28.
 * @Description:
 */
public class ZookeeperClient {
	private static ZooKeeper client;
	private static String url;
	private static int timeOut;
	private static Watcher watcher;


	public ZookeeperClient() {

	}

	private static void initParams() {
		PropertiesUtils zookeeperPro = PropertiesUtils.getInstance("zookeeper");
		String uri = zookeeperPro.get("zookeeper.ip", "127.0.0.1");
		String port = zookeeperPro.get("zookeeper.port");
		url = uri + ":" + port;
		timeOut = zookeeperPro.getInt("zookeeper.tickTime");
		watcher = new Watcher() {
			@Override
			public void process(WatchedEvent watchedEvent) {
				System.out.println("已触发了" + watchedEvent.getType() + "事件");
			}
		};
	}

	//单例
	public static synchronized ZooKeeper getInstance() throws IOException {
		initParams();
		if (client == null) {
			client = new ZooKeeper(url, timeOut, watcher);
		}
		return client;
	}
}
