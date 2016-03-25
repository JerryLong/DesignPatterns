package com.dralong.design.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Title:Builder
 *
 * Description:
 * 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，用来创建复合对象，所谓复合对象就是指某个类具有不同的属性，
 * 其实建造者模式就是前面抽象工厂模式和最后的Test结合起来得到的。
 * 
 * @author Jerry
 * @date 2016年3月25日下午5:28:39
 */
public class Builder {
	public List<Sender> list = new ArrayList<>();

	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}

	public void produceSmsSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}

}
