package com.wn.common;


import com.wn.common.Const;


public class Test implements Const {

	public static void main(String[] args) throws Exception {


		/**
		 * 	1.生成公钥和私钥
		 * 	第一个参数：生成公钥的保存地址
		 * 	第二个参数：生成私钥的保存地址
		 * 	第三个参数：顶级密码（自定义/保存好不能丢失）
		 * 	执行这个test/main方法会生成私钥/公钥
		 *rsa.pri：私钥文件
		 * rsa.pub：公钥文件
		 *
		 *PUBLIC_RSA:公钥
		 *  PRIVATE_RSA：私钥
		 */
		RsaUtils.generateKey(RsaPath.PUBLIC_RSA_PATH, RsaPath.PRIVATE_RSA_PATH, "123");

	}

}
