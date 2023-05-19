package com.jsp.controller;

import com.jsp.dao.BranchDao;
import com.jsp.dto.Branch;

public class SaveBranch {

	public static void main(String[] args) {

       BranchDao dao = new BranchDao();
       Branch branch = new Branch();
       branch.setName("ApolloBeed");
       branch.setEmail("aplbeed@gmail.com");
       branch.setPhone(888888888);
       Branch b = dao.saveBranch(branch, 4);
       if(branch!=null)
       {
    	 System.out.println("branch saved Successfully and id is :"+branch.getId());  
       }

	}

}
