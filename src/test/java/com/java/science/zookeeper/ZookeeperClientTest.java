package com.java.science.zookeeper;

import org.apache.log4j.Logger;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.junit.Test;

import java.io.IOException;

/**
 * @Author: aiying014
 * Created by 76409 on 14:57 2018/3/28.
 * @Description:
 */
public class ZookeeperClientTest  {
	private static Logger logger = Logger.getLogger(ZookeeperClient.class);

	@Test
	public void testZookeeper() throws Exception {
//		logger.info("这是INFO");
//		logger.debug("这是DEBUG");
//		logger.error("这是ERROR");
		ZooKeeper zk = ZookeeperClient.getInstance();
		System.out.println(zk);
		// 创建一个目录节点
		zk.create("/testRootPath", "testRootData".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE,
				CreateMode.PERSISTENT);
		// 创建一个子目录节点
		zk.create("/testRootPath/testChildPathOne", "testChildDataOne".getBytes(),
				ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.PERSISTENT);
		System.out.println(new String(zk.getData("/testRootPath",false,null)));
		// 取出子目录节点列表
		System.out.println(zk.getChildren("/testRootPath",true));
		// 修改子目录节点数据
		zk.setData("/testRootPath/testChildPathOne","modifyChildDataOne".getBytes(),-1);
		System.out.println("目录节点状态：["+zk.exists("/testRootPath",true)+"]");
		// 创建另外一个子目录节点
		zk.create("/testRootPath/testChildPathTwo", "testChildDataTwo".getBytes(),
				ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.PERSISTENT);
		System.out.println(new String(zk.getData("/testRootPath/testChildPathTwo",true,null)));
		// 删除子目录节点
		zk.delete("/testRootPath/testChildPathTwo",-1);
		zk.delete("/testRootPath/testChildPathOne",-1);
		// 删除父目录节点
		zk.delete("/testRootPath",-1);
		// 关闭连接
		zk.close();
	}

}