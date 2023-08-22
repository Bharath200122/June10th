package com.xworkz.repo;

import com.xworkz.dto.LabourDTO;

public class LabourImpl implements LabourRepo{

	private LabourDTO[] labour = new LabourDTO[NUMBER];
	private int index = 0;
	
	
	@Override
	public boolean saveandvalid(LabourDTO labour) {
		if(index<NUMBER) {
			this.labour[index]=labour;
			System.out.println(labour+"is labour data");
			this.index++;
		}
		else {
			System.err.println(labour+"is labour data");
		}
		return true;
	}

}
