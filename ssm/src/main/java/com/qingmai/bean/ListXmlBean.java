package com.qingmai.bean;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ListXmlBean {
	private List<XmlBean> list;

	public List<XmlBean> getList() {
		return list;
	}

	public void setList(List<XmlBean> list) {
		this.list = list;
	}

}
