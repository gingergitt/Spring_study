package com.brms.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.brms.member.Member;
import com.brms.member.dao.MemberDao;

public class MemberRegisterService {

	@Autowired
	private MemberDao memberDao;
	
	public MemberRegisterService() { }
	
	public void register(Member member) {
		memberDao.insert(member);
	}
	
	public void initmethod() {
		System.out.println("-----------------------init method()----------------------");

	}
	
	public void destroymethod() {
		System.out.println("-------------------------destroy method()-----------------");

	}
}
